package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;
import com.fr4gus.android.oammblo.R.layout;
import com.fr4gus.android.oammblo.R.menu;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Login_Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login_, menu);
        return true;
    }
    
    /*
     * Metodo que se encarga de activar la actividad timeline cuando se presione el
     * boton login
     */
    public void redireccionarActividad(View view){
    	Intent intento = new Intent(this, Timeline_Activity.class);
    	startActivity(intento);
    }

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}
