package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.factor;
import static android.R.attr.max;
import static android.R.attr.order;
import static android.os.Build.VERSION_CODES.M;
import static android.os.Build.VERSION_CODES.N;
/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_16.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_16 extends Fragment {
    //copi(SALO): https://www.youtube.com/watch?v=O4iuk9VhqYs#t=563.058491
    private EditText Num1,Num2,Num3,Num4,Num5,Num6,Num7,Num8,Num9,Num10,Resultado,Resultado1;
    private Button Verificar;
    private OnFragmentInteractionListener mListener;
    private ListView Orden;
    List<String> item = null;

    public Ejercicio_N_16() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_16, container, false);
        Num1 = (EditText) view.findViewById(R.id.txtNum1);
        Num2 = (EditText) view.findViewById(R.id.txtNum2);
        Num3 = (EditText) view.findViewById(R.id.txtNum3);
        Num4 = (EditText) view.findViewById(R.id.txtNum4);
        Num5 = (EditText) view.findViewById(R.id.txtNum5);
        Num6 = (EditText) view.findViewById(R.id.txtNum6);
        Num7 = (EditText) view.findViewById(R.id.txtNum7);
        Num8 = (EditText) view.findViewById(R.id.txtNum8);
        Num9 = (EditText) view.findViewById(R.id.txtNum9);
        Num10 = (EditText) view.findViewById(R.id.txtNum10);
        Resultado = (EditText) view.findViewById(R.id.txtResultado);
        Resultado1 = (EditText) view.findViewById(R.id.txtResultado1);
        Orden = (ListView) view.findViewById(R.id.listView_Orden);
        Verificar = (Button) view.findViewById(R.id.btnVerificar);
            Verificar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    VerificarMaxMin();
                }
            });
        return view;
    }





    private void VerificarMaxMin(){
        Integer []Numeros = new Integer[10];
        int aux;
        int cont1;
        int cont2;

        Numeros[0] = Integer.parseInt(Num1.getText().toString().trim());
        Numeros[1] = Integer.parseInt(Num2.getText().toString().trim());
        Numeros[2] = Integer.parseInt(Num3.getText().toString().trim());
        Numeros[3] = Integer.parseInt(Num4.getText().toString().trim());
        Numeros[4] = Integer.parseInt(Num5.getText().toString().trim());
        Numeros[5] = Integer.parseInt(Num6.getText().toString().trim());
        Numeros[6] = Integer.parseInt(Num7.getText().toString().trim());
        Numeros[7] = Integer.parseInt(Num8.getText().toString().trim());
        Numeros[8] = Integer.parseInt(Num9.getText().toString().trim());
        Numeros[9] = Integer.parseInt(Num10.getText().toString().trim());
        item = new ArrayList<String>();
        for(cont1  = 1; cont1 < Numeros.length; cont1++){
            aux = Numeros[cont1];
            for (cont2  = cont1 - 1;cont2 >=0 && Numeros[cont2] > aux; cont2--){
                Numeros[cont2 + 1] = Numeros[cont2];
                Numeros[cont2] = aux;
            }
        }
            for (int i = 0; i< Numeros.length;i++){
                //Resultado.setText("" + Numeros[i]);
                item.add(""+ Numeros[i]);

            }

        Resultado.setText("Mayor  :" + Numeros[9]);
        Resultado1.setText("Menor : " + Numeros[0]);

        //creando adaptador de tipo ArrayAdapter
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,item);
        Orden.setAdapter(adaptador);


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
