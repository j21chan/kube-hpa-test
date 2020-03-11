package com.worksmobile.kubetest.kubetestapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.worksmobile.kubetest")
class KubeTestAppApplication

fun main(args: Array<String>) {
    runApplication<KubeTestAppApplication>(*args)
}
