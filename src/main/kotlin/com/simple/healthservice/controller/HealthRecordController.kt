package com.simple.healthservice.controller

import com.simple.healthservice.data.HealthRecordRepository
import com.simple.healthservice.model.AverageHealthStatus
import com.simple.healthservice.model.HealthRecord
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
class HealthRecordController(val repository: HealthRecordRepository) {

    @PostMapping("/health/{profileId}/record")
    fun storeHealthRecord(@PathVariable("profileId") profileId: Long, @RequestBody record: HealthRecord):
            Mono<HealthRecord> =
        repository.save(record)

//    @GetMapping("/health/{profileId}/avg")
//    fun fetchHealthRecordAverage(@PathVariable("profileId") profileId: Long): Mono<AverageHealthStatus> =
//        repository.findByProfileId(profileId)
//            .reduce( /* logic to calculate total */)
//            .map { s ->
//                /* logic to calculate average from count and total */
//            }

}