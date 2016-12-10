package com.mirzaaqibbeg.b44_passingdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity {
    CheckBox c,d,e;
    TextView tv5;
    Button b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        c = (CheckBox) findViewById(R.id.checkBox1);
        d = (CheckBox) findViewById(R.id.checkBox2);
        e = (CheckBox) findViewById(R.id.checkBox3);
        tv5 = (TextView) findViewById(R.id.textView5);
        b10 = (Button) findViewById(R.id.button3);





        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer r = new StringBuffer();
                Intent in = getIntent();
                Bundle b3 = in.getExtras();
                String name = b3.getString("name");
                String email = b3.getString("email");
                String mobile = b3.getString("mobile");
                String city = b3.getString("city");
//                r.append("Education : ").append(c.isChecked());
//                r.append("Education : ").append(d.isChecked());
//                r.append("Education : ").append(e.isChecked());


//                Toast.makeText(ThirdActivity.this, ""+name, Toast.LENGTH_SHORT).show();
//                Toast.makeText(ThirdActivity.this, ""+email, Toast.LENGTH_SHORT).show();
//                Toast.makeText(ThirdActivity.this, ""+mobile, Toast.LENGTH_SHORT).show();
//                Toast.makeText(ThirdActivity.this, ""+city, Toast.LENGTH_SHORT).show();
                if (c.isChecked()) {
                     StringBuffer result=new StringBuffer();
                    result.append("B.TECH");
                    tv5.setText(""+name + "\n" + email + "\n" + mobile + "\n" + city+"\n"+result+"");
                }
                else if (d.isChecked()) {
                    StringBuffer result1=new StringBuffer();
                    result1.append("MCA");
                    tv5.setText(""+name + "\n" + email + "\n" + mobile + "\n" + city+"\n"+result1+"");


                }
                else if (e.isChecked()) {
                    StringBuffer result2=new StringBuffer();
                    result2.append("M.TECH");
                    tv5.setText(""+name + "\n" + email + "\n" + mobile + "\n" + city+"\n"+result2+"");

                }









            }
        });
    }
}
