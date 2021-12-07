package com.example.myapplication321

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication321.adapter.MyCustomAdapter
import com.example.myapplication321.common.Common1
import com.example.myapplication321.model.Custom
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_all_custom.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AllCustom : Fragment() {
    lateinit var layoutManager: LinearLayoutManager

    lateinit var mService: RetrofitServices1
   lateinit var adapter: MyCustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    companion object{
        @JvmStatic
        fun newInstanse() = AllCustom()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mService  = Common1.retrofitService
        recyclerMovieList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(context)
        recyclerMovieList.layoutManager = layoutManager
        getAllMovieList()
        return inflater.inflate(R.layout.fragment_all_custom, container, false)
    }
    private fun getAllMovieList() {
        mService.getMovieList().enqueue(object : Callback<Custom> {

            override fun onFailure(call: Call<Custom>, t: Throwable) {
                Log.i("Tag3", "Fail")
            }
            override fun onResponse(call: Call<Custom>, response: Response<Custom>) {
                println(response.body())
                Log.i("TAG1", response.body().toString())
                adapter = MyCustomAdapter(context, response.body() as Custom)
                adapter.notifyDataSetChanged()
                recyclerMovieList.adapter = adapter

            }
        })
    }
}
