package com.ankhdigital.joinsport.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.ankhdigital.joinsport.EditProfileActivity
import com.ankhdigital.joinsport.R
import com.ankhdigital.joinsport.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            ivSettings.setOnClickListener {
                val goToEditProfile = Intent(requireContext(), EditProfileActivity::class.java)
                startActivity(goToEditProfile)
            }
            /*
            * for demo only, pls delete related code below when already connect to api*/
            icItemlistPostProfile.root.visibility = View.VISIBLE

            icItemlistPostProfile.ivPostSettings.setOnClickListener {
                popUpMenu()
            }
        }
    }

    private fun popUpMenu() {
        val popupMenu = PopupMenu(requireContext(), binding.icItemlistPostProfile.ivPostSettings)
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