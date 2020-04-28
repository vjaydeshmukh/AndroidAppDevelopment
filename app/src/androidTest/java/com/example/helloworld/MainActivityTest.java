package com.example.helloworld;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void hasTextOnScreen() {
        onView(withId(R.id.textView)).check(matches(withText(R.string.get_started)));
        onView(withId(R.id.textView1)).check(matches(withText(R.string.signup_to_continue)));
        onView(withId(R.id.signup_with)).check(matches(withText(R.string.sign_up_with)));
        onView(withId(R.id.have_account)).check(matches(withText(R.string.have_account_login)));
        onView(withId(R.id.jak_ashuraliev)).check(matches(withText(R.string.jak_ashuraliev)));
    }

    @Test
    public void canEnterUsername() {
        onView(withId(R.id.etUsername)).perform(typeText("jsmith"));
    }

    @Test
    public void canEnterFullname() {
        onView(withId(R.id.etFullname)).perform(typeText("John Smith"));
    }

    @Test
    public void canEnterEmail() {
        onView(withId(R.id.etEmail)).perform(typeText("johnsmith@hotmail.com"));
    }

    @Test
    public void canEnterPassword() {
        onView(withId(R.id.etPassword)).perform(typeText("password123"));
    }

    @Test
    public void hasButtonSignup() {
        onView(withId(R.id.signup_btn)).check(matches(withText(R.string.sign_up_btn)));
    }

    @Test
    public void selectDateClickEvent() {
        onView(withId(R.id.btnSelectDate)).perform(click());
    }


}