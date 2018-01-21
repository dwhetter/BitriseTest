package codepath.apps.demointroandroid;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AsyncTaskPerformActivityTest {

    AsyncTaskPerformActivity asyncTaskPerformActivity;

    @Before
    public void setup() {
        asyncTaskPerformActivity = new AsyncTaskPerformActivity();
    }

    @Test
    public void testMyAsyncTask() {
        assertEquals(1000, asyncTaskPerformActivity.getCount());
    }
}
