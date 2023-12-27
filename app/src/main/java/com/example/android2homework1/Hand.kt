package com.example.android2homework1

object Hand {

    private var carModel: Car? = null

    fun setData(name: Car) {
        carModel = name
    }

    fun getData() = carModel
}