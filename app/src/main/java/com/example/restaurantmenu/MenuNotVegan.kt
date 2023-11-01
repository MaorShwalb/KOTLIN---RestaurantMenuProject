package com.example.restaurantmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog


class MenuNotVegan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.not_vagen_menu)

        val leftToRight = AnimationUtils.loadAnimation(applicationContext, R.anim.left_right)
        val rightToLeft = AnimationUtils.loadAnimation(applicationContext, R.anim.right_left)

        val foodToOptBtn = findViewById<ImageButton>(R.id.food_to_opt_btn)
        foodToOptBtn.startAnimation(rightToLeft)
        foodToOptBtn.setOnClickListener {
            finish()
        }



        val not_vegan1 = findViewById<Button>(R.id.not_vegan1)
        not_vegan1.startAnimation(leftToRight)
        not_vegan1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.not_vegan1, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val not_vegan2 = findViewById<Button>(R.id.not_vegan2)
        not_vegan2.startAnimation(rightToLeft)
        not_vegan2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.not_vegan2, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val not_vegan3 = findViewById<Button>(R.id.not_vegan3)
        not_vegan3.startAnimation(leftToRight)
        not_vegan3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.not_vegan3, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val vegan1 = findViewById<Button>(R.id.vegan1)
        vegan1.startAnimation(rightToLeft)
        vegan1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.vegan1, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val vegan2 = findViewById<Button>(R.id.vegan2)
        vegan2.startAnimation(leftToRight)
        vegan2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.vegan2, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val drink1 = findViewById<Button>(R.id.drink1)
        drink1.startAnimation(rightToLeft)
        drink1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.drink1, null)

            builder.setView(dialogView)
            builder.create().show()
        }


        val drink2 = findViewById<Button>(R.id.drink2)
        drink2.startAnimation(leftToRight)
        drink2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.drink2, null)

            builder.setView(dialogView)
            builder.create().show()
        }

    }
}