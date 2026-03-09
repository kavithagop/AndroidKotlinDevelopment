package com.example.mycoderswagapp.Services

import com.example.mycoderswagapp.Model.Category
import com.example.mycoderswagapp.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("DevSlopes Graphic Beanie", "$18", "hat01"),
        Product("DevSlopes Hat Black", "$20", "hat02"),
        Product("DevSlopes Hat White", "$18", "hat03"),
        Product("DevSlopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("DevSlopes Hoodie Gray", "$28", "hoodie01"),
        Product("DevSlopes Hoodie Red", "$32", "hoodie02"),
        Product("DevSlopes Gray Hoodie", "$28", "hoodie03"),
        Product("DevSlopes Hoodie Black", "$28", "hoodie04")
    )

    val shirts = listOf(
        Product("DevSlopes Shirt Black", "$18", "shirt01"),
        Product("DevSlopes Badge Light Gray", "$20", "shirt02"),
        Product("DevSlopes Logo Shirt Red", "$22", "shirt03"),
        Product("DevSlopes Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}