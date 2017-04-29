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
 * {@link Ejercicio_N_24.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_24 extends Fragment {
   private EditText Hora,Minutos,Segundos,Resultado;
    private Button Calcular;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_24() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_24, container, false);
        Hora = (EditText) view.findViewById(R.id.txtHoras);
        Minutos = (EditText) view.findViewById(R.id.txtMinutos);
        Segundos = (EditText) view.findViewById(R.id.txtSegundos);
        Resultado = (EditText) view.findViewById(R.id.txtResultado);
        Calcular = (Button) view.findViewById(R.id.btnCalcular);


        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int horas,minutos,segundos;
                horas = Integer.parseInt(Hora.getText().toString().trim());
                minutos = Integer.parseInt(Minutos.getText().toString().trim());
                segundos = Integer.parseInt(Segundos.getText().toString());
                    /* POSIBILIDADES
	                	posibles casos --> 01:05:23  	 01:05:59  01:59:59  12:59:59
		                actualizando   --> 01:05:24	     01:06:00  02:00:00  01:00:00
	                */
                segundos = segundos + 1;
                if (segundos >= 59 ){

                    segundos = 0;
                    minutos = minutos + 1;
                    if (minutos >=59){
                        minutos = 0;
                        horas = horas + 1;
                        if (horas>=13){
                            horas = 1;
                        }

                    }
                }
                String hcero,mcero,scero;
                //Incertando los ceros
                if (horas < 10){
                    hcero = "0";
                }
                if (minutos < 10){
                    mcero = "0";
                }
                if (segundos <10){
                    scero = "0";
                }
                Resultado.setText(""   + horas + " : " + minutos + " : " + segundos);
            }
        });
        return view;
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
