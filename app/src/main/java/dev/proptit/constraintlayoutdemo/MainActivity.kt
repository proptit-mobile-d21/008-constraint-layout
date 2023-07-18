package dev.proptit.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import dev.proptit.constraintlayoutdemo.Adapter.ItemRecyclerViewAdapter
import dev.proptit.constraintlayoutdemo.Adapter.PictureRecyclerViewAdapter
import dev.proptit.constraintlayoutdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val dataSet = arrayOf(
            R.drawable.gocar,
            R.drawable.banner1,
            R.drawable.gofood,
            R.drawable.banner2,
            R.drawable.banner3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initRecyclerView()
        initRecyclerView2()
        initItemRecyclerView()
        initItemRecyclerView2()

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
        val dataSet2 = arrayOf(
            R.drawable.button_corner,
            R.drawable.button_corner,
            R.drawable.button_corner,
            R.drawable.button_corner,

            )
        val dataName = arrayOf(
            "Ưu đãi sẵn trong ví",
            "Đặt nhanh đón lẹ",
            "Đổi điểm đến mới",
            "Thêm nhiều điểm đến",

            )
        val dataDescribe = arrayOf(
            "Xem mục Ưu đãi ngay",
            "Đặt là có xế, cứ thế mà vi vu. Đặt ngay",
            "Dễ dàng với một cú chạm. Thử ngay",
            "Dễ dàng thêm 4 điểm mỗi chuyến đi. Thử ngay",

            )
        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val recyclerView = binding.recyclerviewitem
        recyclerView.layoutManager = linearLayout
        val adapter = ItemRecyclerViewAdapter(dataName, dataDescribe, dataSet2)
        recyclerView.adapter = adapter
    }
    private fun initItemRecyclerView2(){
        val dataSet2 = arrayOf(
            R.drawable.button_corner,
            R.drawable.button_corner,
            R.drawable.button_corner,
            )
        val dataName = arrayOf(
            "Quán xịn Deal đỉnh",
            "Đặt nhanh giao lẹ",
            "Hẹn giờ giao món",
            )
        val dataDescribe = arrayOf(
            "Tới bữa cứ lên GoFood nha. Đặt món ngay",
            "Giao món trong vòng 30 phút. Đặt ngay!",
            "Dù bận bao nhiêu, cũng đừng bỏ bữa",

            )
        val linearLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val recyclerView = binding.recyclerviewitem2
        recyclerView.layoutManager = linearLayout
        val adapter = ItemRecyclerViewAdapter(dataName, dataDescribe, dataSet2)
        recyclerView.adapter = adapter
    }
}