package com.agrivator.agrivator_user.ui.items

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.agrivator.agrivator_user.R
import com.agrivator.agrivator_user.grocery
import kotlinx.android.synthetic.main.fragment_item.*

class ItemFragment : Fragment() {

    private lateinit var itemViewModel: ItemViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        itemViewModel =
                ViewModelProviders.of(this).get(ItemViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_item, container, false)
        val buttonGrocery = root.findViewById<Button>(R.id.buttonGrocery)
        buttonGrocery.setOnClickListener {
            val intent = Intent(this.context,grocery::class.java)
            startActivity(intent)
        }
        val buttonProduct = root.findViewById<Button>(R.id.buttonProduct)
        buttonProduct.setOnClickListener {
            val intent = Intent(this.context,grocery::class.java)
            startActivity(intent)
        }
        //val textView: TextView = root.findViewById(R.id.text_item)
       // itemViewModel.text.observe(viewLifecycleOwner, Observer {
            //textView.text = it
        //})
        return root
    }
}
