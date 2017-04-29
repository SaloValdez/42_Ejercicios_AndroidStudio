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
 * {@link Ejercicio_N_34.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_34 extends Fragment {
    private EditText NumMax1,NumMax2,ResultadoMax;
    private Button CalcularMax;
    private Activity activity;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_34() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_34, container, false);

        NumMax1 = (EditText) view.findViewById(R.id.txtNumeroMax1);
        NumMax2 = (EditText) view.findViewById(R.id.txtNumeroMax2);
        ResultadoMax = (EditText) view.findViewById(R.id.txtResultadoMax);
        CalcularMax = (Button) view.findViewById(R.id.btnCalcularMax);
        CalcularMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularNumMax();
            }
        });
        return view;
    }

    private  void CalcularNumMax(){

        try {
            int numMax1,numMax2,producto;
            numMax1 = Integer.parseInt(NumMax1.getText().toString().trim());
            numMax2= Integer.parseInt(NumMax2.getText().toString().trim());
            producto = Math.max(numMax1,numMax2);
            ResultadoMax.setText("El numero maximo de "+ numMax1 + " y "+ numMax2 + " es : " +producto );
        }catch (Exception e){
            activity =getActivity();
            Toast.makeText(activity,"¡ERROR!. Por Favor Ingrese  numeros ENTEROS.",Toast.LENGTH_LONG).show();
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
