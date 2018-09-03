package app.rstone.com.myapp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
// ctrl + y 줄 지움, ctrl + d 줄 복사
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //view는 xml의 view를 말한다
        final Context ctx = MainActivity.this;
        findViewById(R.id.sum_btn).setOnClickListener(new View.OnClickListener() { // R의 의미는 root안의 id가 btn인것. add이벤트 리스너와 비슷한 맥락
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                TextView result = findViewById(R.id.result);
                result.setText("계산결과:"
                        +String.valueOf(Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString())));


                /*EditText num1 = findViewById(R.id.num1);    // text xml의 type
                String sNum1 = num1.getText().toString(); // sNum1이 String
                EditText num2 = findViewById(R.id.num2);
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                //int sResult = Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
                //result = String.valueOf(Integer.parseInt(sNum1) + Integer.parseInt(sNum2));
                //Log.d("입력한 숫자", sNum1);
                //Toast.makeText(ctx, "입력한 숫자값:"+sNum1, Toast.LENGTH_LONG).show(); // alert
                //Toast.makeText(ctx, "계산결과:"+sResult,Toast.LENGTH_LONG).show();
                sResult = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);
                result.setText("계산결과:"+String.valueOf(sResult));*/
            }
        });
        findViewById(R.id.sub_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                TextView result = findViewById(R.id.result);
                result.setText("계산결과:"
                                +String.valueOf(Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString())));
            }
        });
        findViewById(R.id.mul_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                TextView result = findViewById(R.id.result);
                result.setText("계산결과:"
                                +String.valueOf(Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString())));
            }
        });
        findViewById(R.id.div_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                TextView result = findViewById(R.id.result);
                result.setText("계산결과:"
                                +String.valueOf(Integer.parseInt(num1.getText().toString())/Integer.parseInt(num2.getText().toString())));
            }
        });
    }
}
