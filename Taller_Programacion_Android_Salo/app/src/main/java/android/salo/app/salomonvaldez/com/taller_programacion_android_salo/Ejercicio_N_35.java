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
 * {@link Ejercicio_N_35.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_35 extends Fragment {
    private EditText numMax1b,numMax2b,numMax3b,resultadoMaxb;
    private Button calcularMaxb;
    private Activity activity;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_35() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_35, container, false);
        numMax1b = (EditText) view.findViewById(R.id.txtNumeroMax1b);
        numMax2b = (EditText) view.findViewById(R.id.txtNumeroMax2b);
        numMax3b = (EditText) view.findViewById(R.id.txtNumeroMax3b);
        resultadoMaxb = (EditText) view.findViewById(R.id.txtResultadoMaxb);
        calcularMaxb = (Button) view.findViewById(R.id.btnCalcularMaxb);

        calcularMaxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularMaxb();
            }
        });
        return view;
    }


    private void CalcularMaxb(){

        try {
            int NumMax1b,NumMax2b,NumMax3b,mx1,mx2;
            NumMax1b = Integer.parseInt(numMax1b.getText().toString().trim());
            NumMax2b = Integer.parseInt(numMax2b.getText().toString().trim());
            NumMax3b = Integer.parseInt(numMax3b.getText().toString().trim());
            mx1 =Math.max(NumMax1b,NumMax2b);
            mx2 =Math.max(NumMax3b,mx1);
            resultadoMaxb.setText("El numero maximo de "+ NumMax1b + " y "+     NumMax2b +" y "+ NumMax3b + " es : " + mx2);
        }catch (Exception e){
            activity = getActivity();
            Toast.makeText(activity,"¡ERROR!. Ingrese numeros enteros en los campos",Toast.LENGTH_LONG).show();
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
