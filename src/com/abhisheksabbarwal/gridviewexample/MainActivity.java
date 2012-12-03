package com.abhisheksabbarwal.gridviewexample;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

	private GridView gridView;

	static final String[] characters = new String[] { "A", "B", "C", "D", "E",
			"F", "G", "H", "I", "J", "K" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Get the refernce to the GridView
		gridView = (GridView) findViewById(R.id.gridView);

		// Create the adapetr for the gridview
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, characters);

		// Set the adapter to the GridView
		gridView.setAdapter(adapter);

		// Set the Listener for the GridView entries

		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// Put up a toast for displaying the clicked value

				Toast.makeText(getApplicationContext(),
						((TextView) v).getText(), Toast.LENGTH_SHORT).show();

			}
		});

	}
}
