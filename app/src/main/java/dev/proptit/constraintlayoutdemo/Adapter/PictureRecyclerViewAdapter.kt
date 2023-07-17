package dev.proptit.constraintlayoutdemo.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import dev.proptit.constraintlayoutdemo.R

class PictureRecyclerViewAdapter(private val dataSet: Array<Int>) :
        RecyclerView.Adapter<PictureRecyclerViewAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val imageView : ImageView
        init {
            imageView = view.findViewById(R.id.imageList)
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context)
                .inflate(R.layout.layout_listpicture, p0, false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.imageView.setImageResource(dataSet[p1])
    }
}