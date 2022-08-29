package com.ankhdigital.joinsport.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.ankhdigital.joinsport.DetailActivity
import com.ankhdigital.joinsport.R
import com.ankhdigital.joinsport.databinding.DemoFragmentHomeBinding
import com.ankhdigital.joinsport.databinding.MenuActionBinding
import java.lang.Exception

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
//        val popupInflater = requireActivity().applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        val popupBind = MenuActionBinding.bind(popupInflater)
//
//        val popupWindow = PopupWindow(
//            popupBind.root, 126,
//            89, true
//        ).apply { contentView.setOnClickListener { dismiss() } }
//
//        binding.ivPostSettings.setOnClickListener(popupWindow::showAsDropDown)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            ivPostImg.setOnClickListener {
                val goToPostDetail = Intent(requireContext(), DetailActivity::class.java)
                startActivity(goToPostDetail)
            }

            ivPostSettings.setOnClickListener {
                popUpMenu()
            }
        }
    }

    private fun popUpMenu() {
        val popupMenu = PopupMenu(requireContext(), binding.ivPostSettings)
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_edit -> {
                    Toast.makeText(requireContext(), "Edited", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_delete -> {
                    Toast.makeText(requireContext(), "Deleted", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> true
            }
        }

        try {
            val popup = PopupMenu::class.java.getDeclaredField("mPopup")
            popup.isAccessible = true
            val menu = popup.get(popupMenu)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            popupMenu.show()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}