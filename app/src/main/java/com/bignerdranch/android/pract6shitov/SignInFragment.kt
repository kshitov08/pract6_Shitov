package com.bignerdranch.android.pract6shitov

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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

        val prefs = requireContext().getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isNotBlank() && password.isNotBlank()) {

                if (password.length != 8)
                {
                    Toast.makeText(context, "Пароль должен иметь 8 символов", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                prefs.edit().putString("email", email).putString("password", password).apply()

                btnLogin.text = "Загрузка..."
                btnLogin.isEnabled = false

                Handler(Looper.getMainLooper()).postDelayed({
                    (activity as? MainActivity)?.goToMenu()
                }, 1500)

            } else {
                Toast.makeText(context, "Заполните поля", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}