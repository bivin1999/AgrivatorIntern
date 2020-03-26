package com.agrivator.agrivator_user.ui.items

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.agrivator.agrivator_user.*

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
        val buttonMed = root.findViewById<Button>(R.id.buttonMed)
        val buttonPet = root.findViewById<Button>(R.id.buttonPet)
        val buttonVeg = root.findViewById<Button>(R.id.buttonVeg)
        val buttonFru = root.findViewById<Button>(R.id.buttonFru)
        buttonGrocery.setOnClickListener {
            val intent = Intent(this.context,grocery::class.java)
            startActivity(intent)
        }
        buttonMed.setOnClickListener {
            val intent = Intent(this.context,medicines::class.java)
            startActivity(intent)
        }
        buttonPet.setOnClickListener {
            val intent = Intent(this.context,pet_supply::class.java)
            startActivity(intent)
        }
        buttonVeg.setOnClickListener {
            val intent = Intent(this.context,vegetables::class.java)
            startActivity(intent)
        }
        buttonFru.setOnClickListener {
            val intent = Intent(this.context,fruits::class.java)
            startActivity(intent)
        }
        return root
    }
}
