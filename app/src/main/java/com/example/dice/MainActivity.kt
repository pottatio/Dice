package com.example.dice

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            rolldice()
        }
        rolldice()
    }
/** This code is the function to set up dice roll **/
    private fun rolldice() {
        val dice = Dice(6)
        val diceroll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
    when (diceroll) {
        1 -> diceImage.setImageResource(R.drawable.dice_1)
        2 -> diceImage.setImageResource(R.drawable.dice_2)
        3 -> diceImage.setImageResource(R.drawable.dice_3)
        4 -> diceImage.setImageResource(R.drawable.dice_4)
        5 -> diceImage.setImageResource(R.drawable.dice_5)
        6 -> diceImage.setImageResource(R.drawable.dice_6)
    }
    }
}
/** This is the class which has function to roll the dice **/
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}