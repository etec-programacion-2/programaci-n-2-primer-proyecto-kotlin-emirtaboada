package org.example

// Paso 1 adicional: Configuración inicial
fun main() {
    val nombre: String = "emir"
    val fecha = "22 de abril de 2025"
    println("Hola, mi nombre es $nombre")
    println("Hoy es $fecha")

    calcularAreaRectangulo()
    mostrarTiposDeDatos()

    val numero1 = 8
    println("El número $numero1 es ${esParOImpar(numero1)}")

    val numero2 = -5
    println("El número $numero2 es ${tipoDeNumero(numero2)}")

    mostrarNumerosConLoops()
    mostrarNumerosPares() // <-- Agregado aquí
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

// Paso 2 adicional: Variables y tipos de datos
fun calcularAreaRectangulo() {
    val base: Double = 7.0
    val altura: Double = 5.0
    val area: Double = base * altura

    println("Base: $base")
    println("Altura: $altura")
    println("Área del rectángulo: $area")
}

// Paso 3: Control de flujo
fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}

// Paso 3 adicional: Control de flujo
fun tipoDeNumero(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}

// Paso 4: Loops
fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }

    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }

    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}

// Paso 4 adicional: Loops
fun mostrarNumerosPares() {
    // Usando for
    println("\nNúmeros pares del 2 al 20 usando for:")
    for (i in 2..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    // Usando while
    println("\nNúmeros pares del 2 al 20 usando while:")
    var j = 2
    while (j <= 20) {
        if (j % 2 == 0) {
            println(j)
        }
        j++
    }

    // Usando do-while
    println("\nNúmeros pares del 2 al 20 usando do-while:")
    var k = 2
    do {
        if (k % 2 == 0) {
            println(k)
        }
        k++
    } while (k <= 20)
}
