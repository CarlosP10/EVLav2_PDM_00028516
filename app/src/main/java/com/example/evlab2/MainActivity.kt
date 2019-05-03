package com.example.evlab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.fragment_button_frag.*

class MainActivity : AppCompatActivity(),ButtonsHelper {

    var currentPosition = 0
    var image_frags:ArrayList<image_frag> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image_frags1 = image_frag.newInstance(R.drawable.apple,0)
        val image_frags2 = image_frag.newInstance(R.drawable.apple2,1)
        val image_frags3 = image_frag.newInstance(R.drawable.apple3,2)

        image_frags.apply {
            add(image_frags1)
            add(image_frags2)
            add(image_frags3)
        }
        supportFragmentManager.beginTransaction().add(R.id.fl_carrete,image_frags.get(0)).commit()

    }

    override fun onPrevClickListener() {
        if(currentPosition!=0){
            currentPosition--
            supportFragmentManager.beginTransaction().replace(R.id.fl_carrete, image_frags.get(currentPosition)).commit()
        }
        else{
            supportFragmentManager.beginTransaction().replace(R.id.fl_carrete, image_frags.get(2)).commit()
            currentPosition = 2
        }
    }

    override fun onNextClickListener() {
        if(currentPosition!=2){
            currentPosition++
            supportFragmentManager.beginTransaction().replace(R.id.fl_carrete, image_frags.get(currentPosition)).commit()
        }
        else{
            currentPosition= 0
            supportFragmentManager.beginTransaction().replace(R.id.fl_carrete, image_frags.get(0)).commit()
        }
    }
}
