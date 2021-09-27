package com.example.loan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        private Button leasebutton;
        private Button loanbutton;
        private Button  calculatebutton;
        private EditText priceEdit;
        private EditText downEdit;
        private EditText interestEdit;
        private EditText lengthEdit;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leasebutton = findViewById(R.id.leasebutton);
        loanbutton = findViewById(R.id.loanbutton);
        calculatebutton = findViewById(R.id.calculatebutton);
        priceEdit = findViewById(R.id.priceEdit);
        downEdit = findViewById(R.id.downEdit);
        interestEdit = findViewById(R.id.interestEdit);
        lengthEdit = findViewById(R.id.lengthEdit);

        calculatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String price = priceEdit.getText().toString();
                int num =  Integer.parseInt(priceEdit.getText().toString());


            }
        });



    }
}