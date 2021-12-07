package com.example.myapplication321.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication321.R
import com.example.myapplication321.model.Custom

import kotlinx.android.synthetic.main.item_layout.view.*


class MyCustomAdapter(private val context: Context?, private val movieList: Custom):RecyclerView.Adapter<MyCustomAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)

        return MyViewHolder(itemView)
    }
    override fun getItemCount() : Int {
        return  movieList.data!!.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movieList = movieList.data!!.get(position)


        holder?.itemView?.textPrice?.text = movieList!!.price.toString()
        holder?.itemView?.textDate?.text = movieList!!.date.toString()
        holder?.itemView?.textID?.text = movieList!!.id
        holder?.itemView?.txtStatus?.text = movieList!!.status?.title
        holder?.itemView?.textCount?.text = movieList!!.count.toString()

        //holder?.itemView?.textStatusColor?.setTextColor(movieList!!.status.color.toString())

        //holder?.itemView1?.button2?.text = movieList!!.status.toString()

        //holder.txt_name.text = movieList[position].data.toString()
        //holder.txt_team.text = movieList[position].data.toString()
        //holder.txt_createdby.text = movieList[position].data.toString()


    }

}


