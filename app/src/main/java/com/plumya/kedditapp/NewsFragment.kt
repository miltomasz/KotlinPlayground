package com.plumya.kedditapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.plumya.kedditapp.commons.Extensions

/**
 * Created by miltomasz on 31/05/17.
 */
class NewsFragment : Fragment() {
    private var newsList: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              saveInstanceState: Bundle?): View {
        val view = container?.inflate (R.layout.news_fragment, container, false)
        newsList = view.findViewById(R.id.news_list) as RecyclerView?
        newsList?.setHasFixedSize(true)
        newsList?.layoutManager = LinearLayoutManager(context)
        return view
    }
}

