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
 * {@link Ejercicio_N_31.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_31 extends Fragment {
private EditText numAbs,resultadoAbs;
    private Button verificarAbs;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_31() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_31, container, false);

        numAbs = (EditText) view.findViewById(R.id.txtNumeroAbs);
        resultadoAbs = (EditText) view.findViewById(R.id.txtResultadoAbs);
        verificarAbs = (Button) view.findViewById(R.id.btnVerificarAbs);
    verificarAbs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            VerificarNumeroAbsoluto();
        }
    });
        return view;
    }


    private void VerificarNumeroAbsoluto(){
        int numero,va;
        numero = Integer.parseInt(numAbs.getText().toString().trim());
        if (numero < 0){
            va = numero * -1;

        }else{
            va = numero;
        }

        if (va < 15){
            resultadoAbs.setText("- Valor Absoluto de " + numero +" es:  " + va + "\n" + "- Es menor que 15" );
        }else{
            resultadoAbs.setText("- Valor Absoluto de " + numero +" es:  " + va + "\n" + "- No es menor que 15" );
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
