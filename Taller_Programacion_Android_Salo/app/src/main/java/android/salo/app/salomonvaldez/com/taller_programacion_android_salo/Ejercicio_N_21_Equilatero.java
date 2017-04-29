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


public class Ejercicio_N_21_Equilatero extends Fragment {

    private EditText Lado,Resultado;
    private Button Calcular;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ejercicio__n_21__equilatero,container,false);

                    Lado = (EditText) v.findViewById(R.id.txtLadoEquilatero);
                    Resultado = (EditText)v.findViewById(R.id.txtResultadoEquilatero);
                    Calcular = (Button) v.findViewById(R.id.btnCalcularEquilatero);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularPerimetroEquilatero();
            }
        });
        return v;
    }


    private void CalcularPerimetroEquilatero(){

        int Num, resultado;
        Num = Integer.parseInt(Lado.getText().toString().trim());
        resultado  = 3 * Num;
        Resultado.setText("" + resultado);

    }
}
