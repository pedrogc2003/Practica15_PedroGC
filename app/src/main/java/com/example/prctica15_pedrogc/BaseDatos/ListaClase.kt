package com.example.prctica15_pedrogc.BaseDatos

import androidx.room.*

@Dao
interface ListaClase {
    @Query("Select * from Alumnos ")
    fun  getAllElement(): MutableList<Alumnos>

    @Insert
    fun addElemento(taskEntity: Alumnos): Long

    @Query("Select * from Alumnos where Nombre like :Nombre")
    fun getElementoID(Nombre: Long): Alumnos

    @Update
    fun updateLista(taskEntity: Alumnos):Int

    @Delete
    fun deleteLista(taskEntity: Alumnos):Int
}