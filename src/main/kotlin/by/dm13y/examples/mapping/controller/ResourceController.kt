package by.dm13y.examples.mapping.controller

import by.dm13y.examples.mapping.mappers.ResourceMapper
import by.dm13y.examples.mapping.model.dto.ResourceDto
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ResourceController(private val resourceMapper: ResourceMapper) {

    @PostMapping
    fun doing(@RequestBody resourceDto: ResourceDto) {
        val resource = resourceMapper.toResourceEntity(resourceDto)
        println(resource)
    }

    @PostMapping("/validated")
    fun doingValidation(@Validated @RequestBody resourceDto: ResourceDto) {
        val resource = resourceMapper.toResourceEntity(resourceDto)
        println(resource)
    }
}
