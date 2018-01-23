package codepath.apps.demointroandroid;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class AsyncTaskPerformActivityTest {

    AsyncTaskPerformActivity asyncTaskPerformActivity;

    @Before
    public void setup() {
        asyncTaskPerformActivity = new AsyncTaskPerformActivity();
    }

    @Test
    public void testGetCount() {
        assertEquals(1000, asyncTaskPerformActivity.getCount());
    }

    @Test
    public void testDoneCounting2() {
        assertTrue(asyncTaskPerformActivity.doneCounting());
    }
}
