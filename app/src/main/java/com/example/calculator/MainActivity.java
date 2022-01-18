package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstView,secondView;
    String secondValue,operator;
    double num1,num2,result, root,percent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstView=findViewById(R.id.textView1);
        secondView=findViewById(R.id.textView2);


    }
    public void digitFunction(View view){
        secondValue=secondView.getText().toString();
        if(view.getId()==R.id.button0){
            if(secondValue.equals("0")){
                secondView.setText("0");
            }else{
                secondView.setText(secondValue+"0");
            }

        }
        else if(view.getId()==R.id.button1){
            if(secondValue.equals("0")){
                secondView.setText("1");
            }else{
                secondView.setText(secondValue+"1");
            }

        }
        else if(view.getId()==R.id.button2){
            if(secondValue.equals("0")){
                secondView.setText("2");
            }else{
                secondView.setText(secondValue+"2");
            }

        }
        else if(view.getId()==R.id.button3){
            if(secondValue.equals("0")){
                secondView.setText("3");
            }else{
                secondView.setText(secondValue+"3");
            }

        }
        else if(view.getId()==R.id.button4){
            if(secondValue.equals("0")){
                secondView.setText("4");
            }else{
                secondView.setText(secondValue+"4");
            }

        }
        else if(view.getId()==R.id.button5){
            if(secondValue.equals("0")){
                secondView.setText("5");
            }else{
                secondView.setText(secondValue+"5");
            }

        }
        else if(view.getId()==R.id.button6){
            if(secondValue.equals("0")){
                secondView.setText("6");
            }else{
                secondView.setText(secondValue+"6");
            }

        }
        else if(view.getId()==R.id.button7){
            if(secondValue.equals("0")){
                secondView.setText("7");
            }else{
                secondView.setText(secondValue+"7");
            }

        }
        else if(view.getId()==R.id.button8){
            if(secondValue.equals("0")){
                secondView.setText("8");
            }else{
                secondView.setText(secondValue+"8");
            }

        }
        else if(view.getId()==R.id.button9){
            if(secondValue.equals("0")){
                secondView.setText("9");
            }else{
                secondView.setText(secondValue+"9");
            }

        }
        else if(view.getId()==R.id.buttondot){
            if(secondValue.equals("0")){
                secondView.setText("0.");
            }else{
                secondView.setText(secondValue+".");
            }

        }

    }
    public void logicFunction(View view) {
        secondValue=secondView.getText().toString();
        num1=Double.parseDouble(secondValue);
        if (view.getId()==R.id.buttonplus){
            operator="+";
            secondView.setText(secondValue+operator);
        }
        else if (view.getId()==R.id.buttonminus){
            operator="-";
        }
        else if (view.getId()==R.id.buttonmultiply){
            operator="*";
        }
        else if (view.getId()==R.id.buttonequal){
            operator="=";

        }
        else{
            operator="/";
        }
       firstView.setText(secondValue+operator);
       secondView.setText("0");
    }

    public void resultFunction(View view) {
        secondValue=secondView.getText().toString();
        num2=Double.parseDouble(secondValue);
        if (operator.equals("+")){
            result=num1+num2;
        }
        else if (operator.equals("-")){
            result=num1-num2;
        }
        else if (operator.equals("*")){
            result=num1*num2;
        }
        else{
            result=num1/num2;
        }
        firstView.setText(" "+num1+" "+operator+num2+"="+result);
        secondView.setText(" "+result);
    }
    public void clearFunction(View view) {
        firstView.setText("");
        secondView.setText("0");
        num1=0;
        num2=0;

    }
    public void rootFunction(View view) {
        secondValue=secondView.getText().toString();
        root=Double.parseDouble(secondValue);
        double sq=Math.sqrt(root);
        String sqr=String.valueOf(sq);
        firstView.setText(sqr);
        secondView.setText(sqr);
        num1=0;
        num2=0;
    }
    public void  percentFunction(View view) {
        secondValue=secondView.getText().toString();
        percent=Double.parseDouble(secondValue);
        double per=percent/100;
        String pers=String.valueOf(per);
        firstView.setText(pers);
        secondView.setText(pers);
        num1=0;
        num2=0;
    }



}