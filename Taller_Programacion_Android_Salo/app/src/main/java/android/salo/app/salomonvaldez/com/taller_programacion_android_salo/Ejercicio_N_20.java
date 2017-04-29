package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_20.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_20 extends Fragment {
    private EditText num1,num2,num3,mensaje;
    private Button calcular;


    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_20() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_20, container, false);
        num1 =(EditText) view.findViewById(R.id.txtNumero1);
        num2 =(EditText) view.findViewById(R.id.txtNumero2);
        num3 =(EditText) view.findViewById(R.id.txtNumero3);
        mensaje =(EditText) view.findViewById(R.id.txtMensaje);
        calcular = (Button) view.findViewById(R.id.btnVerificar);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarMultiplicacion();
            }
        });
        return view;
    }

    private void VerificarMultiplicacion(){
        int Num1,Num2,Num3,suma;

        Num1 = Integer.parseInt(num1.getText().toString().trim());
        Num2 = Integer.parseInt(num2.getText().toString().trim());
        Num3 = Integer.parseInt(num3.getText().toString().trim());
        suma = Num1 * Num2;
        if (Num3 == suma){
            mensaje.setText("La Multiplicacion del 1º y 2º es igual al Numero 3");


        }else{
            mensaje.setText("No es Igual");
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
