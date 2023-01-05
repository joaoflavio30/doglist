package com.example.dogglers

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class InstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun scrollTest() {

        onView(withId(R.id.recycler_view2)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(5)
        )

        onView(withText(R.string.tzeitel_hobbie)).check(matches(isDisplayed()))

    }


}