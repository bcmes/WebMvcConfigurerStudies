package com.github.bcmes.forum.configuration

import com.github.bcmes.forum.question.QuestionRequest
import org.springframework.core.MethodParameter
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer

class ArgumentResolverQuestionRequest : HandlerMethodArgumentResolver {
    override fun supportsParameter(parameter: MethodParameter): Boolean {
        return parameter.parameterType == QuestionRequest::class.java
    }

    override fun resolveArgument(
        parameter: MethodParameter,
        mavContainer: ModelAndViewContainer?,
        webRequest: NativeWebRequest,
        binderFactory: WebDataBinderFactory?
    ): QuestionRequest {
        return QuestionRequest("Argumento QuestionRequest dos controllers e resolvido por um HandlerMethodArgumentResolver personalizado.")
    }
}
