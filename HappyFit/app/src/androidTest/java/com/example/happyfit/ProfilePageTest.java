package com.example.happyfit;

import android.app.Activity;
import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;


public class ProfilePageTest {
    @Rule
    public ActivityTestRule <ProfilePage> mActivityTestRule = new ActivityTestRule<ProfilePage>(ProfilePage.class);
    private ProfilePage mActivity=null;
    @Before
    public void setUp() throws Exception{
        mActivity=mActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View view = mActivity.findViewById(R.id.imageView);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}