package com.example.lab05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab05.databinding.ActivityFragmentTestBinding
import com.example.lab05.databinding.FragmentTest1Binding

class Test1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentTest1Binding.inflate(inflater,container,false)
        return binding.root
    }


}