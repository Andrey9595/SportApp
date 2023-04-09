package ru.anb.sportapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.anb.sportapp.databinding.NewsitemBinding
import ru.anb.sportapp.models.news.NewsItem

class NewsAdapter() : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {


    class NewsViewHolder(val binding: NewsitemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
    private var news: List<NewsItem> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            NewsitemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = news[position]
        with(holder.binding) {
            Glide.with(imageView)
                .load(item.img)
                .into(imageView)
            textView2.text = item.tittle
            textView3.text = item.text
            textView4.text = item.date
        }
    }

    override fun getItemCount() = news.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<NewsItem>){
        news = data
        notifyDataSetChanged()
    }
}