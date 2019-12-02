package com.yasserelgammal.Spring

import com.yasserelgammal.Spring.model.Hotel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface HotelRepository : CrudRepository<Hotel, Long> {
    fun findByName(name: String): List<Hotel>
}