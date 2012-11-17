package example.withrobolectric;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.widget.Button;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class TempActivityTest {

	private TempActivity activity;
	private Button button;

	@Before
	public void setUp() throws Exception {
		activity = new TempActivity();
		activity.onCreate(null);
		button = (Button)activity.findViewById(R.id.btn);
	}

	@Test
	public void test() {
		assertThat(activity.textView.getText().toString(), not(equalTo("great")));
		button.performClick();
		assertThat(activity.textView.getText().toString(), equalTo("great"));
	}
}
