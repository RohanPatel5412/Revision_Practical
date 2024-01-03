package com.example.revisionprecticals.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.revisionprecticals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root )

        bindClick()

    }

    private fun bindClick() {
        binding.btnLoopExample.setOnClickListener {
            startActivity(Intent(this, LoopExampleActivity::class.java))
        }
    }
}