package com.creativeitinstitute.visitingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.creativeitinstitute.visitingcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.submitInfoBtn.setOnClickListener{
            var name = binding.cardHolderName.text.toString()
            var email = binding.cardHolderEmail.text.toString()
            var mobile = binding.cardHolderMobile.text.toString()

            val intent = Intent(this@MainActivity,CardActivity::class.java)
            intent.putExtra("nm",name)
            intent.putExtra("em",email)
            intent.putExtra("mb",mobile)


            startActivity(intent)



            Log.d("TAG","Clicked.... name = $name, email = $email, mobile : $mobile")
        }
    }
}