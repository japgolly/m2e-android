package example.withrobolectric;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import lombok.val;

public class TempActivity extends Activity {

	TextView textView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.temp);
		
		textView = (TextView)findViewById(R.id.txt);
	}

	public void onButton(View v) {
		val msg = "great";
		textView.setText(msg);
	}
}
