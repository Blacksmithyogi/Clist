package com.giyo.anu

import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class PomAdapter(
    private val context: Activity,
    private val arrayList: ArrayList<User>,
    i: Int) : ArrayAdapter<User>(context, R.layout.list_item,arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: createView(parent, position)

        val imageView: ImageView = view.findViewById(R.id.pom_ava)
        val pName: TextView = view.findViewById(R.id.pom_title)
        val pSummary: TextView = view.findViewById(R.id.pom_summary)

        imageView.setImageResource(arrayList[position].pomImage)
        pName.text = arrayList[position].pomName
        pSummary.text = arrayList[position].pomSummary

        return view

    }

    private fun createView(parent: ViewGroup, position: Int): View {
        val user = arrayList[position]

        val layoutId = when {
            user.pomName == "Coco" -> R.layout.pom_top
            user.pomName == "Shiro" -> R.layout.pom_bot

            else -> R.layout.pom_mid
        }
        return LayoutInflater.from(context).inflate(layoutId, parent, false)
    }

}