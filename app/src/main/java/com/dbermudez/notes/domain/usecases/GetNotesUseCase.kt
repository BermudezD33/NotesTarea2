package com.dbermudez.notes.domain.usecases

import com.dbermudez.notes.domain.models.NoteModel
import com.dbermudez.notes.domain.repositories.NoteRepository

class GetNotesUseCase(private val noteRepository: NoteRepository) {

    fun execute(): List<NoteModel> = noteRepository.getAllNotes()
}