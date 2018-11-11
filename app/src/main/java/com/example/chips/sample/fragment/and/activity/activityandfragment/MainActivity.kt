package com.example.chips.sample.fragment.and.activity.activityandfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ButtonFragment.OnButtonClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentByTag("label_fragment") == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, newLabelFragment(0), "label_fragment")
                .commit()
        }
    }

    override fun onButtonClicked() {
        val fragment = supportFragmentManager.findFragmentByTag("label_fragment") as LabelFragment
        fragment.update()
    }
}
