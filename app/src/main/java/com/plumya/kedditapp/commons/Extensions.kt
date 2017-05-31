package com.plumya.kedditapp.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by miltomasz on 01/06/17.
 */
class Extensions {
    fun ViewGroup.inflate(layoutId: Int): View {
        return LayoutInflater.from(context).inflate(layoutId, this, false)
    }
}