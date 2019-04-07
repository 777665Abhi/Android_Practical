package com.sachy.androidpractical

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sachy.androidpractical.fragment.FirstFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ClickCallBack {
    override fun click(hit: String) {
        tvCount.text=hit
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    /*TODO initial view*/
    private fun init() {
        val frag = FirstFragment()
        /*Passing Data Activity to fragment
     * with Bundle*/
        val args = Bundle()
        args.putString("data", "Fragment is here")
        frag.setArguments(args)
        // setting  click listener for Fragment
        frag.setClickListener(this)
        //Inflate the fragment
        supportFragmentManager.beginTransaction().add(R.id.frContainer, frag).commit();

    }










}
