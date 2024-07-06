package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val oneDiceBtn = binding.oneDiceButton
        oneDiceBtn.setOnClickListener() {
            goToOneDiceActivity()
            Toast.makeText(this, "One Dice", Toast.LENGTH_SHORT).show()
        }
        val twoDiceBtn = binding.twoDiceButton
        twoDiceBtn.setOnClickListener() {
            goToTwoDiceActivity()
            Toast.makeText(this, "Two Dice", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goToOneDiceActivity() {
        val intent = Intent(this, OneDiceActivity::class.java)
        startActivity(intent)
    }

    private fun goToTwoDiceActivity() {
        val intent = Intent(this, TwoDiceActivity::class.java)
        startActivity(intent)
    }

}