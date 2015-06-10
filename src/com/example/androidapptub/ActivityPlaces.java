package com.example.androidapptub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class ActivityPlaces extends Activity {
	
	private Button button_kitchen = null;
	private ScrollView scroll_kitchen = null;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_places);
		
		Intent i = getIntent();
		
		// Get the button to access kitchen devices and affect callback to this button
		button_kitchen = (Button) findViewById(R.id.button_kitchen);
		button_kitchen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent devKitchen = new Intent(ActivityPlaces.this, DevicesKitchen.class);
				startActivity(devKitchen);
			}
		});
	}

}
