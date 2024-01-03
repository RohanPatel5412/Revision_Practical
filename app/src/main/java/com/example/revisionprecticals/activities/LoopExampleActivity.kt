package com.example.revisionprecticals.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.revisionprecticals.R
import com.example.revisionprecticals.databinding.ActivityLoopExampleBinding

class LoopExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoopExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoopExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindClick()

    }

    private fun bindClick() {


        binding.btnCheckLoop.setOnClickListener {
            val getData = binding.edtValue.getText().toString().toInt()
            binding.tvAnswer.setText(simpleLoop(getData))
        }
        binding.btnCheckNestedLoop.setOnClickListener {
            val getData = binding.edtValue.getText().toString().toInt()
            binding.tvAnswer.setText(nestedForLoop(getData))
        }
        binding.btnCheckNumberLoop.setOnClickListener {
            val getData = binding.edtValue.getText().toString().toInt()
            binding.tvAnswer.setText(numberForLoop(getData))
        }

    }

    private fun simpleLoop(number: Int): String {
        var sum = ""
        for (r in 1..number) {
            Log.d("TAG", "bindClick: $r")
            sum = sum.plus(r).plus("\n")
        }
        return sum
    }

    private fun nestedForLoop(number: Int):String{

        var sum = ""
        for (row in 1 .. number){
            for (column in 1..row){
                sum =sum.plus("*")
            }
            sum=sum.plus("\n")
        }

    return sum
    }
    private fun numberForLoop(number: Int):String{

        var count = 0
        var sum = ""
        for (row in 1 .. number){
            for (column in 1..row){
                count= count + 1
                if (count %2 == 0){
                    sum =sum.plus("*").plus("  ")
                }else{
                    sum =sum.plus(count).plus("  ")
                }

            }
            sum=sum.plus("\n")
        }

    return sum
    }



//    mz071789

}