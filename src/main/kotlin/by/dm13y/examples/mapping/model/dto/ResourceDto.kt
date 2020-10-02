package by.dm13y.examples.demo.model.dto

import javax.validation.constraints.NotNull


/**
 *
 */
data class ResourceDto(
    @field:NotNull
    val name: String? = null,
    val attributes: List<String>? = emptyList()
)
