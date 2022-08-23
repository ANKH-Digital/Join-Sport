package com.ankhdigital.joinsport.ui.place

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ankhdigital.joinsport.DetailPlaceActivity
import com.ankhdigital.joinsport.databinding.DemoFragmentPlaceBinding
import com.ankhdigital.joinsport.databinding.ItemlistPlaceBinding

class PlaceFragment : Fragment() {

    /*
    * for demo only, pls delete related code below when already connect to api
    * and change to FragmentPlaceBinding*/

    private var _binding: DemoFragmentPlaceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = DemoFragmentPlaceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvDescription.setOnClickListener {
                val goToDetailPlace = Intent(requireContext(), DetailPlaceActivity::class.java)
                startActivity(goToDetailPlace)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}