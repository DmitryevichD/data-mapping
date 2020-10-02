package by.dm13y.examples.demo.mappers

import by.dm13y.examples.demo.model.dto.ResourceDto
import by.dm13y.examples.demo.model.entity.Resource
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ResourceMapper {
    fun toResourceEntity(resourceDto: ResourceDto): Resource
    fun toResourceDto(resource: Resource): ResourceDto
}