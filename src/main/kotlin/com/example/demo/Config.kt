package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Component
class Config {
    @Autowired
    private lateinit var entityManager: EntityManager

    @Autowired
    private lateinit var config: Config

    @Transactional
    fun createTestData() {
        val user1 = User("1", "bob@mail.com")
        val user2 = User("2", "joe@mail.com")

        val building1 = Building("1", "Building 1", user1)
        val building2 = Building("2", "Building 2", user2)

        val apartment1 = Apartment("1", "Apartment 1", building1)
        val apartment2 = Apartment("2", "Apartment 1", building1)
        val apartment3 = Apartment("3", "Apartment 1", building1)
        val apartment4 = Apartment("4", "Apartment 1", building2)
        val apartment5 = Apartment("5", "Apartment 1", building2)

        entityManager.persist(user1)
        entityManager.persist(user2)

        entityManager.persist(building1)
        entityManager.persist(building2)

        entityManager.persist(apartment1)
        entityManager.persist(apartment2)
        entityManager.persist(apartment3)
        entityManager.persist(apartment4)
        entityManager.persist(apartment5)

        entityManager.flush()
    }

    @PostConstruct
    fun init() {
        config.createTestData()
    }
}