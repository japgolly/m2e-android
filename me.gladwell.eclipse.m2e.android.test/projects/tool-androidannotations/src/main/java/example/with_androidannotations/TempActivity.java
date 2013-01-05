package example.with_androidannotations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.temp)
public class TempActivity extends Activity {

	@ViewById(R.id.txt)
	TextView textView;

	@Click(R.id.btn)
	public void onButton(View v) {
		textView.setText("great");
	}
}
