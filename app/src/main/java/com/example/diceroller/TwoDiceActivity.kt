package com.example.diceroller

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.databinding.ActivityTwodiceBinding

class TwoDiceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwodiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwodiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rollBtn = binding.rollButton
        rollBtn.text = "Let's Roll"
        rollBtn.setOnClickListener() {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt1 = (1..6).random()
        val randomInt2 = (1..6).random()
        binding.diceImageOne.setImageResource(
            when (randomInt1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
        binding.diceImageTwo.setImageResource(
            when (randomInt2) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
        binding.resultText.text = "El resultado fue: ${randomInt1 + randomInt2}"
    }
}