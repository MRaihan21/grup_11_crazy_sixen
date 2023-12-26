package com.mympasi.ui.settings

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mympasi.Activity.Login.LoginActivity
import com.mympasi.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvEditprofile.setOnClickListener {
                startActivity(Intent(requireContext(), EditProfileActivity::class.java))
            }
            tvEditdatabayi.setOnClickListener {
                startActivity(Intent(requireContext(), EditDataBayiActivity::class.java))
            }
            btnKeluar.setOnClickListener {
                startActivity(Intent(requireContext(), LoginActivity::class.java))
            }

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}