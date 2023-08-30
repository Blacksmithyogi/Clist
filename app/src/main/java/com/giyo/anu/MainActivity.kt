package com.giyo.anu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giyo.anu.databinding.ActivityMainBinding

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArraylist : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pomName = arrayOf(
            "Coco", "Miko", "Choki", "Pompom", "Pimpim", "Shiro"
        )

        val pomSummary = arrayOf(
            "Shih Tzu", "Shih Tzu", "Local", "Peking", "Peking", "Golden"
        )

        val pomImage= intArrayOf(

            R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.d,R.drawable.e,R.drawable.f
        )


        userArraylist = ArrayList()

        for (i in pomName.indices) {
           val user = User(pomName[i], pomSummary[i], pomImage[i])
            userArraylist.add(user)
        }

        binding.Listview.isClickable = true
        binding.Listview.adapter = PomAdapter(this, userArraylist)
        binding.Listview.setOnItemClickListener { parent, view, position, id ->
            val pName = pomName[position]
            val pSummary = pomSummary[position]
            val pImage = pomImage[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("pomName", pName)
            i.putExtra("pomSummary", pSummary)
            i.putExtra("pomImage", pImage)
            startActivity(i)
        }


        }


        }



    /*binding.Listview.isClickable = true
    binding.Listview.adapter = PomAdapter(this, userArraylist)
    binding.Listview.setOnItemClickListener{parent, view, position, id ->

        val pomName = pomName
        val pomSummary = pomSummary[position]
        val pomImage = pomImage[position]

        val i = Intent(this, UserActivity::class.java)
        i.putExtra("pomName", pomName)
        i.putExtra("pomSummary", pomSummary)
        i.putExtra("pomImage", pomImage)
    androidx.compose.foundation.layout.Box {
        startActivity(i)
    }


    } */









