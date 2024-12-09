package org.example.program

class ProgramService {
    fun calculaNota(notas: List<Double>): Double {
        var soma: Double = 0.0
        try {
            if (notas.isEmpty()) throw Exception()
            notas.forEach { nota ->
                soma += nota
            }
            return soma
        } catch (e: Exception) {
            throw e
        }
    }
}