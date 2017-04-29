package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_01.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_01 extends Fragment {

    private OnFragmentInteractionListener mListener;

    ListView ListViewNumeros;
    EditText EditTextInicio,EditTextFinal;
    Button ButtonCalcular;

    List<String> item = null;


    public Ejercicio_N_01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_01, container, false);
        ListViewNumeros = (ListView) view.findViewById(R.id.listView_Primo);
        EditTextInicio = (EditText) view.findViewById(R.id.txtInicio);
        EditTextFinal = (EditText) view.findViewById(R.id.txtFinal);
        ButtonCalcular = (Button) view.findViewById(R.id.btnCalcular);

        ButtonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumerosPrimos();
            }
        });


        return view;

    }
    private void NumerosPrimos (){

       try {
           String Valor1;
           String Valor2;
           int NumInicio, NumFinal, contador, contador2 = 0, contador3 = 0;
           Valor1 = EditTextInicio.getText().toString();  //para obtener los valores de editText
           Valor2 = EditTextFinal.getText().toString();  //para obtener los valores de editText
           if (Valor1.equals("")){
               EditTextInicio.requestFocus();
           }else{
               if (Valor2.equals("")){
                   EditTextFinal.requestFocus();
               }else {
                   //convertiendo variables a tipo entero
                   NumInicio = Integer.parseInt(Valor1);
                   NumFinal = Integer.parseInt(Valor2);
                   //declarando arreglos
                   String[] Primos = new  String[NumFinal];

                   item = new ArrayList<String>();
                   contador2 = 0;
                   contador3 = 0;
                   //*CICLO FOR QUE RECORRE UN VALOR EMPESANDO POR EL VALOR EN LA VARIABLE INICO HASTA VALOR FINAL*//*
                   for (int i =NumInicio; i<=NumFinal; i++){
                       contador = 0;
                       //*Ciclo que evalua todos los numeros que son dicisibles por si mismos*//*
                       for (int j = 1; j <= i; j++){
                           //condicion que si i%j es la divion para buscar el residuo  y si el residuo es igual a 0 el contador se incremneta en uno
                           if (i%j ==0){
                               contador ++;
                           }
                       }
                       if (contador ==2){
                           Primos[contador2] = String.valueOf(i);
                           String numeros1=Primos[contador2];
                           item.add("Numero Primos: " + numeros1);
                           contador2++;
                       }
                   }
                   //----------------------
                   //creando adaptador de tipo ArrayAdapter
                   ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,item);
                   ListViewNumeros.setAdapter(adaptador);
               }
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
