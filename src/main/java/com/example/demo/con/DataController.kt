package com.example.demo.con

import org.springframework.web.bind.annotation.*

@RestController
class DataController {

    @GetMapping("/hello")
    fun dataController(): String {
        return "hello world kotlin"
    }
}