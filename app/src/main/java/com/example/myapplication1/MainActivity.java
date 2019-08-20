package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNo1,editTextNo2;
    Button buttonop;
    TextView textViewres;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNo1=findViewById(R.id.editText);
        editTextNo2=findViewById(R.id.editText);
        buttonop=findViewById(R.id.button);
        textViewres=findViewById(R.id.res);
       /* buttonop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Addition", Toast.LENGTH_SHORT).show();
        String s1= String.valueOf(editTextNo1.getText());
                String s2= String.valueOf(editTextNo2.getText());
                int sum= Integer.parseInt(s1)+Integer.parseInt(s2);
               // int fact=1;
               // int n=0;
                //for(int i=1;i<=n;i++){
                    //fact=fact*i;
                    //n--;

                }
                //Toast.makeText(MainActivity.this, "sum"+sum, Toast.LENGTH_SHORT).show();
            .setText(sum);

            }
        });*/


       buttonop.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {


               Toast.makeText(MainActivity.this, "Addition", Toast.LENGTH_SHORT).show();
               String s1= String.valueOf(editTextNo1.getText());
               String s2= String.valueOf(editTextNo2.getText());
               int sum= Integer.parseInt(s1)+Integer.parseInt(s2);
           }
       });
    }
}
