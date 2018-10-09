package com.example.demo

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="users")
class User(
        @Id
        private val id: String,
        private val email: String
)
