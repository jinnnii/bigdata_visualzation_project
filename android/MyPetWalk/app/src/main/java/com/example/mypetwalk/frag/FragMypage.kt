package com.example.mypetwalk.frag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mypetwalk.R
import com.example.mypetwalk.databinding.FragmentFragMypageBinding
class FragMypage : Fragment() {
    lateinit var binding: FragmentFragMypageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFragMypageBinding.inflate(inflater, container, false)
        return binding.root
    }
}