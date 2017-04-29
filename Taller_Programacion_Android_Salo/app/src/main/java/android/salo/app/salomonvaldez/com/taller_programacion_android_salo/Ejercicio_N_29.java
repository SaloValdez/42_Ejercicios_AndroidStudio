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
 * {@link Ejercicio_N_29.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_29 extends Fragment {
    private EditText num,resultado;
    private Button verificar;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_29() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ejercicio__n_29, container, false);

        num = (EditText) view.findViewById(R.id.txtNumero);
        resultado = (EditText) view.findViewById(R.id.txtResultado);
        verificar =(Button) view.findViewById(R.id.btnVerificar);


        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarIntervalo();
            }
        });
        return view;
    }


    private void VerificarIntervalo (){
        int Num;

        Num = Integer.parseInt(num.getText().toString().trim());
        if (Num > -3 & Num < 27){
            resultado.setText("Pertenece al intervalo [-3,27]");
        }else{
            resultado.setText("No pertenece al intervalo [-3,27]");
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
