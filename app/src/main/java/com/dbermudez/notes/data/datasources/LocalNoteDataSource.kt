package com.dbermudez.notes.data.datasources

import com.dbermudez.notes.data.models.LocalNote
import com.dbermudez.notes.data.models.LocalTag

class LocalNoteDataSource {

    private val notes = mutableListOf(
        LocalNote(
            id = 1,
            title = "Android Architecture",
            description = "Enseñar la estructura de una arquitectura para una Android App",
            tag = LocalTag(
                id = 1,
                title = "Cenfotec"
            ),
            date = 1685580231
        ),
        LocalNote(
            id = 2,
            title = "Android Database",
            description = "Enseñar como montar una base de datos en Android",
            tag = LocalTag(
                id = 1,
                title = "Cenfotec"
            ),
            date = 1685580231
        ),
        LocalNote(
            id = 3,
            title = "Ordenar Cuarto",
            description = null,
            tag = LocalTag(
                id = 1,
                title = "Hogar"
            ),
            date = 1685580231
        ),
        LocalNote(
            id = 4,
            title = "Retrofit",
            description = "Enseñar como consumir servicios web desde Android usando la libreria Retrofit",
            tag = LocalTag(
                id = 1,
                title = "Cenfotec"
            ),
            date = 1685580231
        ),
    )

    fun getAllNotes(): List<LocalNote> = notes

    fun addNote(localNote: LocalNote) {
        notes.add(localNote)
    }

    fun deleteNote(id: Int) {
        notes.removeIf { note -> note.id == id }
    }

    fun updateNote(note: LocalNote) {
        val index = notes.indexOfFirst { item -> item.id == note.id }
        notes[index] = note
    }



}