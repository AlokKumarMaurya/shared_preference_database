package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data=editText.getText().toString();
                SharedPreferences sharedPreferences= getSharedPreferences("aaaa",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("name",data);
                editor.apply();
               textView.setText(data);

            }
        });

        SharedPreferences sp=getSharedPreferences("aaaa",MODE_PRIVATE);
        String editaa=sp.getString("name","No data set");
        textView.setText(editaa);
    }
}