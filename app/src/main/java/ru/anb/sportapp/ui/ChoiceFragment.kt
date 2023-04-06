package ru.anb.sportapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import ru.anb.sportapp.R
import ru.anb.sportapp.databinding.FragmentChoiceBinding

class ChoiceFragment : Fragment() {

    private var _binding: FragmentChoiceBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChoiceBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getNews()
    }

    private fun getNews() {
        mBinding.btnNews.setOnClickListener {
            val action = ChoiceFragmentDirections.actionChoiceFragmentToNewsFragment()
            NavHostFragment.findNavController(this).navigate(action)
        }
    }
}