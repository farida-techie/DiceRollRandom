package com.malkinfo.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var roll_btn:Button
    private lateinit var resultImages:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set find Id*/
        resultImages = findViewById(R.id.dice_image)


        roll_btn = findViewById(R.id.roll_button)
        /**set Button Click*/
        roll_btn.setOnClickListener { rollDice() }
        resultImages.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        /**set Text*/
        val tvText = TextView(this)
        val remdomInt = (1..6).random()
        val darawableImages = when(remdomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        tvText.text = remdomInt.toString()
        /**set Images*/
        resultImages.setImageResource(darawableImages)

        Toast.makeText(
            this,tvText.text,
            Toast.LENGTH_SHORT
        ).show()
    }
}