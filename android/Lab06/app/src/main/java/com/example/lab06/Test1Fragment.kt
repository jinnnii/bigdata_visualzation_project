package com.example.lab06

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab06.databinding.FragmentTest1Binding

class Test1Fragment : Fragment() {
    lateinit var binding:FragmentTest1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentTest1Binding.inflate(inflater, container, false)
        return binding.root
    }
}