package br.com.goncasthiago.semana02aula05clientemvc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private final static int TIME_SPLASH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashboard = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(dashboard);
                finish();
            }
        }, TIME_SPLASH);


    }
}
