package com.example.maryam.digitalclock1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface seg = Typeface.createFromAsset(getAssets(),"fonts/segment7.otf");
        TextView txt2 = (TextView)findViewById(R.id.txt2);
        TextView txt4 = (TextView)findViewById(R.id.txt4);
        TextView txt6 = (TextView)findViewById(R.id.txt6);
        txt2.setTypeface(seg);
        txt4.setTypeface(seg);
        txt6.setTypeface(seg);

    }
}
