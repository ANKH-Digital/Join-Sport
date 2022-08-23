package com.ankhdigital.joinsport.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ankhdigital.joinsport.DetailActivity
import com.ankhdigital.joinsport.databinding.DemoFragmentHomeBinding
import com.ankhdigital.joinsport.databinding.FragmentHomeBinding
import com.ankhdigital.joinsport.databinding.ItemlistMainTimelineBinding

class HomeFragment : Fragment() {

    /*
    * for demo only, pls delete related code below when already connect to api
    * and change to FragmentHomeBinding*/

    private var _binding: DemoFragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = DemoFragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            ivPostImg.setOnClickListener{
                val goToPostDetail = Intent(requireContext(), DetailActivity::class.java)
                startActivity(goToPostDetail)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}