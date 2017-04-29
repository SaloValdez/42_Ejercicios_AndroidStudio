package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_39.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_39 extends Fragment {
    private EditText a,b,c;
    private TextView resultadoEcuacion;
    private Button calcular;
    private Activity activity;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_39() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_39, container, false);

        a = (EditText) view.findViewById(R.id.txtEcuacionA);
        b = (EditText) view.findViewById(R.id.txtEcuacionB);
        c = (EditText) view.findViewById(R.id.txtEcuacionC);
        resultadoEcuacion = (TextView) view.findViewById(R.id.tvResultadoEcuacion);
        calcular = (Button) view.findViewById(R.id.btnCalcularEcuacion);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularEcuacion();
            }
        });
        return view;
    }

    private  void CalcularEcuacion(){
        try {
            Double A,B,C,x1,x2,unaraiz;
            //INtroducir Coeficientes
            A = Double.parseDouble(a.getText().toString().trim());
            B = Double.parseDouble(b.getText().toString().trim());
            C = Double.parseDouble(c.getText().toString().trim());
            if (!(A == 0)){ // SI SON RAICES DISTINTAS
                if (B*B-4*A*C >=0){// DISCRIMINANTE (condicion para que las raices sean reales = "0")
                    //las dos raices de la ecuacion
                    x1 = (-B+ Math.sqrt(B*B-4*A*C))/(2*A);
                    x2 = (-B- Math.sqrt(B*B-4*A*C))/(2*A);
                    resultadoEcuacion.setText(" - Las raices son : "+ x1 +" y "+ x2);
                }else{
                    resultadoEcuacion.setText("Las Raices son 'Complejas'.");
                }
            }else{//si las raices son IGUALES
                unaraiz = -C/B;
                resultadoEcuacion.setText("Solo tiene una raiz :" + unaraiz);
            }
        }catch (Exception e){
            activity = getActivity();
            Toast.makeText(activity,"!Error¡. Ingrese los Coef. Válidos.",Toast.LENGTH_SHORT).show();
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
