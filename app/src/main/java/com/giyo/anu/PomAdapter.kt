package com.giyo.anu

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PomAdapter(private val context: Activity, private val arrayList: ArrayList<User>)  :
    ArrayAdapter<User>(context, R.layout.list_item,arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_item, null)

        val imageView: ImageView = view.findViewById(R.id.pom_ava)
        val pName: TextView = view.findViewById(R.id.pom_title)
        val pSummary: TextView = view.findViewById(R.id.pom_summary)

        imageView.setImageResource(arrayList[position].pomImage)
        pName.text = arrayList[position].pomName
        pSummary.text = arrayList[position].pomSummary

        return view

    }

}