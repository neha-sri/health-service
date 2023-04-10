package com.simple.healthservice.data

import com.simple.healthservice.model.Profile
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfileRepository: ReactiveCrudRepository<Profile, Long>