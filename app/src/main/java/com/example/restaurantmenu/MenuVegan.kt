package com.example.restaurantmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class MenuVegan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vegan_menu)

        val leftToRight = AnimationUtils.loadAnimation(applicationContext, R.anim.left_right)
        val rightToLeft = AnimationUtils.loadAnimation(applicationContext, R.anim.right_left)

        val foodToOptBtn = findViewById<ImageButton>(R.id.food_to_opt_btn)
        foodToOptBtn.startAnimation(rightToLeft)
        foodToOptBtn.setOnClickListener {
            finish()
        }


        val vegan1 = findViewById<Button>(R.id.vegan1)
        vegan1.startAnimation(leftToRight)
        vegan1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.vegan1, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val vegan2 = findViewById<Button>(R.id.vegan2)
        vegan2.startAnimation(rightToLeft)
        vegan2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.vegan2, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val drink1 = findViewById<Button>(R.id.drink1)
        drink1.startAnimation(leftToRight)
        drink1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.drink1, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val drink2 = findViewById<Button>(R.id.drink2)
        drink2.startAnimation(rightToLeft)
        drink2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.drink2, null)

            builder.setView(dialogView)
            builder.create().show()
        }
    }
}