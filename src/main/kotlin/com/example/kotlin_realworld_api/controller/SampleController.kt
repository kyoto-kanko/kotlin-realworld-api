package com.example.kotlin_realworld_api.controller

import com.example.todoapi.controller.SampleApi
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController : SampleApi {
    override fun getSampleMessage(): ResponseEntity<String> {
        return ResponseEntity("Hello, kyoto_kanko!", HttpStatus.OK)
    }
}