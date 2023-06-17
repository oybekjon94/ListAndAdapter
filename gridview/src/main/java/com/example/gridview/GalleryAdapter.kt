package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.gridview.databinding.ImageLayoutBinding

class GalleryAdapter(context: Context,val imageList:ArrayList<Int>):
    ArrayAdapter<Int>(context,R.layout.image_layout){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ImageLayoutBinding = if (convertView == null){
            ImageLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        }else{
            ImageLayoutBinding.bind(convertView)
        }
        binding.imageView.setImageResource(imageList[position])
        return binding.root
    }
}