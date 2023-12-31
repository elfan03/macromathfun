package com.example.fagmentnavbarhome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fagmentnavbarhome.databinding.FragmentHomeBinding
import com.example.fagmentnavbarhome.databinding.FragmentProfilBinding

class Fragment_profil : Fragment() {

    private var _binding: FragmentProfilBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfilBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnEditprofil.setOnClickListener {
                navigateToQuiz()
            }
        }
    }
            private fun navigateToQuiz() {
                val intent= Intent(requireActivity(),activity_menu_quiz::class.java)
                startActivity(intent)
            }

        }