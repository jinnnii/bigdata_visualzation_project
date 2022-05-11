package com.example.mypetwalk.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mypetwalk.R
import com.example.mypetwalk.databinding.FragmentFragCalendarBinding

class FragCalendar : Fragment() {
    lateinit var binding: FragmentFragCalendarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFragCalendarBinding.inflate(inflater, container, false)
        return binding.root
    }}