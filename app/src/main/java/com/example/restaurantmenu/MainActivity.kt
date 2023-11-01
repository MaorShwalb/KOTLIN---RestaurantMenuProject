package com.example.restaurantmenu

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val upToDown = AnimationUtils.loadAnimation(applicationContext, R.anim.up_down)
        val rightToLeft = AnimationUtils.loadAnimation(applicationContext, R.anim.right_left)



        val exitBtn = findViewById<Button>(R.id.exitBtn)
        exitBtn.startAnimation(upToDown)
        exitBtn.setOnClickListener {
            val builder :AlertDialog.Builder = AlertDialog.Builder(this)
            builder.apply {
                setTitle(getString(R.string.exit))
                setMessage(getString(R.string.dialog_text))
                setCancelable(false)
                setIcon(R.drawable.ic_baseline_exit_to_app_24)
                setPositiveButton(R.string.yes) { dialog, which ->
                    finishAffinity();
                }
                setNegativeButton(R.string.no) { dialog, which ->
                }
                val dialog = builder.create()
                dialog.show()
            }
            val rotate = ObjectAnimator.ofFloat(exitBtn,"rotationY", 0f, 360f )
            rotate.duration = 1000
            rotate.start()
        }



        val mainEnterBtn = findViewById<Button>(R.id.main_enter_btn)
        mainEnterBtn.startAnimation(upToDown)
        mainEnterBtn.setOnClickListener {
            val intent = Intent(this, MainOptions::class.java)
            startActivity(intent)
        }



        val text = findViewById<TextView>(R.id.reservation_text)
        val reserveSitsBtn = findViewById<TextView>(R.id.reserve_sits_btn)
        reserveSitsBtn.startAnimation(upToDown)
        reserveSitsBtn.setOnClickListener {

            text.startAnimation(rightToLeft)

            val name:String? = intent.getStringExtra("nameInput")
            val phone:String? = intent.getStringExtra("phoneInput")
            val sits:String? = intent.getStringExtra("sitsInput")
            val payment:String? = intent.getStringExtra("paymentInput")

            val space = " "
            val new_line = ",\n"

            if (name != null) {
                text.setText(R.string.reserve_name)  //"Reservation for "
                text.append(space.toString())
                text.append(name.toString())
                text.append(new_line.toString())

                text.append(getString((R.string.reserve_phone)))  //", \nphone contact is "
                text.append(space.toString())
                text.append(phone.toString())
                text.append(new_line.toString())

                text.append(getString((R.string.reserve_amount_sits)))        //", \namount of sits "
                text.append(space.toString())
                text.append(sits.toString())
                text.append(new_line.toString())

                text.append(getString((R.string.reserve_payment)))    //", \npayment method is "
                text.append(space.toString())
                text.append(payment.toString())
                text.append(".")
            }
            else{
                text.setText(R.string.reserve_not_exist)
            }
        }



        val performedBy = findViewById<TextView>(R.id.performed_by)
        performedBy.startAnimation(upToDown)

    }
}