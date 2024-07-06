package com.example.diceroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.databinding.ActivityOnediceBinding

class OneDiceActivity : AppCompatActivity(){
    private lateinit var binding: ActivityOnediceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnediceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rollBtn = binding.rollButton
        rollBtn.text = "Let's Roll"
        rollBtn.setOnClickListener() {
            rollDice()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {
        val randomInt = (1..6).random()
        binding.diceImage.setImageResource(
            when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
        binding.resultText.text = "El resultado fue: $randomInt"
    }
}