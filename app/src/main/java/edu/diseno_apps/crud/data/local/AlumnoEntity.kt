package edu.diseno_apps.crud.data.local


import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "alumnos")
data class AlumnoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val edad: Int,
    val email: String
)