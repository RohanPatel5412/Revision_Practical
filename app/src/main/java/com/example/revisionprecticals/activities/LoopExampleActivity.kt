package com.example.revisionprecticals.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.revisionprecticals.R
import com.example.revisionprecticals.databinding.ActivityLoopExampleBinding

class LoopExampleActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoopExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoopExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindClick()
    }

    private fun bindClick() {

    }
}