package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_10.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_10 extends Fragment {
    private EditText numTabla;
    private Button CalcularTabla;
    private ListView ListarTabla;
    List<String> item = null;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_10() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_10, container, false);
                numTabla = (EditText) view.findViewById(R.id.txtNumeroTabla);
                CalcularTabla = (Button) view.findViewById(R.id.btnMostrarTabla);
            ListarTabla = (ListView) view.findViewById(R.id.listView_Tabla);

        CalcularTabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MostrarTablaMultiplicacion();
            }
        });
        return view;
    }

    private  void MostrarTablaMultiplicacion(){
        Integer num;
        Integer rdo;
        Integer i;
        Integer r = 12;
        num = Integer.parseInt(numTabla.getText().toString().trim());
       if (num > 12){
           numTabla.setError("Ingrese un numero menor al 13");
       }else {
        if (num < 13) {
            item = new ArrayList<String>();
            for (i = 1; i <= 12; i++){
                rdo = i * num;
                //construyendo la tabla
                item.add(" " + num +  " x " + i + " = " + rdo);
            }
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,item);
            ListarTabla.setAdapter(adaptador);
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
