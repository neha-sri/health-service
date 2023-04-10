package com.simple.healthservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table
data class HealthRecord(
    @Id var id: Long?,
    var profileId: Long?, // Can be profile but R2DBC does not support entity association
    var temperature: Double,
    var bloodPressure: Double,
    var heartRate: Double,
    var date: LocalDate
)
