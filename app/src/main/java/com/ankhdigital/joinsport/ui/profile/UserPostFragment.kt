package com.ankhdigital.joinsport.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.ankhdigital.joinsport.R
import com.ankhdigital.joinsport.databinding.ItemlistPostProfileBinding
import java.lang.Exception

class UserPostFragment : Fragment() {
    private var _binding: ItemlistPostProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = ItemlistPostProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root

        binding.apply {
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
}