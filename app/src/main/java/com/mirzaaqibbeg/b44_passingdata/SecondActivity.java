package com.mirzaaqibbeg.b44_passingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

    EditText ets,et;
    String name;
    String email;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ets = (EditText) findViewById(R.id.textView3);
        et = (EditText) findViewById(R.id.textView4);
        b2 = (Button) findViewById(R.id.button2);
        Intent intent=getIntent();
        Bundle bundle = intent.getExtras();



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = getIntent();
                Bundle bn = in.getExtras();
                String name = bn.getString("name");
                String email = bn.getString("email");
                String mobile = ets.getText().toString();
                String city = et.getText().toString();

                Intent in1 = new Intent(SecondActivity.this,ThirdActivity.class);
                in1.putExtra("name",name);
                in1.putExtra("email",email);
                in1.putExtra("mobile",mobile);
                in1.putExtra("city",city);
                startActivity(in1);

            }
        });


    }
}
