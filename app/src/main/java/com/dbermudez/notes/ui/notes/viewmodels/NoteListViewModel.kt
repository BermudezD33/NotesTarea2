package com.dbermudez.notes.ui.notes.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dbermudez.notes.data.datasources.LocalNoteDataSource
import com.dbermudez.notes.data.repositories.NoteRepositoryImpl
import com.dbermudez.notes.domain.models.NoteModel
import com.dbermudez.notes.domain.repositories.NoteRepository
import com.dbermudez.notes.domain.usecases.GetNotesUseCase

class NoteListViewModel : ViewModel() {

    private val dataSource = LocalNoteDataSource()
    private val repository: NoteRepository = NoteRepositoryImpl(dataSource)
    private val getNoteUseCase = GetNotesUseCase(repository)


    private val _noteListLiveData = MutableLiveData<List<NoteModel>>()
    val noteListLiveData: LiveData<List<NoteModel>>
        get() = _noteListLiveData

    fun onViewReady() {
        val list = getNoteUseCase.execute()
        _noteListLiveData.value = list
    }

}