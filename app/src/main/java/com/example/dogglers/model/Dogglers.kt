package com.example.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dogglers(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val age: Int,
    @StringRes val hobbies: Int
)