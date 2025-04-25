package org.example

fun main() {
    val nombre: String = "emir"
    val fecha = "22 de abril de 2025"
    println("Hola, mi nombre es $nombre")
    println("Hoy es $fecha")

    // Llamar a calcularAreaRectangulo
    calcularAreaRectangulo()

    // Llamar a mostrarTiposDeDatos
    mostrarTiposDeDatos()

    // Llamar a esParOImpar
    val numero1 = 8
    println("El número $numero1 es ${esParOImpar(numero1)}")

    // Llamar a tipoDeNumero
    val numero2 = -5
    println("El número $numero2 es ${tipoDeNumero(numero2)}")
}

// Paso 2: Variables y tipos de datos
fun mostrarTiposDeDatos() {
    val nombre: String = "Juan"
    val edad: Int = 25
    val altura: Double = 1.75
    val esEstudiante: Boolean = true

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}

// Paso 2 extra: Calcular área de rectángulo
fun calcularAreaRectangulo() {
    val base: Double = 7.0
    val altura: Double = 5.0
    val area: Double = base * altura

    println("Base: $base")
    println("Altura: $altura")
    println("Área del rectángulo: $area")
}

// Paso 3: Control de flujo - Par o impar
fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}

// Paso 3: Positivo, negativo o cero
fun tipoDeNumero(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}
