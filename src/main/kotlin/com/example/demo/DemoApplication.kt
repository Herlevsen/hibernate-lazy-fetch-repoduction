package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext
import javax.persistence.EntityManager
import javax.transaction.Transactional

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    val context = runApplication<DemoApplication>(*args)
}