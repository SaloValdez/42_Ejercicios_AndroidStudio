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
 * {@link Ejercicio_N_32.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_32 extends Fragment {
    private EditText numImp,resultadoImp;
    private Button verificarImp;
    private OnFragmentInteractionListener mListener;
    public Activity activity;

    public Ejercicio_N_32() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_32, container, false);

        numImp = (EditText)view.findViewById(R.id.txtNumeroImp);
        resultadoImp = (EditText)view.findViewById(R.id.txtResultadoImp);
        verificarImp = (Button) view.findViewById(R.id.btnVerificarImp);
        verificarImp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarImpar();
            }
        });
        return view;
    }
    private void VerificarImpar(){
        try {
            int num;
            num = Integer.parseInt(numImp.getText().toString().trim());

            if (!(num % 2 ==0)){
                resultadoImp.setText("El numero Es Impar");
            }else {
                resultadoImp.setText("No es Impar");
            }
        }catch (Exception e){
            activity = getActivity();
            Toast.makeText(activity,"Ingrese un numero entero",Toast.LENGTH_SHORT).show();
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
