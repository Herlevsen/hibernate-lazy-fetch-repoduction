package com.example.demo

import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Apartment(
        @Id
        private val id: String,
        private val heading: String,
        @ManyToOne(fetch = LAZY)
        private val building: Building
)