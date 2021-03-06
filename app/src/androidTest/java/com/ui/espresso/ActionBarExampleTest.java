package com.ui.espresso;


import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.matcher.ViewMatchers;

import com.ui.espresso.bases.TestBase;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author  HDunn, Modified on 4/30/21.
 */
public class ActionBarExampleTest extends TestBase {

    @Test
    public void testClickOnMenuItem() {

        // From Main navigate to ActionBar
        onView(ViewMatchers.withId(R.id.action_bar_button)).perform(click());

        // Click on an item from ActionBar
        onView(withId(R.id.action_settings)).perform(click());

        // Verify the correct item was clicked by checking the content of the status TextView
        onView(withId(R.id.status)).check(matches(withText("Settings")));
    }

    @Test
    public void testOverflowMenuOrOptionsMenu() {

        // From Main navigate to ActionBar
        onView(withId(R.id.action_bar_button)).perform(click());

        // Open the action bar overflow or options menu (depending if the device has or not a hardware menu button.)
        openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext());

        // Find the menu item with text "About" and click on it
        onView(withText("About")).perform(click());

        // Verify the correct item was clicked by checking the content of the status TextView
        onView(withId(R.id.status)).check(matches(withText("About")));
    }

    @Test
    public void testActionMode() {
        // From Main navigate to ActionBar
        onView(withId(R.id.action_bar_button)).perform(click());
        
        // Show the contextual ActionBar
        onView(withId(R.id.toggle_action_mode)).perform(click());

        // Click on a context item
        onView(withId(R.id.action_one)).perform(click());

        // Verify the correct item was clicked by checking the content of the status TextView
        onView(withId(R.id.status)).check(matches(withText("ActionMode1")));
    }
}
