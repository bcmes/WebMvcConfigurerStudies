package com.github.bcmes.forum.question

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/questions")
class QuestionController {

    @PostMapping
    fun addNewQuestion(question: QuestionRequest): QuestionResponse{
        return QuestionResponse(question.question)
    }
}