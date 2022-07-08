    package com.example.cum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSubtract, btnMultiply, btnDivide, btnPoint, btnEqual, btnClear;
    EditText ed1;
    float Res1, Res2;
    boolean Add, Subtract, Multiply, Divide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnAdd=(Button)findViewById(R.id.btnadd);
        btnSubtract=(Button)findViewById(R.id.btnsubtract);
        btnMultiply=(Button)findViewById(R.id.btnmultiply);
        btnPoint=(Button)findViewById(R.id.btnpoint);
        btnEqual=(Button)findViewById(R.id.btnequal);
        btnDivide=(Button)findViewById(R.id.btndivide);
        btnClear=(Button)findViewById(R.id.btnclear);
        ed1=(EditText) findViewById(R.id.editTextTextPersonName);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "2");
            }


        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "3");
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "4");
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "5");
            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "6");
            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "7");
            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "8");
            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "9");
            }

        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "0");
            }

        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + ".");
            }

        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ed1==null){
                ed1.setText("");
            }
            else{
                Res1=Float.parseFloat(ed1.getText()+"");
                Add=true;
                ed1.setText(null);
                }


            }

        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Multiply=true;
                    ed1.setText(null);
                }

            }

        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Subtract=true;
                    ed1.setText(null);
                }
            }

        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Divide=true;
                    ed1.setText(null);
                }
            }

        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2 = Float.parseFloat(ed1.getText() + "");
                if (Add == true) {
                    ed1.setText(Res1 + Res2 + "");
                    Add = false;
                }
                if (Subtract == true) {
                    ed1.setText(Res1 - Res2 + "");
                    Subtract = false;
                }
                if (Multiply == true) {
                    ed1.setText(Res1 * Res2 + "");
                    Multiply = false;
                }
                if (Divide == true) {
                    ed1.setText(Res1 / Res2 + "");
                    Divide = false;
                }
            }

        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
            }
        });
        }

}
