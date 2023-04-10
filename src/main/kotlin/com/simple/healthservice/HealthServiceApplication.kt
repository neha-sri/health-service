package com.simple.healthservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HealthServiceApplication

fun main(args: Array<String>) {
	runApplication<HealthServiceApplication>(*args)
}
