package com.example.parcial1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora {
    package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        EditText edittext1;
        EditText edittext2;
        TextView ressuma;
        TextView resmulti;


        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edittext1 = findViewById(R.id.NumberA);
            edittext2 = findViewById(R.id.NumberB);
            ressuma = findViewById(R.id.repotencia);
            resmulti = findViewById(R.id.remultiplicacion);

        }

        public void calculo(View view){
            int operacionsuma = Integer.parseInt(edittext1.getText().toString()) + Integer.parseInt(edittext2.getText().toString());
            int operacionmulti = Integer.parseInt(edittext1.getText().toString()) * Integer.parseInt(edittext2.getText().toString());
            char[] operacionpotencia;
            operacionpotencia.setText(operacionpotencia"");
            resmulti.setText(operacionmulti+"");
            public void potencia(){
                //Asignando valores
                int base=Integer.parseInt(Base.getText().toString());
                int exponente=Integer.parseInt(Exponente.getText().toString());
                int p=1;
                //Mientras el exponente sea mayor al cero        while(exponente>0)
                {
                    //calculando potencia            p=p*base;
                    exponente--;
                }
                //mostrando reusltados
                Resultado.setText
                        ("La potencia de "+Base.getText().toString()
        }

    }
}
