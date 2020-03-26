package com.agrivator.agrivator_user.ui.create_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.agrivator.agrivator_user.R

class CreateListFragments : Fragment() {

    private lateinit var createListViewModel: CreateListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        createListViewModel =
                ViewModelProviders.of(this).get(CreateListViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_create_list, container, false)
        val textView: TextView = root.findViewById(R.id.text_order_by_store)
        createListViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
