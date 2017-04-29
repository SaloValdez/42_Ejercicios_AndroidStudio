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

import static android.os.Build.VERSION_CODES.N;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_33.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_33 extends Fragment {
private EditText NumElev,ResultadoElev;
    private Button CalcularElev;
    private OnFragmentInteractionListener mListener;
Activity activity;
    public Ejercicio_N_33() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_33, container, false);
            NumElev = (EditText) view.findViewById(R.id.txtNumeroElev);
        ResultadoElev = (EditText) view.findViewById(R.id.txtResultadoElev);
        CalcularElev = (Button) view.findViewById(R.id.btnCalcularElev);
        CalcularElev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularNumeroSiPar();
            }
        });
        return view;
    }



    private void CalcularNumeroSiPar(){
        try {
            int numElev,producto;
            String coment1,coment2;
            numElev = Integer.parseInt(NumElev.getText().toString().trim());
            if (numElev % 2 == 0){
                producto = (int) Math.pow(numElev,2);
                coment1 = " elevado al 'cuadrado' es:";
                coment2 = " es 'par'";
            }else{
                producto = (int) Math.pow(numElev,3);
                coment1 = " elevado al 'cubo' es:";
                coment2 = " es 'impar'";
            }
            ResultadoElev.setText("- El "+numElev +coment2 +".\n- " +numElev + coment1+producto);
        }catch (Exception e){
            activity =getActivity();
            Toast.makeText(activity,"'Error'. Ingrese un número entero",Toast.LENGTH_LONG).show();
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
