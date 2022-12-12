package com.example.prctica15_pedrogc.BaseDatos

import androidx.room.Database
import androidx.room.RoomDatabase

class DBLista {
    @Database(
        entities = arrayOf(ListaClase::class),
        version = 1
    )
    abstract class DBLista : RoomDatabase() {

        abstract fun listaDao(): ListaClase
    }
}