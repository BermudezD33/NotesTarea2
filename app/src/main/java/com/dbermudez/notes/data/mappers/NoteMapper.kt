package com.dbermudez.notes.data.mappers

import com.dbermudez.notes.data.mappers.TagMapper.toTag
import com.dbermudez.notes.data.models.LocalNote
import com.dbermudez.notes.domain.models.NoteModel

object NoteMapper {

    fun LocalNote.toNote(): NoteModel {
        return NoteModel(
            id = this.id,
            title = this.title,
            description = this.description,
            tag = this.tag.toTag(),
            date = this.date
        )
    }
}