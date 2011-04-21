package org.dyndns.pawitp.muwifiautologin;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ErrorTextView extends Activity {
	
	static final String EXTRA_CONTENT = "content";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_error);
		
		IOException e = (IOException) getIntent().getSerializableExtra(EXTRA_CONTENT);
		TextView txtStackTrace = (TextView) findViewById(R.id.text_error_txtStackTrace);
		txtStackTrace.setText(Utils.stackTraceToString(e), TextView.BufferType.NORMAL);
	}
	
}
