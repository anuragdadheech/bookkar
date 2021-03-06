package com.asa.bookkar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btnSignIn;
	Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        
        btnSignIn = (Button) findViewById(R.id.btnSingIn);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        
        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		Intent i = null;
		switch(v.getId()){
			case R.id.btnSingIn:
				i = new Intent(this,LoginActivity.class);
				break;
			case R.id.btnSignUp:
				i = new Intent(this,SignUpActivity.class);
				break;
		}
		startActivity(i);
	}


    
}