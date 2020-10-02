package by.dm13y.examples.mapping.mappers

import by.dm13y.examples.mapping.model.dto.ResourceDto
import by.dm13y.examples.mapping.model.entity.Resource
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ResourceMapper {
    fun toResourceEntity(resourceDto: ResourceDto): Resource
    fun toResourceDto(resource: Resource): ResourceDto
}