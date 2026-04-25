package biblioteca

fun main() {
    println("=== 📚 Biblioteca Virtual Kotlin ===\n")

    // Crear libros y revista
    val libro1 = Libro("1984", "George Orwell", 300)
    libro1.resumen = "Una novela distópica sobre el control social."
    libro1.mostrarInfo()

    val revista1 = Revista("National Geographic", "Varios", 120, 2025)
    revista1.mostrarInfo()

    // Crear usuarios
    val estudiante = Estudiante("Carlos")
    val profesor = Profesor("Laura")

    println(estudiante.accion())
    println(profesor.accion())

    // Gestionar préstamo
    val prestamo = Prestamo(libro1, estudiante)
    prestamo.prestar()
    prestamo.devolver()
}
