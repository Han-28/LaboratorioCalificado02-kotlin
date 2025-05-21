package com.castro.hector.laboratoriocalificado02

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    // Agregar contacto
    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }

    // Listar todos los contactos
    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("La agenda esta vacia.")
        } else {
            println("Contactos en la agenda:")
            contactos.forEach { println(it) }
        }
    }

    // Buscar contacto por nombre
    fun buscarContacto(nombre: String) {
        val encontrados = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (encontrados.isEmpty()) {
            println("No se encontro contacto con nombre \"$nombre\".")
        } else {
            println("Contactos encontrados:")
            encontrados.forEach { println(it) }
        }
    }
}
