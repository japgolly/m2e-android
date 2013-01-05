package example.with_lombok;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import lombok.Getter;

public class TempActivity extends Activity {

	@Getter
	TextView textView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.temp);
		
		textView = (TextView)findViewById(R.id.txt);
	}

	public void onButton(View v) {
		getTextView().setText("great");
	}
}
