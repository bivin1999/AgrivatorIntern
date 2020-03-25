package com.agrivator.agrivator_user

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      /*  val buttonGrocery = findViewById<Button>(R.id.buttonGrocery)
        buttonGrocery.setOnClickListener {
            val intent = Intent(this,grocery::class.java)
            startActivity(intent)
        }
        val buttonProduct = findViewById<Button>(R.id.buttonProduct)
        buttonProduct.setOnClickListener {
            val intent = Intent(this,grocery::class.java)
            startActivity(intent)
        }*/
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_items, R.id.navigation_order, R.id.navigation_profile))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
