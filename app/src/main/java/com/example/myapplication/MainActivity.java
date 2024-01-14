package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText name, mark;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.txtName);
        mark=(EditText)findViewById(R.id.txtmark);
        btnSubmit = (Button)findViewById(R.id.btnSend);
        result = (TextView)findViewById(R.id.resultView);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.getText().toString().isEmpty() || mark.getText().toString().isEmpty() )
                {

                    result.setText("gfd");
                }
                else {
                    result.setText("Name -  " + name.getText().toString() + " \n" + "Mark -  " + mark.getText().toString());
                }


            }


        });
    }
}
