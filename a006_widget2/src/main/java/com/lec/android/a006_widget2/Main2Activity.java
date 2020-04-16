package com.lec.android.a006_widget2;
// values 에서 new 해서 xml을 만든다음 진행.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView tvResult;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvResult = findViewById(R.id.tvResult);
        spinner1 = findViewById(R.id.spinmer1);


        // 아이템을 선택했을때 호출되는 콜백
        // position : 몇번째 item 인지, 0 ~
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) { // 특정 선택 처리
                tvResult.setText("positon : " + position + " " + parent.getItemAtPosition(position)) ;
                Toast.makeText(getApplicationContext(),(String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
            }

            @Override // 선택한거 없이 화면에서 사라질때
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(),"선택 안했어요", Toast.LENGTH_LONG).show();

            }
        });


    } // end onCreate()
} // end Activity
