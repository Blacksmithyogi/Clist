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
        /*val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_item, null)*/

        val imageView: ImageView = view.findViewById(R.id.pom_ava)
        val pName: TextView = view.findViewById(R.id.pom_title)
        val pSummary: TextView = view.findViewById(R.id.pom_summary)

        imageView.setImageResource(arrayList[position].pomImage)
        pName.text = arrayList[position].pomName
        pSummary.text = arrayList[position].pomSummary
        /*if (position == 0) {
            view.setBackgroundResource(R.drawable.card_top)
        } else if (position > 0) {
            view.setBackgroundResource(R.drawable.card_middle)
        }

        // Check if it's the last item and set a specific color
        if (position == lastPosition) {
            view.setBackgroundResource(R.drawable.card_bot) // Change to your desired color
        }*/

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