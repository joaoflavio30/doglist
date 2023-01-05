package com.example.dogglers

import android.content.Context
import com.example.dogglers.adapter.DogsAdapter
import com.example.dogglers.model.Dogglers
import junit.framework.Assert.assertEquals
import org.junit.Test

import org.mockito.Mockito.mock

class UnitTest {

    private val context = mock(Context::class.java)

    @Test
    fun adapterSize() {
        val myData = listOf(
            Dogglers(
                R.drawable.leroy,
                R.string.leroy_name,
                R.string.leroy_age,
                R.string.leroy_hobbie
            ),
            Dogglers(R.drawable.nox, R.string.nox_name, R.string.nox_age, R.string.nox_hobbie)
        )
      val adapter = DogsAdapter(context,myData)

        assertEquals("Item adapter is not correct size",adapter.itemCount,myData.size)
    }
}