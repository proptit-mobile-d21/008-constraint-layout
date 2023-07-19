package dev.proptit.constraintlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.proptit.constraintlayoutdemo.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
    }
}