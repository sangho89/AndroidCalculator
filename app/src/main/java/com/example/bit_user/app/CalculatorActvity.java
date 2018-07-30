package com.example.bit_user.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculatorActvity extends AppCompatActivity implements View.OnClickListener {
    Button btnNum0;
    Button btnNum1;
    Button btnNum2;
    Button btnNum3;
    Button btnNum4;
    Button btnNum5;
    Button btnNum6;
    Button btnNum7;
    Button btnNum8;
    Button btnNum9;
    Button btnNum_P;
    Button btnNum_M;
    Button btnNum_D;
    Button btnNum_G;
    Button btnNum_R;
    Button btnNum_AC;

    TextView preview;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btnNum0 = (Button) findViewById(R.id.btn0);
        btnNum1 = (Button) findViewById(R.id.btn1);
        btnNum2 = (Button) findViewById(R.id.btn2);
        btnNum3 = (Button) findViewById(R.id.btn3);
        btnNum4 = (Button) findViewById(R.id.btn4);
        btnNum5 = (Button) findViewById(R.id.btn5);
        btnNum6 = (Button) findViewById(R.id.btn6);
        btnNum7 = (Button) findViewById(R.id.btn7);
        btnNum8 = (Button) findViewById(R.id.btn8);
        btnNum9 = (Button) findViewById(R.id.btn9);
        btnNum_P = (Button) findViewById(R.id.btn_P);
        btnNum_M = (Button) findViewById(R.id.btn_M);
        btnNum_D = (Button) findViewById(R.id.btn_D);
        btnNum_G = (Button) findViewById(R.id.btn_G);
        btnNum_R = (Button) findViewById(R.id.btn_R);
        btnNum_AC = (Button) findViewById(R.id.btn_AC);

        btnNum0.setOnClickListener(this);
        btnNum1.setOnClickListener(this);
        btnNum2.setOnClickListener(this);
        btnNum3.setOnClickListener(this);
        btnNum4.setOnClickListener(this);
        btnNum5.setOnClickListener(this);
        btnNum6.setOnClickListener(this);
        btnNum7.setOnClickListener(this);
        btnNum8.setOnClickListener(this);
        btnNum9.setOnClickListener(this);
        btnNum_P.setOnClickListener(this);
        btnNum_M.setOnClickListener(this);
        btnNum_D.setOnClickListener(this);
        btnNum_G.setOnClickListener(this);
        btnNum_R.setOnClickListener(this);
        btnNum_AC.setOnClickListener(this);

        preview = (TextView) findViewById(R.id.preview);
        Result = (TextView) findViewById(R.id.result);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn0:
            preview.setText(preview.getText()+"0");
                 break;
            case R.id.btn1:
                preview.setText(preview.getText()+"1");
                break;
            case R.id.btn2:
                preview.setText(preview.getText()+"2");
                break;
            case R.id.btn3:
                preview.setText(preview.getText()+"3");
                break;
            case R.id.btn4:
                preview.setText(preview.getText()+"4");
                break;
            case R.id.btn5:
                preview.setText(preview.getText()+"5");
                break;
            case R.id.btn6:
                preview.setText(preview.getText()+"6");
                break;
            case R.id.btn7:
                preview.setText(preview.getText()+"7");
                break;
            case R.id.btn8:
                preview.setText(preview.getText()+"8");
                break;
            case R.id.btn9:
                preview.setText(preview.getText()+"9");
                break;
            case R.id.btn_P:
                preview.setText(preview.getText()+"+");
                break;
            case R.id.btn_M:
                preview.setText(preview.getText()+"-");
                break;
            case R.id.btn_D:
                preview.setText(preview.getText()+"/");
                break;
            case R.id.btn_G:
                preview.setText(preview.getText()+"*");
                break;
            case R.id.btn_R:
                preview.setText(preview.getText()+"=");
                break;
            case R.id.btn_AC:
                preview.setText("");
                break;
        }
    }
    private void Calculator()
    {
        int i = 0;
        String opData[] = new String[20];
        String tSting = (String) preview.getText();
        char arrs[] = tSting.toCharArray();
        int strStart=0;
        int strEnd=0;
        int opCount=0;
        ArrayList<String> list = new ArrayList();

        for(i=0;i<tSting.length();i++)
        {
            if((arrs[i]=='+')|(arrs[i]=='-')|(arrs[i]=='*')|(arrs[i]=='/')|(arrs[i]=='='))
                strEnd=i;
            opData[opCount] = tSting.substring(strStart,strEnd);
            list.add(opData[opCount]);
            opCount++;
            if(arrs[i]=='+')
                list.add("+");
            else if(arrs[i]=='-')
                list.add("-");
            else if(arrs[i]=='*')
                list.add("*");
            else if(arrs[i]=='/')
                list.add("/");
            if(arrs[i]!='=')
            {
                strStart = i+1;
                opCount++;
            }
            boolean opCal = false;
            double temp1 = 0;
            double temp2 = 0;
            double sum = 0;

            //곱셈이나 나눗셈을 먼저 연산한다.
            for(i=0;i<list.size();)
            {
                String item = list.get();
                if(item.equals("*"))
                {
                    temp1 = Double.parseDouble(list.get(i-1));
                    temp2 = Double.parseDouble(list.get(i+1));
                    sum = temp1 * temp2;
                    opCal = true;
                }
                else if(item.equals("/"))
                {
                    temp1 = Double.parseDouble(list.get(i-1));
                    temp2 = Double.parseDouble(list.get(i+1));
                    sum = temp1 / temp2;
                    opCal = true;
                }
                else
                {
                    opCal =false;
                }

                if(opCal)
                {
                    list.set(i,sum+"");
                    list.remove(i+1);
                    list.remove(i-1);
                }
                else
                {
                    i++;
                }
                Boolean DEBUG=true;
                if(DEBUG)
                {
                    for(Object str : list)
                    {
                        System.out.print(str);
                    }
                    System.out.println("");
                    System.out.println(sum);
                }
            }
            result.set
        }
    }
}
