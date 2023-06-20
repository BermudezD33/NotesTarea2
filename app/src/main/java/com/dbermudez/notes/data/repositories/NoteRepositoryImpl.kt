package com.dbermudez.notes.data.repositories

import com.dbermudez.notes.data.datasources.LocalNoteDataSource
import com.dbermudez.notes.data.mappers.NoteMapper.toNote
import com.dbermudez.notes.domain.models.NoteModel
import com.dbermudez.notes.domain.repositories.NoteRepository

class NoteRepositoryImpl(private val localNoteDataSource: LocalNoteDataSource) : NoteRepository {

    override fun getAllNotes(): List<NoteModel> =
        localNoteDataSource.getAllNotes()
            .map { item -> item.toNote() }
}