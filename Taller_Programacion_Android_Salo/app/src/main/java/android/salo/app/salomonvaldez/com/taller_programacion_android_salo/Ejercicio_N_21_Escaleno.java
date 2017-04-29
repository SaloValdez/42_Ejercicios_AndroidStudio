package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Ejercicio_N_21_Escaleno extends Fragment {

    private EditText LadoA,LadoB,LadoC,Resultado;
    private Button Calcular;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ejercicio__n_21__escaleno,container,false);
        LadoA = (EditText) v.findViewById(R.id.txtLadoA);
        LadoB = (EditText) v.findViewById(R.id.txtLadoB);
        LadoC = (EditText) v.findViewById(R.id.txtLadoC);
        Resultado = (EditText)v.findViewById(R.id.txtResultadoEscaleno);
        Calcular = (Button) v.findViewById(R.id.btnCalcularEscaleno);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularPerimetroEscaleno();
            }
        });
        return v;
    }



    private void CalcularPerimetroEscaleno(){

        int NumA,NumB,NumC, resultado;
        NumA = Integer.parseInt(LadoA.getText().toString().trim());
        NumB = Integer.parseInt(LadoB.getText().toString().trim());
        NumC = Integer.parseInt(LadoC.getText().toString().trim());
        resultado  = NumA +NumB + NumC;
        Resultado.setText("" + resultado);

    }
}
