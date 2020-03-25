package com.agrivator.agrivator_user.ui.order_by_store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.agrivator.agrivator_user.R

class OrderStoreFragments : Fragment() {

    private lateinit var orderStoreViewModel: OrderStoreViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        orderStoreViewModel =
                ViewModelProviders.of(this).get(OrderStoreViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_order_by_store, container, false)
        val textView: TextView = root.findViewById(R.id.text_order_by_store)
        orderStoreViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
