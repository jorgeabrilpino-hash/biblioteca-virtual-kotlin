package biblioteca

interface GestionPrestamo {
    fun prestar()
    fun devolver()
}

class Prestamo(val libro: Libro, val usuario: Usuario) : GestionPrestamo {
    override fun prestar() {
        println("✅ ${usuario.nombre} ha pedido prestado '${libro.titulo}'.")
    }

    override fun devolver() {
        println("↩️ ${usuario.nombre} ha devuelto '${libro.titulo}'.")
    }
}
