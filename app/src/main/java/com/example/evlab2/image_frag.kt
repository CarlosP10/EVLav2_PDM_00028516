package com.example.evlab2

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class image_frag : Fragment() {
    lateinit var imgPhoto: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_image_frag, container, false)
        imgPhoto = view.findViewById(R.id.iv_frag)
        imgPhoto.setImageResource(arguments!!.getInt("resource"))
        return view
    }

    companion object {

        fun newInstance(image: Int,position:Int) =
            image_frag().apply {
                arguments = Bundle().apply {
                    putInt("resource", image)
                    putInt("position",position)
                }
            }
    }

}

