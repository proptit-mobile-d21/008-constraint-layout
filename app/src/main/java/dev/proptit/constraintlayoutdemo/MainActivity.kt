package dev.proptit.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import dev.proptit.constraintlayoutdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var itemList = mutableListOf(
            Item("Ưu đãi sẵn trong ví", "Xem mục Ưu đãi ngay!", R.drawable.ad),
            Item("Đặt nhanh đón lẹ", "Đặt là có xế, cứ thế...", R.drawable.ad),
            Item("Đổi điểm gì đó với Gojeck", "Dễ dàng thay đổi điểm gì đó", R.drawable.ad)
        )

        val adapter = ItemAdapter(itemList)
        Log.d("Check", itemList[0].heading)
        binding.rvShowImage.adapter = adapter
        binding.rvShowImage.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
}