package dev.proptit.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import dev.proptit.constraintlayoutdemo.Adapter.ItemRecyclerViewAdapter
import dev.proptit.constraintlayoutdemo.Adapter.PictureRecyclerViewAdapter
import dev.proptit.constraintlayoutdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val dataSet = arrayOf(
            R.drawable.banner1,
            R.drawable.banner1,
            R.drawable.banner1,
            R.drawable.banner1,
            R.drawable.banner1
    )
    private val dataSet2 = arrayOf(
        R.drawable.button_corner,
        R.drawable.button_corner,
        R.drawable.button_corner,
        R.drawable.button_corner,
        R.drawable.button_corner
    )
    private val dataName = arrayOf(
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5"
    )
    private val dataDescribe = arrayOf(
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initRecyclerView()
        initRecyclerView2()
        initItemRecyclerView()

    }
    private fun initRecyclerView(){
        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val recyclerView = binding.recyclerview
        recyclerView.layoutManager = linearLayout
        val adapter = PictureRecyclerViewAdapter(dataSet)
        recyclerView.adapter = adapter
    }
    private fun initRecyclerView2(){
        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val recyclerView = binding.recyclerview2
        recyclerView.layoutManager = linearLayout
        val adapter = PictureRecyclerViewAdapter(dataSet)
        recyclerView.adapter = adapter
    }
    private fun initItemRecyclerView(){
        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val recyclerView = binding.recyclerviewitem
        recyclerView.layoutManager = linearLayout
        val adapter = ItemRecyclerViewAdapter(dataName, dataDescribe, dataSet2)
        recyclerView.adapter = adapter
    }
}