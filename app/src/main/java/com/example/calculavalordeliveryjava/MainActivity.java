package com.example.calculavalordeliveryjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView valorProduto;
    private TextView porcentagemDelivery;
    private TextView valorIdeal;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorProduto = findViewById(R.id.text_valor_produto);
        porcentagemDelivery = findViewById(R.id.text_porcrentagem_delivery);
        valorIdeal = findViewById(R.id.text_valor_ideal);
        calcular = findViewById(R.id.button_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcula();
            }
        });

    }

    public void calcula(){

        Double valor = Double.valueOf(valorProduto.getText().toString());
        Double porcentagem = Double.valueOf(porcentagemDelivery.getText().toString());
        Double calculo = porcentagem/100;
        Double calculo2 = 1 - calculo;
        Double resultado;





        resultado = valor / calculo2;
        valorIdeal.setText(resultado.toString());

    }
}