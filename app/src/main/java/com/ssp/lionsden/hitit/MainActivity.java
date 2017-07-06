package com.ssp.lionsden.hitit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void processHitIt(View view){
        Log.i("HitIt", "Like MJ says, hit it it it it....");

        RelativeLayout topLayout = (RelativeLayout) findViewById(R.id.topLayout);

        Random r = new Random();
        int iRandomColor = r.nextInt();

        topLayout.setBackgroundColor(iRandomColor);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
