package biblioteca

class Revista(
    override var titulo: String,
    override var autor: String,
    override var paginas: Int,
    var edicion: Int
) : Libro(titulo, autor, paginas) {

    override fun mostrarInfo() {
        println("📖 Revista: $titulo | Autor: $autor | Edición: $edicion | Páginas: $paginas")
    }
}
