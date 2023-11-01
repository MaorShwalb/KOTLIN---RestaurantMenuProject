package com.example.restaurantmenu

import android.animation.ObjectAnimator
import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Reservation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reservation)

        val reservationToOptBtn = findViewById<ImageButton>(R.id.reservation_to_opt_btn)
        reservationToOptBtn.setOnClickListener {
            finish()
        }

        val orderBtn = findViewById<Button>(R.id.order_btn)

        val alphaAnim = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
        orderBtn.startAnimation(alphaAnim)

        orderBtn.setOnClickListener {

            val inputName = findViewById<EditText>(R.id.edit_text_name)
            val inputPhone = findViewById<EditText>(R.id.edit_phone_number)
            val inputSits = findViewById<EditText>(R.id.edit_amount_of_sits)
            val inputPayment = findViewById<EditText>(R.id.edit_payment_methode)

            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("nameInput", inputName.text.toString())
                putExtra("phoneInput", inputPhone.text.toString())
                putExtra("sitsInput", inputSits.text.toString())
                putExtra("paymentInput", inputPayment.text.toString())
            }

            if((inputName.text.toString() != "") && (inputPhone.text.toString() != "") && (inputSits.text.toString() != "") && (inputPayment.text.toString() != "")){
                val toast = Toast.makeText(applicationContext, R.string.order_success, Toast.LENGTH_SHORT)
                toast.show()
                startActivity(intent)
            }else{
                val toast = Toast.makeText(applicationContext, R.string.order_failed, Toast.LENGTH_SHORT)
                toast.show()

                val color : Int = Color.rgb((255), (0), (0))
                it.setBackgroundColor(color)

                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(600)

            }
        }

    }
}