package com.example.shoppinglist.domain

import android.text.BoringLayout

data class ShopItem (
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)