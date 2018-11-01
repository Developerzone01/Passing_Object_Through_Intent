package com.example.faisalijaz.passing_object_through_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailedActivity extends AppCompatActivity {

    TextView txt_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Intent i = getIntent();
        User user = (User)i.getSerializableExtra("sampleObject");
        txt_data=findViewById(R.id.txt_data);
        txt_data.setText(user.toString());
        Toast.makeText(this,"Register Successfully", Toast.LENGTH_LONG).show();
    }
}
