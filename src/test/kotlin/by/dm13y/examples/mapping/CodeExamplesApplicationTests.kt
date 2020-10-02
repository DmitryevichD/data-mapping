package by.dm13y.examples.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@SpringBootTest
@AutoConfigureMockMvc
class CodeExamplesApplicationTests {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun contextLoads() {
    }

    @Test
    fun `send all attributes in request`() {
        mockMvc.post("/") {
            contentType = MediaType.APPLICATION_JSON
            content = """{
                          "name": "MyFullName",
                          "attributes": ["attribute1"]
                      }"""
        }.andExpect {
            status { isOk }
        }
    }

    @Test
    fun `send request without attributes`() {
        mockMvc.post("/") {
            contentType = MediaType.APPLICATION_JSON
            content = """{
                      }"""
        }.andExpect {
            status { isOk }
        }
    }

    @Test
    fun `send request without attributess with validation`() {
        mockMvc.post("/validated") {
            contentType = MediaType.APPLICATION_JSON
            content = """{
                      }"""
        }.andExpect {
            status { isBadRequest }
        }
    }

    @Test
    fun `send all attributes with null`() {
        mockMvc.post("/") {
            contentType = MediaType.APPLICATION_JSON
            content = """{
                          "name": null,
                          "attributes": null
                      }"""
        }.andExpect {
            status { isOk }
        }
    }

}
