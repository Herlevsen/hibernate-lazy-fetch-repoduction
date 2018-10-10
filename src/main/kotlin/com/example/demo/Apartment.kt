package com.example.demo

import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Apartment(
        @Id
        private val id: String,
        heading: String,
        @ManyToOne(fetch = LAZY) val building: Building
) {

        var heading: String = heading
                private set

        fun updateApartment(heading: String) {
                // Check this and that
                // Yada yada

                this.heading = heading
        }
}