package com.lec.android.a008_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    InfoAdapter adapter; // Adapter 객체
    RecyclerView rv;
    EditText etName,etAge,etAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etAddress = findViewById(R.id.etAddress);
        rv = findViewById(R.id.rv);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);

        adapter = new InfoAdapter();


        rv.setAdapter(adapter);

        Button btnInsert = findViewById(R.id.btnInsert);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insert();

            }
        });
    }

    protected void Insert(){

       String name = "이름: " + etName.getText().toString();
       String age = "나이: " + etAge.getText().toString();
       String address = "주소: " + etAddress.getText().toString();

        adapter.addItem(new Info(name,age,address));
        adapter.notifyDataSetChanged();
    }


}
