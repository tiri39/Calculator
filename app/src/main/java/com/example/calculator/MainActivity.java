package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.R;


public class MainActivity extends AppCompatActivity {

    Button btnDLE, btnAC, btnPer, btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btnMinus, btnPlus, btnDiv, btnInto, btnEqual, btnDot;
    TextView tvShow;
    EditText edittext;
    boolean addition, subtract, multiplication, division, percent;
    float mvalueOne, mvalueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edTxt);
        btnDLE = findViewById(R.id.buttonDEL);
        btnAC = findViewById(R.id.buttonAC);
        btnPer = findViewById(R.id.buttonPer);
        btn9 = findViewById(R.id.button9);
        btn8 = findViewById(R.id.button8);
        btn7 = findViewById(R.id.button7);
        btn6 = findViewById(R.id.button6);
        btn5 = findViewById(R.id.button5);
        btn4 = findViewById(R.id.button4);
        btn3 = findViewById(R.id.button3);
        btn2 = findViewById(R.id.button2);
        btn1 = findViewById(R.id.button1);
        btn0 = findViewById(R.id.button0);
        btnMinus = findViewById(R.id.buttonMinus);
        btnPlus = findViewById(R.id.buttonPlus);
        btnInto = findViewById(R.id.buttonInto);
        btnDiv = findViewById(R.id.buttonDivision);
        btnEqual = findViewById(R.id.buttonEqual);
        btnDot = findViewById(R.id.buttonDot);





        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    addition = true;
                    edittext.setText(null);
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    subtract = true;
                    edittext.setText(null);
                }
            }
        });
        btnInto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    multiplication = true;
                    edittext.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    division = true;
                    edittext.setText(null);
                }
            }
        });
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    percent = true;
                    edittext.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueTwo = Float.parseFloat(edittext.getText()+"");
                if(addition == true)
                {
                    edittext.setText(mvalueOne+mvalueTwo+"");
                    addition = false;
                }
                else if(subtract == true)
                {
                    edittext.setText(mvalueOne-mvalueTwo+"");
                    subtract = false;
                }
                else if(multiplication == true)
                {
                    edittext.setText(mvalueOne*mvalueTwo+"");
                    multiplication = false;
                }
                else if(division == true)
                {
                    edittext.setText(mvalueOne/mvalueTwo+"");
                    division = false;
                }
                else if(percent == true)
                {
                    edittext.setText(mvalueOne/100+"");
                    division = false;
                }
            }
        });
    }



}
