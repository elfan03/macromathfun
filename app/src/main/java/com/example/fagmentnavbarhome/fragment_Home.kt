package com.example.fagmentnavbarhome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fagmentnavbarhome.databinding.FragmentHomeBinding

class fragment_Home : Fragment() {
    private var _binding:FragmentHomeBinding?=null
    private val binding get()=_binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnQuiz.setOnClickListener {
                navigateToQuiz()
            }
            btnLatihan.setOnClickListener {
                navigateToLatihan()
            }
            btnVideopembelajaran.setOnClickListener {
                navigateToVideo()
            }
        }

    }
    private fun navigateToVideo() {
        val intent=Intent(requireActivity(),activity_video::class.java)
        startActivity(intent)
    }
    private fun navigateToLatihan() {
        val intent=Intent(requireActivity(),activity_menu_latihan::class.java)
        startActivity(intent)
    }


    private fun navigateToQuiz() {
        val intent=Intent(requireActivity(),activity_menu_quiz::class.java)
        startActivity(intent)
    }

}