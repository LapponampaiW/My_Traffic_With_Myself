package com.su.lapponampai_w.my_traffic_with_my_self;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button buttom_about;
    private ListView listView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();



        press_open_hotmail();

        bind_list_view();



    }

    private void bind_list_view() {

        final int[] adapints = {R.drawable.traffic_01, R.drawable.traffic_02};

        final String[] adapStringd1 = getResources().getStringArray(R.array.data1);

        final String[] adapStringd2 = {"รายละเอียดที่ 1","รายละเอียดที่ 2"};


        My_Adapter myAdapter = new My_Adapter(MainActivity.this, adapints, adapStringd1, adapStringd2);
        listView.setAdapter(myAdapter);


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
        listView = (ListView) findViewById(R.id.main_listview);


    }
}
