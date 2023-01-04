package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dogglers

class DataSource {

    fun loadDogs(): List<Dogglers> {

        return listOf(
            Dogglers(
                R.drawable.bella,
                R.string.bella_name,
                R.string.bella_age,
                R.string.bella_hobbie
            ),
            Dogglers(
                R.drawable.faye, R.string.faye_name, R.string.faye_age, R.string.faye_hobbie
            ),
            Dogglers(
                R.drawable.frankie,
                R.string.frankie_name,
                R.string.frankie_age,
                R.string.frankie_hobbie
            ),
            Dogglers(
                R.drawable.nox, R.string.nox_name, R.string.nox_age, R.string.nox_hobbie
            ),
            Dogglers(
                R.drawable.leroy,
                R.string.leroy_name,
                R.string.leroy_age,
                R.string.leroy_hobbie
            ),
            Dogglers(
                R.drawable.tzeitel, R.string.tzeitel_name, R.string.tzeitel_age, R.string.tzeitel_hobbie
            ),
        )

    }

}