package com.example.moneyretrofit.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.moneyretrofit.R
import com.example.moneyretrofit.screens.start.StartAdapter
import com.example.moneyretrofit.screens.start.StartViewModel
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_start.view.*


class SecondFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        val v = inflater.inflate(R.layout.fragment_second, container, false)

        recyclerView = v.rv_second
        adapter = SecondAdapter()

        recyclerView.adapter = adapter
        viewModel.getBezNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner, {list ->
            list.body()?.let { adapter.setList(it) }
        })

        return v


    }


}