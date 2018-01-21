package codepath.apps.demointroandroid;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class AsyncTaskPerformActivity extends Activity {
	final int MAX_COUNT = 1000;
	private int count = 0;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_async_task_perform);
		new MyAsyncTask().execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_async_task_perform, menu);
		return true;
	}
	
	public void doneCounting() {
		Toast.makeText(this, "Done Counting to " + MAX_COUNT, Toast.LENGTH_SHORT).show();
	}

	public void executeAsyncTask() {
		new MyAsyncTask().execute();
	}

	public int getCount() {
		for (long i=0; i < MAX_COUNT; i++) {
			count++;
		}

		return count;
	}
	
	public class MyAsyncTask extends AsyncTask<Void, Void, Void> {
	     public Void doInBackground(Void... params) {
	    	for (long i=0; i < MAX_COUNT; i++) {
	    		count++;
	    		System.out.println(i);
	    	}
			return null;
	     }

	     protected void onPostExecute(Void result) {
	    	 doneCounting();
	     }
	}

}
