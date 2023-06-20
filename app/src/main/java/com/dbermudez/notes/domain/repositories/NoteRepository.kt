package com.dbermudez.notes.domain.repositories

import com.dbermudez.notes.domain.models.NoteModel

interface NoteRepository {

    fun getAllNotes(): List<NoteModel>
}