package com.example.a003_listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText cal_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button cal_btn0 = findViewById(R.id.cal_btn0);
        Button cal_btn1 = findViewById(R.id.cal_btn1);
        Button cal_btn2 = findViewById(R.id.cal_btn2);
        Button cal_btn3 = findViewById(R.id.cal_btn3);
        Button cal_btn4 = findViewById(R.id.cal_btn4);
        Button cal_btn5 = findViewById(R.id.cal_btn5);
        Button cal_btn6 = findViewById(R.id.cal_btn6);
        Button cal_btn7 = findViewById(R.id.cal_btn7);
        Button cal_btn8 = findViewById(R.id.cal_btn8);
        Button cal_btn9 = findViewById(R.id.cal_btn9);
        Button cal_btnclear = findViewById(R.id.cal_btnclear);
        Button cal_btnanswer = findViewById(R.id.cal_btnanswer);
        Button cal_btnplus = findViewById(R.id.cal_btnplus);
        Button cal_btnminus = findViewById(R.id.cal_btnminus);
        Button cal_btnmul = findViewById(R.id.cal_btnmul);
        Button cal_btndiv = findViewById(R.id.cal_btndiv);
        cal_result = findViewById(R.id.cal_result);


            cal_btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn0.getText()));
                }
            });
            cal_btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn1.getText()));
                }
            });
            cal_btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn2.getText()));
                }
            });
            cal_btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn3.getText()));
                }
            });
            cal_btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn4.getText()));
                }
            });
            cal_btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn5.getText()));
                }
            });
            cal_btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn6.getText()));
                }
            });
            cal_btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn7.getText()));
                }
            });
            cal_btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn8.getText()));
                }
            });
            cal_btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cal_result.setText(cal_result.getText().append(cal_btn9.getText()));
                }
            });


        cal_btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_result.setText(cal_result.getText().append(cal_btnplus.getText()));
            }
        });

        cal_btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_result.setText(cal_result.getText().append(cal_btnminus.getText()));
            }
        });

        cal_btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_result.setText(cal_result.getText().append(cal_btnmul.getText()));
            }
        });

        cal_btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_result.setText(cal_result.getText().append(cal_btndiv.getText()));
            }
        });

        cal_btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_result.setText("");
            }
        });



        cal_btnanswer.setOnClickListener(new View.OnClickListener() { // 숫자 두개 나왔을때만.
            @Override
            public void onClick(View v) {
                String a = cal_result.getText().toString();
                String b,c,result2="";
                int result=0;
                double result3;
                for(int i = 0 ; i < a.length(); i++) {
                    if (a.charAt(i) == '－' || a.charAt(i) == '+' || a.charAt(i) == '×' || a.charAt(i) == '÷') {
                        b = a.substring(0,i);
                        c = a.substring(i+1,a.length());
                         if(a.charAt(i) == '+'){
                             result = Integer.parseInt(b) + Integer.parseInt(c);

                         } else if (a.charAt(i) == '－')  {
                             result = Integer.parseInt(b) - Integer.parseInt(c);
                         } else if (a.charAt(i) == '×') {
                             result = Integer.parseInt(b) * Integer.parseInt(c);
                         } else {
                             result3 = Double.parseDouble(b) / Double.parseDouble(c);
                             result2 = ""+result3;
                         }


                    }
                }

                  result2 +=  result;
                cal_result.setText(result2);


            }
        });








    }



}

