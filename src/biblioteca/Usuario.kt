package biblioteca

abstract class Usuario(open val nombre: String) {
    abstract fun accion(): String
}

class Estudiante(override val nombre: String) : Usuario(nombre) {
    override fun accion(): String = "$nombre está leyendo para su examen."
}

class Profesor(override val nombre: String) : Usuario(nombre) {
    override fun accion(): String = "$nombre está investigando para sus clases."
}
