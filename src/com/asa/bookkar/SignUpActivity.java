package com.asa.bookkar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class SignUpActivity extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sign_up_screen);
    }
}
