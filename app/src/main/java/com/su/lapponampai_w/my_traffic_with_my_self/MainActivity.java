package com.su.lapponampai_w.my_traffic_with_my_self;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttom_about;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();



        press_open_hotmail();



    }

    private void press_open_hotmail() {

        buttom_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotmail.com"));
                startActivity(i);
            }
        });



    }

    private void bindwidget() {

        buttom_about = (Button) findViewById(R.id.main_bottom);


    }
}
