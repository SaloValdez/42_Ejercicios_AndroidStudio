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
 * {@link Ejercicio_N_09.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_09 extends Fragment {
   private EditText Num1, Num2, Num3,CalcularOrdenNum;
    private Button CalcularOrden;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_09() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_09, container, false);
            Num1 = (EditText) view.findViewById(R.id.txtNumero1);
            Num2 = (EditText) view.findViewById(R.id.txtNumero2);
            Num3 = (EditText) view.findViewById(R.id.txtNumero3);
            CalcularOrdenNum = (EditText) view.findViewById(R.id.txtOrden);
            CalcularOrden = (Button) view.findViewById(R.id.btnCalcularMayor);

        CalcularOrden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrdenarNumeros();
            }
        });

        return view;
    }

    private void OrdenarNumeros(){
        Integer num1, num2, num3;
        String  sal;
        sal = Num1.getText().toString().trim();
        num1 = Integer.parseInt(Num1.getText().toString());
        num2 = Integer.parseInt(Num2.getText().toString());
        num3 = Integer.parseInt(Num3.getText().toString());

        if (Num1.getText().equals("")) {
            CalcularOrdenNum.setText("Falta llenar campos");
        }else {

            if (num1 > num2 && num2 > num3){

                CalcularOrdenNum.setText("El orden es : " + num1  + " - " + num2  + " - "  + num3);

            } else  if (num2 > num1 && num1 > num3){

                CalcularOrdenNum.setText("El orden es : " + num2 + " - " + num1  + " - "  + num3);

            }else  if (num2 > num3 && num3 > num1){
                CalcularOrdenNum.setText("El orden es : " + num2 + " - " + num3  + " - "  + num1);
            }else if (num3 > num2 && num2 > num1){
                CalcularOrdenNum.setText("El orden es : " + num3 + " - " + num2  + " - "  + num1);

            }  else if(num1 > num3 && num3 > num2){
                CalcularOrdenNum.setText("El orden es : " + num1 + " - " + num3  + " - "  + num2);
            }else  if (num3> num1 && num1 > num2){

                CalcularOrdenNum.setText("El orden es : " + num3 + " - " + num1  + " - "  + num2);

            }

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
