package com.example.prctica15_pedrogc.BaseDatos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Alumnos")
class Alumnos {
    @PrimaryKey(autoGenerate = true)
    var Nombre: String = ""
    var Apellidos: String = ""
    var Curso: String = ""
}