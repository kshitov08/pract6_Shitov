package com.bignerdranch.android.pract6shitov

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class SignInFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        val etEmail = view.findViewById<EditText>(R.id.etEmail)
        val etPassword = view.findViewById<EditText>(R.id.etPassword)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isNotBlank() && password.isNotBlank()) {
                (activity as? MainActivity)?.goToMenu()
            } else {
                Toast.makeText(context, "Заполните поля", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}