package dev.proptit.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val imageList = listOf(
            "https://www.pinterest.com/pin/1004302785635569705/",
            "https://www.pinterest.com/pin/913527105650091931/",
            "https://www.pinterest.com/pin/700309810831299810/",
        )
        imageAdapter = ImageAdapter(imageList)
        recyclerView.adapter = imageAdapter
    }
}