package dev.proptit.constraintlayoutdemo.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.proptit.constraintlayoutdemo.R

class ItemRecyclerViewAdapter(private val dataName: Array<String>, private val dataDescribe : Array<String> , private val dataSet: Array<Int>) :
    RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val imageView : ImageView
        val nameItem : TextView
        val describeItem : TextView
        init {
            imageView = view.findViewById(R.id.itemImageView)
            nameItem = view.findViewById(R.id.itemNameTextView)
            describeItem = view.findViewById(R.id.itemDescriptionTextView)
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context)
            .inflate(R.layout.layout_listitem, p0, false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.imageView.setImageResource(dataSet[p1])
        p0.nameItem.text = dataName[p1]
        p0.describeItem.text = dataDescribe[p1]
    }
}