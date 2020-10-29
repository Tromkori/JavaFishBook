package ru.studio.javafishbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class logoActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGHT = 3000;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(logoActivity.this, MainActivity.class);
                logoActivity.this.startActivity(mainIntent);
                logoActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
        }
    public void onBackPressed() {
        super.onBackPressed();
    }
}
