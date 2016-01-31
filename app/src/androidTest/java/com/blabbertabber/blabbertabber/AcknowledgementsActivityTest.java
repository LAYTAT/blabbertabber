package com.blabbertabber.blabbertabber;

//import android.support.test.rule.ActivityTestRule;

import android.support.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Created by cunnie on 8/30/15.
 * Espresso default
 */


public class AcknowledgementsActivityTest {
    private static final String TAG = "AcknowledgementsActivityTest";
    @Rule
    public IntentsTestRule<AcknowledgementsActivity> mActivityRule =
            new IntentsTestRule<AcknowledgementsActivity>(AcknowledgementsActivity.class);

    @Test
    public void buttonAckFinishTest() {
        onView(withId(R.id.button_ack_finish)).check(matches(isDisplayed()));
        onView(withId(R.id.button_ack_finish)).check(matches(isClickable()));
    }
}