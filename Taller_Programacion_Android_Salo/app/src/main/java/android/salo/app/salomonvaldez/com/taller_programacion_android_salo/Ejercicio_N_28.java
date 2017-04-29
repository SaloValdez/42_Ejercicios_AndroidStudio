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
 * {@link Ejercicio_N_28.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_28 extends Fragment {
    private EditText num,resultado;
    private Button Verificar;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_28() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_28, container, false);

        num = (EditText) view.findViewById(R.id.txtNumero);
        resultado = (EditText) view.findViewById(R.id.txtResultado);
        Verificar = (Button) view.findViewById(R.id.btnVerificar);
        Verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Verificar100();
            }
        });
        return view;

    }

    private void Verificar100(){

        int Num;
        Num = Integer.parseInt(num.getText().toString().trim());

        if (Num > 0 && Num < 100){
            resultado.setText("Es positivo y Menor que 100");

        }else{

            resultado.setText("No cumple las condiciones");
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
