package com.diki.idn.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        to_second.setOnClickListener {
            val fragmentSecond = SecondFragment()
            val move = supportFragmentManager.beginTransaction()
            move.replace(R.id.fm_main, fragmentSecond)
                .addToBackStack(null) //add to back stack untuk back
                .commit()

        }
        to_option.setOnClickListener {
            val fragmentOption = OptionListenerFragment()
            val move = supportFragmentManager.beginTransaction()
            move.replace(R.id.fm_main, fragmentOption)
                .addToBackStack(null)
                .commit()
        }
    }
}
