package com.example.androidapptub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class DevicesKitchen extends Activity {
	
	private LinearLayout layoutDevices = null;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.devices_kitchen);
		
		Intent i = getIntent();
		
		// Get the layout
		layoutDevices = (LinearLayout) findViewById(R.id.layoutScrollKitchen);
		
		// Create a button into the linear layout in this activity
		Button button1 = new Button(this);
		button1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 100));
		button1.setText("Test button 1");
		layoutDevices.addView(button1);
		
		// Create another button
		Button button2 = new Button(this);
		button2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 100));
		button2.setText("Button 2");
		layoutDevices.addView(button2);
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent accessProperties = new Intent(DevicesKitchen.this, SpecificDeviceKitchen.class);
				startActivity(accessProperties);
			}
		});
	}

}
