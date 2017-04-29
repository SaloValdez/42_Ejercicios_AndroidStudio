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
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_04.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_04 extends Fragment {
    EditText NumeroDia,Rdia;
    Button CalcularDia;


    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_04() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_04, container, false);
        NumeroDia= (EditText)view.findViewById(R.id.txtNumeroDia);
        CalcularDia = (Button)view.findViewById(R.id.btnCalcularDia);
        Rdia = (EditText)view.findViewById(R.id.TxtResultadoDia);
        CalcularDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int lee ;
                    lee = Integer.parseInt(NumeroDia.getText().toString());

                    switch (lee){
                        case 1:
                            Rdia.setText("Es Domingo");
                            break;
                        case 2:
                            Rdia.setText("Es Lunes");
                            break;
                        case 3:
                            Rdia.setText("Es Martes");
                            break;
                        case 4:
                            Rdia.setText("Es Miercoles");
                            break;
                        case 5:
                            Rdia.setText("Es Jueves");
                            break;
                        case 6:
                            Rdia.setText("Es Viernes");
                            break;
                        case 7:
                            Rdia.setText("Es Sabado");

         /*   default:
                DiaNumero.setText("El número no pertence a ningun dia de la semana");
                break;*/
                    }
                }catch (Exception e){
                    Activity Actividad;
                    Actividad = getActivity();
                    Toast.makeText(Actividad,"Hay algun Error. Comuniquese con el adminstrador",Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }

    //metodo para calcular dia
    private void CalcularDia(){

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
