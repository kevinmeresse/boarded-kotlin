package com.km.boarded.ui.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.km.boarded.R
import com.km.boarded.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        //binding.emptyView.visibility = View.GONE

        // Set toolbar title
        supportActionBar?.title = getString(R.string.title_activity_home)

        val kevinMeresse: AndroidEngineer(5)
    }
}
