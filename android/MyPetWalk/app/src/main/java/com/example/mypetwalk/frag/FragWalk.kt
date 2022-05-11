package com.example.mypetwalk.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mypetwalk.R
import com.example.mypetwalk.databinding.FragmentFragHomeBinding
import com.example.mypetwalk.databinding.FragmentFragWalkBinding

class FragWalk : Fragment() {
lateinit var binding:FragmentFragWalkBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFragWalkBinding.inflate(inflater, container, false)
        return binding.root
    }

}