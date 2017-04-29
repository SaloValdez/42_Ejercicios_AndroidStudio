package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_36.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_36 extends Fragment {
private EditText numMult1,numMult2,resultadoMult1,resultadoMult2;
    private Button calcularMult;
    private Activity activity;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_36() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_36, container, false);
            numMult1 = (EditText) view.findViewById(R.id.txtNumeroMult1);
        numMult2 = (EditText) view.findViewById(R.id.txtNumeroMult2);
        resultadoMult1 = (EditText) view.findViewById(R.id.txtResultadoMult1);
        resultadoMult2 = (EditText) view.findViewById(R.id.txtResultadoMult2);
        calcularMult = (Button) view.findViewById(R.id.btnCalcularMult);
        calcularMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularMultiplo();
            }
        });
        return view;
    }
    private void CalcularMultiplo(){

        try {

            int numeros1,numeros2;
            numeros1 = Integer.parseInt(numMult1.getText().toString().trim());
            numeros2 = Integer.parseInt(numMult2.getText().toString().trim());
            if (numeros1>numeros2){
                Double num1,num2,mayor;
                num1 = Double.parseDouble(numMult1.getText().toString().trim());
                num2 = Double.parseDouble(numMult2.getText().toString().trim());
                mayor = num1;
                if (mayor%num2== 0){
                    resultadoMult1.setText(mayor + " es multiplo de " + num2);
                }else{
                    resultadoMult1.setText(mayor + " no es multiplo de " + num2);
                }
                if (num2 %mayor ==0){
                    resultadoMult2.setText(num2 + " es multiplo de " + mayor);
                }else{
                    resultadoMult2.setText(num2 + " no es multiplo de " + mayor);
                }
            }else if (numeros1 == numeros2 ){
                int numero1,numero2;
                numero1 = Integer.parseInt(numMult1.getText().toString().trim());
                numero2 = Integer.parseInt(numMult2.getText().toString().trim());
                resultadoMult1.setText(numero1 + " es multiplo de " + numero2);
            }

        }catch (Exception e){
            activity = getActivity();
            Toast.makeText(activity,"¡ERROR!. Ingrese numeros enteros en los campos",Toast.LENGTH_LONG).show();
            resultadoMult1.setText("");
            resultadoMult2.setText("");
            numMult1.requestFocus();

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
