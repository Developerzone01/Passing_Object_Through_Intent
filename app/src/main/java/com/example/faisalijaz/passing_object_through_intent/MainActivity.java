package com.example.faisalijaz.passing_object_through_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt_firstname;
    TextView txt_lastname;
    TextView txt_email;
    TextView txt_phoneNumber;
    TextView txt_password;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_firstname= findViewById(R.id.et_customer_username);
        btn_register= findViewById(R.id.btn_customer_registration);
        txt_lastname= findViewById(R.id.et_customer_name);
        txt_email= findViewById(R.id.et_customer_phone);
        txt_phoneNumber= findViewById(R.id.et_customer_password);
        txt_password= findViewById(R.id.et_customer_password_confirm);
        btn_register.setOnClickListener(this);

            }
    @Override
    public void onClick(View view) {

        Intent i = new Intent(MainActivity.this,DetailedActivity.class);
        User user = new User();

        user.setFirstName( txt_firstname.getText().toString());
        user.setLastName(txt_lastname.getText().toString());
        user.setEmail(txt_email.getText().toString());
        user.setPhoneNumber( Integer.parseInt(txt_phoneNumber.getText().toString()));
        user.setPassword( Integer.parseInt(txt_firstname.getText().toString()));
        i.putExtra("sampleObject",user);
        startActivity(i);
    }
}

