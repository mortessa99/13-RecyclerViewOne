package com.example.a13_recyclerviewone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var person: ArrayList<Person>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        var txtName = itemView.findViewById<TextView>(R.id.txtName)
        var txtEmail = itemView.findViewById<TextView>(R.id.txtEmail)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var myView = LayoutInflater.from(parent.context).inflate(R.layout.person_layout,parent,false)
        return MyViewHolder(myView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtName.text = person[position].name
        holder.txtEmail.text = person[position].email
    }

    override fun getItemCount(): Int {
        return person.size
        // or return emails.size
    }




}


