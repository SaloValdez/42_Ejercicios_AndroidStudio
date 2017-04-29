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
 * {@link Ejercicio_N_18.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_18 extends Fragment {
    private EditText num1,num2,comentario,comentario2,comparando;
    private Button calcular;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_18() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_18, container, false);
        num1 = (EditText) view.findViewById(R.id.txtNum1);
        num2 = (EditText) view.findViewById(R.id.txtNum2);
        comentario = (EditText) view.findViewById(R.id.txtMensaje);
        comentario2 = (EditText) view.findViewById(R.id.txtMensaje2);
        comparando = (EditText) view.findViewById(R.id.txtComparando);
        calcular = (Button) view.findViewById(R.id.btnCalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarPrimo();
            }
        });
        return view;
    }


    private void VerificarPrimo(){
        int Num1,Num2, cont,cont2,primo1,primo2;
        cont=0;
        cont2 = 0;
        primo1 = 0;
        primo2 = 0;

        Num1 = Integer.parseInt(num1.getText().toString().trim());
        Num2 = Integer.parseInt(num2.getText().toString().trim());
        //System.out.println("Proporcion... numero");
        //n = scn.nextInt();
        for (int i=1; i<=Num1; i++) {
            if (Num1 % i == 0){
                cont = cont + 1;
            }
        }
        if (cont==2){
           comentario.setText("El numero 1 es Primo");
            primo1 = 2;
        } else {
            comentario.setText("El numero 1 no es primo");
        }

        //---------------
        for (int i=1; i<=Num2; i++) {
            if (Num2 % i == 0){
                cont2 = cont2 + 1;
            }
        }
        if (cont2==2){
            comentario2.setText("El numero 2 es Primo");
             primo2 = 2;
        } else {
            comentario2.setText("El numero 2 no es primo");
        }

        if (primo1 ==  2 && primo2 ==2){
            comparando.setText("Ambos numeros son primos");


        }else{
            comparando.setText("Uno o los dos no son Numeros Primos");
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
