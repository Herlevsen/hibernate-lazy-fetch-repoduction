package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager

@RestController
class Controller {
    @Autowired
    private lateinit var entityManager: EntityManager

    @GetMapping("/test")
    fun test(): Boolean {
        entityManager.createQuery("SELECT a FROM Apartment a")
                .resultList

        return true
    }
}