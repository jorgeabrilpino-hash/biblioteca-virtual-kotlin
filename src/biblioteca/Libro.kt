package biblioteca

open class Libro(
    open var titulo: String = "Sin título",
    open var autor: String = "Desconocido",
    open var paginas: Int = 100
) {
    open var resumen: String = "Sin resumen"
        get() = field
        set(value) {
            field = if (value.isBlank()) "Resumen no disponible" else value
        }

    init {
        println("📚 Creando libro: $titulo de $autor")
    }

    open fun mostrarInfo() {
        println("Título: $titulo | Autor: $autor | Páginas: $paginas | Resumen: $resumen")
    }
}
