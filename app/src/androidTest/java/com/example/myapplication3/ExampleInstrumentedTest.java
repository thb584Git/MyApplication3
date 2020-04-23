package com.example.myapplication3;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void buttonHelloTest() {
        onView(withId(R.id.btnhello))
                .perform(click());

        onView(withId(R.id.textView))
                .check(matches(withText("hello")));
    }

    @Test
    public void buttonWorldTest() {
        onView(withId(R.id.btnworld))
                .perform(click());

        onView(withId(R.id.textView))
                .check(matches(withText("world")));
    }
}
