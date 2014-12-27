package edu.sicsr.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	private static final String TAG = "ACTIVITY LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "inside onCreate");
    }
    
    protected void onStart(){
    	super.onStart();
    	Log.e(TAG , "inside onStart");
    }
    @Override
    protected void onRestart(){
    	super.onRestart();
    	Log.w(TAG , "inside onRestart");
    }
    
    protected void onPause(){
    	super.onPause();
    	Log.v(TAG , "inside onPause");
    }

    protected void onStop(){
    	super.onStop();
    	Log.i(TAG , "inside onStop");
    }
    protected void onDestroy(){
    	super.onDestroy();
    	Log.i(TAG , "inside onDestroy");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
