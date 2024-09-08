package com.example.mylogpage

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mylogpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }

    fun sign(view: View) {
        val email = binding.email.text.toString()
        val fullname = binding.fullname.text.toString()
        val username = binding.username.text.toString()
        val password = binding.password.text.toString()

        if (email != "" && fullname != "" && username != "" && password != "") {
                Toast.makeText(this, "Pendaftaran berhasil \n email = $email \n fullname = $fullname \n username = $username \n password = $password", Toast.LENGTH_SHORT).show()
            binding.email.text?.clear()
            binding.fullname.text?.clear()
            binding.username.text?.clear()
            binding.password.text?.clear()
        }else{
            Toast.makeText(this, "Harap isi semua data untuk mendaftar", Toast.LENGTH_SHORT).show()
        }



    }
}