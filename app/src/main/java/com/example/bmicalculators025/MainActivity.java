package com.example.bmicalculators025;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCalculation=findViewById(R.id.btCalculation);
        Button btClear=findViewById(R.id.btClear);

        btCalculation.setOnClickListener(new cButtonClickListener());
        btClear.setOnClickListener(new clearButtonClickListener());
    }

    private class cButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText age=findViewById(R.id.etAge);
            EditText height=findViewById(R.id.etHeight);
            EditText weight=findViewById(R.id.etWeight);
            String Sage=age.getText().toString();
            String Sheight=height.getText().toString();
            String Sweight=weight.getText().toString();
            TextView output1 = findViewById(R.id.tvoutput1);
            TextView output2 = findViewById(R.id.tvoutput2);
            TextView output3 = findViewById(R.id.tvoutput3);
            TextView output4 = findViewById(R.id.tvoutput4);
            TextView output5 = findViewById(R.id.tvoutput5);
            Dialog dialog = new Dialog();
            dialog.show(getSupportFragmentManager(),"Dialog");

            float num0 = Float.parseFloat(Sage);
            float num1 = Float.parseFloat(Sheight);
            float num2 = Float.parseFloat(Sweight);


            if(num0 >= 16){
                float result = num2 / ((num1 / 100) * (num1 / 100));
                float num3 = num1 * num1 / 10000 * 22;
                String Snum3 = String.format("%.1f", num3);

                if(result <  18.5){
                    output1.setText("あなたの肥満度は");
                    output2.setText("低体重");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 18.5 && result < 25){
                    output1.setText("あなたの肥満度は");
                    output2.setText("普通体重");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 25 && result < 30) {
                    output1.setText("あなたの肥満度は");
                    output2.setText("肥満（1度）");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 30 && result < 35) {
                    output1.setText("あなたの肥満度は");
                    output2.setText("肥満（２度）");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 35 && result < 40) {
                    output1.setText("あなたの肥満度は");
                    output2.setText("肥満（３度）");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                }else {
                    output1.setText("あなたの肥満度は");
                    output2.setText("肥満（４度）");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                }
            }

            else if (num0 >= 6 && num0 < 16){
                float result = num2 / (num1 * num1 * num1) * 10;
                float num3 = (num1-100);
                String Snum3 = String.format("%.1f", num3);

                if(result <  100){
                    output1.setText("あなたの肥満度は");
                    output2.setText("やせ形");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 100 && result < 115){
                    output1.setText("あなたの肥満度は");
                    output2.setText("やせ気味");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 115 && result < 145) {
                    output1.setText("あなたの肥満度は");
                    output2.setText("正常");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else if (result >= 145 && result < 160) {
                    output1.setText("あなたの肥満度は");
                    output2.setText("肥満気味");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                } else {
                    output1.setText("あなたの肥満度は");
                    output2.setText("肥満");
                    output3.setText("あなたの適正体重は");
                    output4.setText(Snum3);
                    output5.setText("キロ");
                }
            }
            else {
                float result = num2 / (num1 * num1);

                if (num0 == 5){
                    output1.setText("あなたの肥満度は");
                    if (result >= 18 && result <22){
                        output2.setText("正常");
                    } else if (result >= 22) {
                        output2.setText(("太り気味"));
                    }else {
                        output2.setText("やせ気味");
                    }
                    output3.setText("あなたの適正体重は");
                    output4.setText("１８～２２キロ");
                } else if (num0 == 4) {
                    output1.setText("あなたの肥満度は");
                    if (result >= 18 && result <22){
                        output2.setText("正常");
                    } else if (result >= 22) {
                        output2.setText(("太り気味"));
                    }else {
                        output2.setText("やせ気味");
                    }
                    output3.setText("あなたの適正体重は");
                    output4.setText("１４．５～１６．５キロ");
                }else if (num0 == 3) {
                    output1.setText("あなたの肥満度は");
                    if (result >= 18 && result <22){
                        output2.setText("正常");
                    } else if (result >= 22) {
                        output2.setText(("太り気味"));
                    }else {
                        output2.setText("やせ気味");
                    }
                    output3.setText("あなたの適正体重は");
                    output4.setText("１４．５～１６．５キロ");
                }else if (num0 == 2) {
                    output1.setText("あなたの肥満度は");
                    if (result >= 15 && result <17){
                        output2.setText("正常");
                    } else if (result >= 17) {
                        output2.setText(("太り気味"));
                    }else {
                        output2.setText("やせ気味");
                    }
                    output3.setText("あなたの適正体重は");
                    output4.setText("１５～１７キロ");
                }else if (num0 == 1) {
                    output1.setText("あなたの肥満度は");
                    if (result >= 15.5 && result <17.5){
                        output2.setText("正常");
                    } else if (result >= 17.5) {
                        output2.setText(("太り気味"));
                    }else {
                        output2.setText("やせ気味");
                    }
                    output3.setText("あなたの適正体重は");
                    output4.setText("１５．５～１７．５キロ");
                }else {
                    output1.setText("あなたの肥満度は");
                    if (result >= 16 && result <18){
                        output2.setText("正常");
                    } else if (result >= 18) {
                        output2.setText(("太り気味"));
                    }else {
                        output2.setText("やせ気味");
                    }
                    output3.setText("あなたの適正体重は");
                    output4.setText("１６～１８キロ");
                }


            }
        }
    }

    private class clearButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v){
            EditText age=findViewById(R.id.etAge);
            EditText height=findViewById(R.id.etHeight);
            EditText weight=findViewById(R.id.etWeight);

            age.setText("");
            height.setText("");
            weight.setText("");
        }
    }
}