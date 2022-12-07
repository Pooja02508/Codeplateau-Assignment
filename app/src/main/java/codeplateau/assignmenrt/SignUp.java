package codeplateau.assignmenrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    TextView itwglobal,signtext;
    Spinner organization,country;
    Button signup,employee,customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        itwglobal=findViewById(R.id.itwglobal);
        itwglobal.setText("@itwglobal.com");

        organization=findViewById(R.id.organization);
        country=findViewById(R.id.country);
        signup=findViewById(R.id.signup);
        employee=findViewById(R.id.employee);
        customer=findViewById(R.id.customer);
        signtext=findViewById(R.id.signtext);

        //Country Spinner

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(getApplicationContext(), R.array.country, android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(adapter1);

        //Organization Spinner

        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(getApplicationContext(), R.array.organizations, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        organization.setAdapter(adapter2);

        signtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),OTPActivity.class));
            }
        });

        //Employee & Customer Button click

        customer.setBackgroundResource(R.drawable.btn_bg2);
        customer.setTextColor(Color.BLACK);

        employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setBackgroundResource(R.drawable.btn_bg2);
                employee.setBackgroundResource(R.drawable.button_bg);
                employee.setTextColor(Color.WHITE);
                customer.setTextColor(Color.BLACK);
            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee.setBackgroundResource(R.drawable.btn_bg2);
                customer.setBackgroundResource(R.drawable.button_bg);
                customer.setTextColor(Color.WHITE);
                employee.setTextColor(Color.BLACK);
            }
        });


    }
}