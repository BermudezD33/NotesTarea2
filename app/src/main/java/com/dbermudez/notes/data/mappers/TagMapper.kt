package com.dbermudez.notes.data.mappers

import com.dbermudez.notes.data.models.LocalTag
import com.dbermudez.notes.domain.models.TagModel

object TagMapper {

    fun LocalTag.toTag(): TagModel = TagModel(
        id = this.id,
        title = this.title
    )

}