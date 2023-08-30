package com.giyo.anu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giyo.anu.databinding.UserActivityBinding


class UserActivity : AppCompatActivity() {

    private lateinit var binding: UserActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val pomName = intent.getStringExtra("pomName")
        val pomSummary = intent.getStringExtra("pomSummary")
        val pomImage = intent.getIntExtra("pomImage",R.drawable.a)

        binding.pomTitle.text = pomName
        binding.pomSummary.text = pomSummary
        binding.pomAva.setImageResource(pomImage)


    }

   /* private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle? processErrorStateInfo: ProcessErrorStateInfo) {
        super.onCreate(savedInstanceState, persistableBundleOf())
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }*/
}