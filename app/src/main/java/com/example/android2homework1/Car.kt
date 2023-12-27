package com.example.android2homework1

import java.io.Serializable

data class Car(
    val carImage: Int,
    val name: String,
    val wheel: Int
): Serializable
