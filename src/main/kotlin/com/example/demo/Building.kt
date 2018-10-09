package com.example.demo

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Building(
        @Id
        private val id: String,
        private val heading: String,
        @ManyToOne(fetch = FetchType.LAZY)
        private val owner: User
)
