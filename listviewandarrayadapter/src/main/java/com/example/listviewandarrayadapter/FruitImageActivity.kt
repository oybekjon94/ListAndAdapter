package com.example.listviewandarrayadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.listviewandarrayadapter.databinding.ActivityFruitImageBinding
import com.example.listviewandarrayadapter.databinding.ActivityMainBinding

class FruitImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFruitImageBinding
    private val fruits = arrayListOf<String>("olma","uzum","orik","shaftoli")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position = intent.getIntExtra("position",0)

        supportActionBar?.title = fruits[position]
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        when(position){
            0 -> binding.image.setImageResource(R.drawable.apple)
            1 -> binding.image.setImageResource(R.drawable.grapes)
            2 -> binding.image.setImageResource(R.drawable.apricot)
            3 -> binding.image.setImageResource(R.drawable.peach)
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}