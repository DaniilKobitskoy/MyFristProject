package com.example.myapplication321.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication321.R
import com.example.myapplication321.model.Status
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.item_layout1.view.*


class MyCustomAdapter1(private val context: Context, private val movieList1: Status): RecyclerView.Adapter<MyCustomAdapter1.MyViewHolder>() {
    //val tag = R.string.TAG_ID_CUSTOM
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val button: Button = itemView.button2

        fun bind(movieList1: Status){

            button.setOnClickListener {

//val tag = button.getTag(R.string.TAG_ID_CUSTOM)
                Log.i("tag", button.getTag(R.string.TAG_ID_CUSTOM).toString())




            }

        }



    }
    override fun getItemCount() : Int {
        return  movieList1.data!!.count()

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView1 = LayoutInflater.from(parent.context).inflate(R.layout.item_layout1,  parent, false)

        return MyViewHolder(itemView1)

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movieList = movieList1.data!!.get(position)
        val tag : String = ""
        holder.bind(movieList1 = Status())
        holder?.button?.text = movieList!!.title
        holder?.button?.id = position
        holder?.button?.setTag(R.string.TAG_ID_CUSTOM,movieList!!.id.toString())








    }


}

