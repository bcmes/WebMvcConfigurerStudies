package com.github.bcmes.forum.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class MyWebMvcConfigurer : WebMvcConfigurer {
    /** Adiciona resolvedores de argumentos para o Controller,
     * para os tipos que nao puderam ser resolvidos.
     */
    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        resolvers.add(ArgumentResolverQuestionRequest())
    }
}