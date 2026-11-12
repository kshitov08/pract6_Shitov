package com.bignerdranch.android.pract6shitov

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MoviesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        view.findViewById<ImageView>(R.id.imgMovie1).setImageResource(R.drawable.witcher)
        view.findViewById<ImageView>(R.id.imgMovie2).setImageResource(R.drawable.jessica)
        view.findViewById<ImageView>(R.id.imgMovie3).setImageResource(R.drawable.lucifer)

        val tvTitleMovies = view.findViewById<TextView>(R.id.tvTitleMovies)
        tvTitleMovies.setOnClickListener {

            (activity as? MainActivity)?.goToMenu()
        }

        return view
    }
}