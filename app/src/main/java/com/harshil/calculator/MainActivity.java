package com.harshil.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button add, sub, divide, multiply, bracket, equal, dot, clear, addorsub, percent;
    TextView Data, Answer;
    Double var1,var2;
    boolean add1,sub1,mul1,div1,percent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.number1);
        two = findViewById(R.id.number2);
        three = findViewById(R.id.number3);
        four = findViewById(R.id.number4);
        five = findViewById(R.id.number5);
        six = findViewById(R.id.number6);
        seven = findViewById(R.id.number7);
        eight = findViewById(R.id.number8);
        nine = findViewById(R.id.number9);
        zero = findViewById(R.id.number0);
        add = findViewById(R.id.addition);
        sub = findViewById(R.id.subtraction);
        divide = findViewById(R.id.divison);
        multiply = findViewById(R.id.multiplication);
        bracket = findViewById(R.id.brackets);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
        addorsub = findViewById(R.id.addorsub);
        percent = findViewById(R.id.percentage);
        Data = findViewById(R.id.data);
        Answer = findViewById(R.id.output);
    }

    public void DisplayNumber(View view) {
        int viewID = view.getId();
        if (viewID == R.id.number0) {
            Data.setText(String.format("%s0", Data.getText()));
        } else if (viewID == R.id.number1) {
            Data.setText(String.format("%s1", Data.getText()));
        } else if (viewID == R.id.number2) {
            Data.setText(String.format("%s2", Data.getText()));
        } else if (viewID == R.id.number3) {
            Data.setText(String.format("%s3", Data.getText()));
        } else if (viewID == R.id.number4) {
            Data.setText(String.format("%s4", Data.getText()));
        } else if (viewID == R.id.number5) {
            Data.setText(String.format("%s5", Data.getText()));
        } else if (viewID == R.id.number6) {
            Data.setText(String.format("%s6",Data.getText()));
        } else if (viewID == R.id.number7) {
            Data.setText(String.format("%s7",Data.getText()));
        } else if (viewID == R.id.number8) {
            Data.setText(String.format("%s8", Data.getText()));
        } else if (viewID == R.id.number9) {
            Data.setText(String.format("%s9", Data.getText()));
        }else{
            Data.setText(String.format("%s.", Data.getText()));
        }
    }
    public void AddOrSub(View view)
    {
        var1=Double.parseDouble(Data.getText()+"");
        var2=Double.parseDouble(Data.getText()+"");
        Data.setText("-"+var1);
    }
    public void Brackets(View view)
    {

    }
    public void OperationClicked(View view)
    {
        int VIEWID = view.getId();
        if(VIEWID==R.id.addition){
            var1=Double.parseDouble(Data.getText()+"");
            add1=true;
            Data.setText(null);
        }else if(VIEWID==R.id.subtraction){
            var1=Double.parseDouble(Data.getText()+"");
            sub1=true;
            Data.setText(null);
        }else if(VIEWID==R.id.multiplication){
            var1=Double.parseDouble(Data.getText()+"");
            mul1=true;
            Data.setText(null);
        }else if(VIEWID==R.id.divison){
            var1=Double.parseDouble(Data.getText()+"");
            div1=true;
            Data.setText(null);
        }else if(VIEWID==R.id.percentage){
            var1=Double.parseDouble(Data.getText()+"");
            percent1=true;
            Data.setText(null);
        }
    }
    public void Equal(View view)
    {
        var2=Double.parseDouble(Data.getText()+"");
        if(add1==true)
        {
            Answer.setText(var1+var2+"");
            add1=false;
        }
        if(sub1==true)
        {
            Answer.setText(var1-var2+"");
            sub1=false;
        }
        if(mul1==true)
        {
            Answer.setText(var1*var2+"");
            mul1=false;
        }
        if(div1==true)
        {
            Answer.setText(var1/var2+"");
            div1=false;
        }
        if(percent1==true)
        {
            Answer.setText(var1*0.01+"");
            percent1=false;
        }

    }
    public void ClearScreen(View view){
        Answer.setText("Clear Screen"+"");
        Data.setText("");
    }
}



