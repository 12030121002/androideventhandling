package com.example.eventhandling;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
 private Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       btnClick = (Button) findViewById(R.id.btnClick);
       
       	OnClickListener listener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnClick.setText("Button was clicked");
				// TODO Auto-generated method stub	
			}
		};
		btnClick.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
