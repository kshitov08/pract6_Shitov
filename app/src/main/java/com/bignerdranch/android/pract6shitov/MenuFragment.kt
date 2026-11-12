package com.bignerdranch.android.pract6shitov

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MenuFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.findViewById<View>(R.id.btnChat1).setOnClickListener {
            (activity as? MainActivity)?.goToChats()
        }

        view.findViewById<View>(R.id.btnChat2).setOnClickListener {
            (activity as? MainActivity)?.goToChats()
        }

        view.findViewById<View>(R.id.btnFav).setOnClickListener {
            (activity as? MainActivity)?.goToMovies()
        }

        return view
    }
}