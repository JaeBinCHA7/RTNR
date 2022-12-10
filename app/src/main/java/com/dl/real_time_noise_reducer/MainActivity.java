package com.dl.real_time_noise_reducer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.dl.rtnr.rtNoiseReducer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rtNoiseReducer.showToast(this, "test");
    }
}