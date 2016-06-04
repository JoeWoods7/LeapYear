package com.example.nutty.leapyear;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText yr;
    Button btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yr = (EditText)findViewById(R.id.yearBox);
        btn = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.resultBox);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 yr = (EditText)findViewById(R.id.yearBox);
                String pass = yr.getText().toString();
                Leap lp = new Leap();
                result = (TextView)findViewById(R.id.resultBox);
                try {
                    result.setText(lp.leapYear(Integer.parseInt(pass)));
                }catch (Exception e){
                    result.setText( "please enter a four digit year");
                }

            }
        });



    }

}
