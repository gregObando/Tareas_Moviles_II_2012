package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
        /* Trozo de codigo que se encarga de iniciar la actividad login usando el metodo postDelayed
         * el cual ejecuta una acción luego de un determinado periodo de tiempo. Al final el
         * splashActivity es finalizado para eviatr que cuando se use el boton bach hasta home vuelva a aparecer login
         * Hecho en parte durante el laboratorio.
         */
		 Handler handler = new Handler();
		 handler.postDelayed(new Runnable() {

			 public void run(){
				
				 startActivity(new Intent(getApplicationContext(), Login_Activity.class));
				 finish();
			 }
		 }, 3000);
		 

		
	}
}
