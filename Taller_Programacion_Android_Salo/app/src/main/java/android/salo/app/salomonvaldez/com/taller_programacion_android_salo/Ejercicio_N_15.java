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
 * {@link Ejercicio_N_15.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_15 extends Fragment {
    private  EditText num1, num2, num3,Mensaje;
    private Button Verificar;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_15() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_15, container, false);
            num1 = (EditText) view.findViewById(R.id.txtNum1);
        num2 = (EditText) view.findViewById(R.id.txtNum2);
        num3 = (EditText) view.findViewById(R.id.txtNum3);
        Mensaje = (EditText) view.findViewById(R.id.txtMensaje);
        Verificar = (Button) view.findViewById(R.id.btnVerificar);

        Verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarCreciente();
            }
        });


        return view;
    }

    private  void VerificarCreciente(){

        Integer Num1,Num2,Num3;
        Num1 = Integer.parseInt(num1.getText().toString().trim());
        Num2 = Integer.parseInt(num2.getText().toString().trim());
        Num3 = Integer.parseInt(num3.getText().toString().trim());


        if (Num1 < Num2 && Num2 < Num3  ){
            Mensaje.setText("Orden creciente");
        }else{
            Mensaje.setText("No esta en orden creciente");
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
