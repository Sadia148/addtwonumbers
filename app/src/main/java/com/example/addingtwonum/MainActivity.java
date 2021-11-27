package com.example.addingtwonum;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num;
    private EditText num2;
    private Button ADD;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.editTextNumber);
        num2 = (EditText) findViewById(R.id.editTextNumber2);
        ADD = (Button) findViewById(R.id.btnADD);
        result = (TextView) findViewById(R.id.tvAnswer);

        ADD.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer:" + String.valueOf(sum));
            }
        });
    }
}