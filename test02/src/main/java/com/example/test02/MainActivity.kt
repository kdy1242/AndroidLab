package com.example.test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var visibleBtn: Button
    lateinit var invisibleBtn: Button
    lateinit var logoImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        visibleBtn = findViewById(R.id.visibleBtn)
        invisibleBtn = findViewById(R.id.invisibleBtn)
        logoImageView = findViewById(R.id.logoImageView)

        visibleBtn.setOnClickListener{
            logoImageView.visibility = View.VISIBLE
        }
        invisibleBtn.setOnClickListener {
            logoImageView.visibility = View.INVISIBLE
        }

    }
}