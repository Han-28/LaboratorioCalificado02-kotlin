package com.castro.hector.laboratoriocalificado02

fun main() {

    val agenda = Agenda()
    agenda.agregarContacto(Contacto("Hanmer", "912123456", "han@mail.com"))
    agenda.agregarContacto(Contacto("Hector", "987654321", "hector@mail.com"))

    agenda.listarContactos()
    //Busqueda de contactos en la agenda que se agrega

    agenda.buscarContacto("Hanmer")
    agenda.buscarContacto("Tania")
}
