package com.castro.hector.laboratoriocalificado02

data class Contacto(
    val nombre: String,
    val telefono: String,
    val email: String
) {
    override fun toString(): String {
        return "Nombre: $nombre, Telefono: $telefono, Email: $email"
    }
}
