package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_02.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_02 extends Fragment  {

    private OnFragmentInteractionListener mListener;

    Button Calcular, Siguiente3;
    EditText Numero, Resultado;
    Activity activity;


    public Ejercicio_N_02() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_02, container, false);
        Calcular = (Button) view.findViewById(R.id.button_comprobar);
        Numero = (EditText) view.findViewById(R.id.editText_Numero);
        Resultado = (EditText) view.findViewById(R.id.editText_Resultado);


        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularParImpar();

            }
        });


        return view;
    }
    private void CalcularParImpar(){ //esto es un método

        try {
            int Valor1;
            Valor1 =Integer.valueOf( Numero.getText().toString());
            if(Valor1%2==0){
                Resultado.setText("Es Numero Par");
            }else{
                Resultado.setText("Es Numero Impar");
            }
        }catch (Exception e){
            Activity Actividad;
            Actividad = getActivity();
            Toast.makeText(Actividad,"Hay algun Error. Comuniquese con el adminstrador",Toast.LENGTH_LONG).show();
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
