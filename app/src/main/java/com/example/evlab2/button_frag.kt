package com.example.evlab2

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class button_frag : Fragment() {
    lateinit var buttonsHelper: ButtonsHelper
    lateinit var btnPrev: Button
    lateinit var btnNext: Button


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        buttonsHelper = context as ButtonsHelper

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_button_frag, container, false)
        btnPrev = view.findViewById(R.id.boton_1)
        btnNext = view.findViewById(R.id.boton_2)
        btnPrev.setOnClickListener {
            buttonsHelper.onPrevClickListener()
        }
        btnNext.setOnClickListener {
            buttonsHelper.onNextClickListener()
        }

        return view
    }


}


