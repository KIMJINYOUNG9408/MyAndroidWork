package com.lec.android.a008_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoDetail extends AppCompatActivity {

    int[] imageId = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,
            R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12};
    String [] animal = {"쥐","소","호랑이","토끼","용","뱀","말","양","원숭이","닭","개","돼지"};
    ImageView ivPhoto;
    TextView tvName,tvAge,tvAddress,tvAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_detail);
        ivPhoto = findViewById(R.id.ivPhoto);
        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvAddress = findViewById(R.id.tvAddress);
        tvAnimal = findViewById(R.id.tvAnimal);
        Intent intent = getIntent();


        Info info = (Info)intent.getSerializableExtra("info");


        tvName.setText(info.getName());
        tvAddress.setText(info.getAddress());
        tvAge.setText(info.getAge()) ;


        String a = info.getAge().trim();
        String b = a.substring(4).trim();
        int c = Integer.parseInt(b);

        int i =  13 - ( c % 12 );
        if(i>=12){
            i-=12;
        }

      ivPhoto.setImageResource(imageId[i]);
      tvAnimal.setText("당신은 " + animal[i] + "띠 입니다.");

        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}
