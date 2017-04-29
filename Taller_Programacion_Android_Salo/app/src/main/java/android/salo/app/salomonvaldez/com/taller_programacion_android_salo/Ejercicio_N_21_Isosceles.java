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

import static android.os.Build.VERSION_CODES.N;


public class Ejercicio_N_21_Isosceles extends Fragment {
    private  EditText LadosIguales,LadoDesigual,Resultado;
    private Button Calcular;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ejercicio__n_21__isosceles,container,false);
        // TextView   tv1 = (TextView) v.findViewById(R.id.textView);
        //Resources res = getResources();

        //tv1.setText(res.getText(R.string.pes1String));

        LadosIguales = (EditText) v.findViewById(R.id.txtLadosIguales);
        LadoDesigual = (EditText) v.findViewById(R.id.txtLadoDesigual);
        Resultado = (EditText)v.findViewById(R.id.txtResultadoIsosceles);
        Calcular = (Button) v.findViewById(R.id.btnCalcularIsosceles);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularPerimetroIsosceles();
            }
        });
        return v;
    }

    private void CalcularPerimetroIsosceles(){

        int NumIguales,NumDesigual, resultado;
        NumIguales = Integer.parseInt(LadosIguales.getText().toString().trim());
        NumDesigual = Integer.parseInt(LadoDesigual.getText().toString().trim());;
        resultado  = (2 *  NumIguales) + NumDesigual;
        Resultado.setText("" + resultado);

    }


}
