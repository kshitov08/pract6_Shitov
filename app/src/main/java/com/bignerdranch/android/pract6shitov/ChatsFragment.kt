package com.bignerdranch.android.pract6shitov

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ChatsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_chats, container, false)

        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)

        tvTitle.setOnClickListener {
            (activity as? MainActivity)?.goToMenu()
        }

        return view
    }
}