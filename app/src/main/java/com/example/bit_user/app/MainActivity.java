package com.example.bit_user.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   Button btnCal;
        //위젯을 정의한다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ()의 것을 불러온다.
        setContentView(R.layout.activity_main);

        //정의된 위젯변수에 ()것을 가져와서 담아둔다.
        btnCal = (Button) findViewById(R.id.btnCal);

        //변수를 리스너에 달아준다.
        btnCal.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnCal:
                Intent intent = new Intent(this,CalculatorActvity.class);
                startActivity(intent);
        }

    }
}
