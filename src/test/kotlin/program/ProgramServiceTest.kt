package program

import org.example.program.ProgramService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ProgramServiceTest {
    private val service = ProgramService()

    @Test
    fun `calculaNota deve retornar a soma das notas`() {
        // Arrange
        val notas = listOf(8.5, 7.0, 10.0)

        // Act
        val resultado = service.calculaNota(notas)

        // Assert
        assertEquals(25.5, resultado)
    }

    @Test
    fun `calculaNota deve lancar excecao se a lista de notas estiver vazia`() {
        // Arrange
        val notas = emptyList<Double>()

        // Act & Assert
        val exception = assertThrows<Exception> {
            service.calculaNota(notas)
        }

        // Assert
        assertNotNull(exception)
    }
}