package br.com.etecia.appviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    Button btnSomar;
    TextView lblResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id. txtNum2);
        lblResposta = (TextView) findViewById(R.id.lblResultado);

        btnSomar = (Button) findViewById(R.id. btnSomar);


        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                double resp = 0;
                String num1 = txtNum1.getText().toString();
                String num2 = txtNum2.getText().toString();

                resp =Double.parseDouble(num1)+Double.parseDouble(num2);
                lblResposta.setText(""+resp);            }
        });

    }





}
