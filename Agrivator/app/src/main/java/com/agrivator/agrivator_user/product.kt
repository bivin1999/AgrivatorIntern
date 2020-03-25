package com.agrivator.agrivator_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
class product : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val buttonMed = findViewById<Button>(R.id.buttonMed)
        val buttonPet = findViewById<Button>(R.id.buttonPet)
        val buttonFruits = findViewById<Button>(R.id.buttonFruits)
        val buttonVegetables = findViewById<Button>(R.id.buttonVegetables)
        buttonMed.setOnClickListener {
            val intent = Intent(this,medicines::class.java)
            startActivity(intent)
        }
        buttonPet.setOnClickListener {
            val intent = Intent(this,pet_supply::class.java)
            startActivity(intent)
        }
        buttonFruits.setOnClickListener {
            val intent = Intent(this,fruits::class.java)
            startActivity(intent)
        }
        buttonVegetables.setOnClickListener {
            val intent = Intent(this,vegetables::class.java)
            startActivity(intent)
        }
    }
}
