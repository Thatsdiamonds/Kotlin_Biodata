package com.smkth.app1andro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.smkth.app1andro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol Instagran
        binding.btnInstagram.setOnClickListener {
            val instagramIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/andromeda.extrn"))
            startActivity(instagramIntent)
        }

        // Tombol Whatasapp
        binding.btnWhatsapp.setOnClickListener {
            val phoneNumber = "18002428478"
            val whatsappIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/$phoneNumber"))
            startActivity(whatsappIntent)
        }
    }
}