package com.estudos.controller

import com.estudos.service.StringProducerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/sendMessage")
class StringController(
    private val producerService: StringProducerService
) {

    @PostMapping
    fun sendMessage(@RequestBody message: String): ResponseEntity<Any> {
        producerService.sendMessage(message)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}