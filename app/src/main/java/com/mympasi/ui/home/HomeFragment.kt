package com.mympasi.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mympasi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvMenu612.setOnClickListener {
                startActivity(Intent(context, Menu612Activity::class.java))
            }
            tvMenu1324.setOnClickListener {
                startActivity(Intent(context, Menu1324Activity::class.java))
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}