package com.bignerdranch.android.pract6shitov

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            goToSignIn()
        }
    }

    fun goToSignIn() = replaceFragment(SignInFragment())
    fun goToMenu() = replaceFragment(MenuFragment())
    fun goToChats() = replaceFragment(ChatsFragment())
    fun goToMovies() = replaceFragment(MoviesFragment())

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}