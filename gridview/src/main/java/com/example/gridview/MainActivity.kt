package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imageList = arrayListOf<Int>(
        R.drawable.apple,
        R.drawable.apricot,
        R.drawable.grapes,
        R.drawable.peach,
        R.drawable.apple,
        R.drawable.apricot,
        R.drawable.grapes,
        R.drawable.peach,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GalleryAdapter(context = this,imageList)
        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,"$position tanlandi", Toast.LENGTH_SHORT).show()
        }
    }
}