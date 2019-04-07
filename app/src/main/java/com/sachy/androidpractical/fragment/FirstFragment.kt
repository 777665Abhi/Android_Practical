package com.sachy.androidpractical.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.sachy.androidpractical.R
import kotlinx.android.synthetic.main.fragment_first.*
import com.sachy.androidpractical.ClickCallBack


class FirstFragment() : Fragment(), View.OnClickListener {

    var callback: ClickCallBack? = null
    var btCount: Button? = null
    var tittle: String = "tittle"
    var hit: Int = 0
    fun setClickListener(callback: ClickCallBack) {
        this.callback = callback
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_first, container, false)
        btCount=view.findViewById(R.id.btCount)
        btCount!!.setOnClickListener(this)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tittle = getArguments()!!.getString("data");
        tvData.text = tittle
    }

    //TODO onClick
    override fun onClick(view: View?) {
        when (view) {
            btCount -> {
                hit = hit + 1
                callback!!.click("Total HIt : $hit")
            }
        }
    }
}
