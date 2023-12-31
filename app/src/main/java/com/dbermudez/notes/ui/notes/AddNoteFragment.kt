package com.dbermudez.notes.ui.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dbermudez.notes.R
import com.dbermudez.notes.domain.models.NoteModel
import com.dbermudez.notes.ui.notes.adapters.NoteListAdapter
import com.dbermudez.notes.ui.notes.viewmodels.NoteListViewModel

class AddNoteFragment : Fragment() {

    private lateinit var viewModel: NoteListViewModel
    private lateinit  var notesRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_note, container, false)
       // initViews(view)
        viewModel = ViewModelProvider(this)[NoteListViewModel::class.java]
        //observe()
        return view
    }

//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        viewModel.onViewReady()
//
//    }
//
//    private fun initViews(view: View) {
//        with(view) {
//            notesRecyclerView = findViewById(R.id.notes_list)
//            notesRecyclerView.adapter = adapter
//            notesRecyclerView.addItemDecoration(
//                DividerItemDecoration(
//                    context,
//                    RecyclerView.VERTICAL
//                )
//            )
//            notesRecyclerView.layoutManager =
//                LinearLayoutManager(context, RecyclerView.VERTICAL, false)
//        }
//    }

//    private fun observe() {
//        viewModel.noteListLiveData.observe(viewLifecycleOwner) { list ->
//            adapter.setData(list)
//        }
//    }


//    private fun onListItemClicked(noteModel: NoteModel) {
//        Toast.makeText(context, "${noteModel.title} was clicked", Toast.LENGTH_LONG).show()
//    }


}