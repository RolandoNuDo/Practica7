package com.rolando.practica7;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnCalcular;
    TextView txtResultado;
    EditText catetoOp;
    EditText catetoAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = (Button) findViewById(R.id.button);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        catetoAd = (EditText) findViewById(R.id.editText);
        catetoOp = (EditText) findViewById(R.id.editText2);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String txtCatOP = catetoOp.getText().toString();
                String txtCatAd = catetoAd.getText().toString();
                if(!txtCatAd.isEmpty() && !txtCatOP.isEmpty()) {
                    double catAd = Double.parseDouble(catetoAd.getText().toString().trim());
                    double catOp = Double.parseDouble(catetoOp.getText().toString().trim());
                    double hipo = Math.sqrt(Math.pow(catAd, 2) + Math.pow(catOp, 2));
                    double area = (catAd * catOp) / 2;
                    double perimetro = catAd + catOp + hipo;
                    txtResultado.setText("Area del triangulo = "+ area + "\nPerimetro del triangulo = "+perimetro+"\nHipotenusa del triangulo = "+hipo);
                    txtResultado.setVisibility(View.VISIBLE);
                }else {
                    txtResultado.setText("Rellena los datos");
                    txtResultado.setVisibility(View.VISIBLE);
                }
        }
    }
}
