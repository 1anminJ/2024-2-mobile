package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

// p83, 코틀린 코드와 레이아웃 연결하기

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // 04
        val binding = ActivityMainBinding.inflate(layoutInflater)

        // 05
        // setContentView(R.layout.activity_main)
        setContentView(binding.root)

        // 06, 07
        binding.btnSay.setOnClickListener{
            binding.textSay.text = "Hello Kotlin!!"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}