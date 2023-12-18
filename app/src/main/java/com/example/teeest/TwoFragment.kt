package com.example.teeest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teeest.databinding.FragmentTwoBinding
// fragment는 앱 이름 (package 이름) 이며
// FragmentBlankBinding 은 "[해당 Fragment의 이름] + Binding" 이다.

class TwoFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 파일 이름
        val binding = FragmentTwoBinding.inflate(layoutInflater)
        return binding.root
    }
}