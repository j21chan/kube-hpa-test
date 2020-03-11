package com.worksmobile.kubetest.kubetestapp

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    private val log: Logger = LoggerFactory.getLogger(TestController::class.java)

    @GetMapping("/test")
    fun test(): String {
        log.info("Hello world!")
        return "Hello world!";
    }
}