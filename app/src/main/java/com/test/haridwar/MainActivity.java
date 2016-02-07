package com.test.haridwar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etUserName;
    EditText etPassword;
    Button btnLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName=(EditText)findViewById(R.id.etUserName);
        etPassword=(EditText)findViewById(R.id.etPassword);
        btnLogIn=(Button)findViewById(R.id.btnLogIn);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),etUserName.getText().toString(),Toast.LENGTH_LONG).show();
                 String _username=etUserName.getText().toString();
                String _password=etPassword.getText().toString();
                if("".equals(_username)||"".equals(_password)){
                    Toast.makeText(getApplicationContext(),"User Name & Password Required",Toast.LENGTH_LONG).show();


                }
                else{ Toast.makeText(getApplicationContext(),"hello "+_username,Toast.LENGTH_LONG).show();
                };

            }

        });
    }
}
