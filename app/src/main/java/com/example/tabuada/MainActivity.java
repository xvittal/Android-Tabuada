package com.example.tabuada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    private TextView tx2;
    private TextView tx3_result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        tx2 = findViewById(R.id.tx2);
        tx3_result = findViewById(R.id.tx3_result);
    }
    public boolean valida(String valor)
    {
        String numString = valor;
        if( numString.isEmpty())
            return false;
        else
            if (Integer.parseInt(valor) == 0)
                return false;
            else
                if(Integer.parseInt(valor) > 10)
                    return false;
        return true;
    }
    public void exibeTabuada(View view)
    {
        if(!valida(ed1.getText().toString()))
        {
            tx3_result.setText("Digite um Valor Valido!");
            return;
        }
        Integer numero = Integer.parseInt(ed1.getText().toString());
        String resultado = "";
        for(int i = 1; i <= 10; i++)
             resultado += numero+" X "+i+" = "+ (numero * i)+"\n";
        tx2.setText(ed1.getText().toString());
        tx3_result.setText(resultado);
    }
    public void limpar(View view)
    {
        ed1.setText("");
        ed1.setHint("Digite um número!");
        tx2.setText("");
        tx2.setHint("(VALOR)");
        tx3_result.setText("");
    }
}