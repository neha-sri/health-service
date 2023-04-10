package com.simple.healthservice.model

data class AverageHealthStatus(
    var cnt: Int,
    var temperature: Double,
    var bloodPressure: Double,
    var heartRate: Double
)