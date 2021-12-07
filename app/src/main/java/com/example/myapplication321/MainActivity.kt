package com.example.myapplication321

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication321.adapter.MyCustomAdapter
import com.example.myapplication321.adapter.MyCustomAdapter1
//import com.example.myapplication321.adapter.MyCustomAdapter1
import com.example.myapplication321.common.Common1
import com.example.myapplication321.common.Common2
import com.example.myapplication321.common.Common3
import com.example.myapplication321.model.Custom
import com.example.myapplication321.model.Status
//import com.example.myapplication321.common.Common2

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.recyclerMovieList2
import kotlinx.android.synthetic.main.fragment_all_custom.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlinx.android.synthetic.main.item_layout.*


class MainActivity : AppCompatActivity() {

//    lateinit var mService: RetrofitServices1
//    lateinit var mService2: RetrofitServices2
    lateinit var mService3: RetrofitServices3
    lateinit var layoutManager: LinearLayoutManager
    lateinit var layoutManager2: LinearLayoutManager
    //lateinit var adapter: MyCustomAdapter
    lateinit var adapter1: MyCustomAdapter1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, AllCustom())
            .commit()

//        mService = Common1.retrofitService
//       mService2 = Common2.retrofitService
       mService3 = Common3.retrofitService

        layoutManager = LinearLayoutManager(this)
        layoutManager2 = LinearLayoutManager(this)

        recyclerMovieList2.layoutManager = layoutManager2
        //getAllMovieList()
        getAllMovieList3()
    }

    private fun getAllMovieList3() {
        mService3.getMovieList3().enqueue(object : Callback<Status> {
            override fun onResponse(call: Call<Status>, response: Response<Status>) {
                adapter1 = MyCustomAdapter1(baseContext, response.body() as Status)
                adapter1.notifyDataSetChanged()
                println(findViewById(R.id.button2))
                Log.i("TAG2", response.body().toString())
                // adapter1.setOnClickListener(object : MyCustomAdapter1.onItemClickListener{
//                    override fun onItemClick(position: Int) {
//                        Toast.makeText(())
//                    }
//                })
                recyclerMovieList2.adapter = adapter1
                recyclerMovieList2.layoutManager =
                    LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            }

            override fun onFailure(call: Call<Status>, t: Throwable) {
                val toast = Toast.makeText(this@MainActivity, "vvvv", Toast.LENGTH_SHORT).show()
            }

//            set tag
        })

    }


//    private fun getAllMovieList() {
//
//        mService.getMovieList().enqueue(object : Callback<Custom> {
//
//            override fun onFailure(call: Call<Custom>, t: Throwable) {
//
//                val toast = Toast.makeText(this@MainActivity, "vvvv", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onResponse(call: Call<Custom>, response: Response<Custom>) {
//                println(response.body())
//                Log.i("TAG1", response.body().toString())
//                adapter = MyCustomAdapter(baseContext, response.body() as Custom)
//                adapter.notifyDataSetChanged()
//                recyclerMovieList.adapter = adapter
//
//            }
//        })
//    }

//    private fun getAllMovieList1() {
//val linearLayout = findViewById<ConstraintLayout>(R.id.linearLayout)
//            mService2.getMovieList1("${txt_createdby.text}").enqueue(object : Callback<Custom>{
//                override fun onResponse(call: Call<Custom>, response: Response<Custom>) {
//                    Log.i("TAG2", response.body().toString())
//
//                }
//
//                override fun onFailure(call: Call<Custom>, t: Throwable) {
//                    TODO("Not yet implemented")
//                }
//
//            })
//
//
//    }


}








