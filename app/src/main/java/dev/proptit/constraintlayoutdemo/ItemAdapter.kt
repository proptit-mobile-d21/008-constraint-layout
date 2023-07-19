package dev.proptit.constraintlayoutdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import dev.proptit.constraintlayoutdemo.databinding.ItemViewBinding

class ItemAdapter(
    var items: List<Item>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemViewBinding.inflate(layoutInflater, parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.apply {
            tvHeading.text = items[position].heading
            tvCmt.text = items[position].comment
            ivPic.setImageResource(items[position].image)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}