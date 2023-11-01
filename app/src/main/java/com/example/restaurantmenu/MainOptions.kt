package com.example.restaurantmenu

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SwitchCompat
import java.util.*


class MainOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_options)

        val rightToLeft = AnimationUtils.loadAnimation(applicationContext, R.anim.right_left)

        val optBackBtn = findViewById<ImageButton>(R.id.opt_to_menu_btn)
        optBackBtn.startAnimation(rightToLeft)
        optBackBtn.setOnClickListener {
            finish()
        }



        val mainMenuBtn = findViewById<Button>(R.id.main_menu_btn)
        mainMenuBtn.startAnimation(rightToLeft)
        mainMenuBtn.setOnClickListener {
            val intent = Intent(this, MenuNotVegan::class.java)
            startActivity(intent)
        }



        val veganSwitch: SwitchCompat = findViewById(R.id.veganSwitch)
        veganSwitch.startAnimation(rightToLeft)
        veganSwitch.setOnCheckedChangeListener { compoundButton, vegan ->
            mainMenuBtn.setOnClickListener {
                if (vegan) {
                    val intent = Intent(this, MenuVegan::class.java)
                    startActivity(intent)
                } else {
                    val intent = Intent(this, MenuNotVegan::class.java)
                    startActivity(intent)
                }
            }
        }



        val reservationBtn = findViewById<Button>(R.id.reservation_btn)
        reservationBtn.startAnimation(rightToLeft)
        reservationBtn.setOnClickListener {
            val intent = Intent(this, Reservation::class.java)
            startActivity(intent)
        }


    }
}
