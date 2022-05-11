package com.example.mypetwalk.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mypetwalk.R
import com.example.mypetwalk.databinding.FragmentFragCalendarBinding
import com.example.mypetwalk.databinding.FragmentFragHomeBinding


class FragHome : Fragment() {
    lateinit var binding:FragmentFragHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFragHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

}