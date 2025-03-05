package com.example.icetask2_st10069618

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.icetask2_st10069618.databinding.ActivityMain2Binding // Correct ViewBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding // Correct binding name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater) // Use correct binding
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            val username = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            val confirmPassword = binding.etConfirmPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // TODO: Handle user registration (Firebase Authentication / Local Storage)
            Toast.makeText(this, "User Registered Successfully", Toast.LENGTH_SHORT).show()

            
        }
    }
}
