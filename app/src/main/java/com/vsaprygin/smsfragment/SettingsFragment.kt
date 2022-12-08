package com.vsaprygin.smsfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.vsaprygin.smsfragment.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.advansedBtn.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_settingsFragment_to_advansedFragment)
        }
        binding.viewBtn.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_settingsFragment_to_viewFragment)
        }
        binding.exitBtn.setOnClickListener {
            binding.codeSMS.text = "А теперь любую другую"
        }
    }
}