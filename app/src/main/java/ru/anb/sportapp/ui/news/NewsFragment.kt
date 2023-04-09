package ru.anb.sportapp.ui.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import ru.anb.sportapp.App
import ru.anb.sportapp.adapter.NewsAdapter
import ru.anb.sportapp.api.ApiResult
import ru.anb.sportapp.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null
    private val mBinding get() = _binding!!
    private val newsAdapter: NewsAdapter = NewsAdapter()
    private lateinit var  viewModel : ViewModelNews

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewsBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity?.application as App).provideViewModel(ViewModelNews::class.java, this)
        mBinding.newsAdapter.adapter = newsAdapter
        viewModel.liveData.observe(requireActivity()) {
            if (it is ApiResult.Success && it.data != null) {
                newsAdapter.setData(it.data)
            } else {
                Toast.makeText(requireContext(), it.errorMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}