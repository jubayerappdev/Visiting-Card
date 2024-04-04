package com.creativeitinstitute.visitingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.creativeitinstitute.visitingcard.databinding.LayoutCardBinding

class CardActivity : AppCompatActivity() {
    lateinit var binding: LayoutCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = LayoutCardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.name.text = intent.getStringExtra("nm")
        binding.email.text = intent.getStringExtra("em")
        binding.mobile.text = intent.getStringExtra("mb")
        
    }
}