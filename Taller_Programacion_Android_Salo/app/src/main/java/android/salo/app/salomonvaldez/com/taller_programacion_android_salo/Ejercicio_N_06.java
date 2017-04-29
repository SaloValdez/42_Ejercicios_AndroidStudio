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

import static android.os.Build.VERSION_CODES.N;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_06.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_06 extends Fragment {

    private OnFragmentInteractionListener mListener;
    EditText NumMes, Mes;
    Button CalcularMes;

    public Ejercicio_N_06() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_06, container, false);
        NumMes = (EditText) view.findViewById(R.id.txtNumMes);
        Mes = (EditText) view.findViewById(R.id.txtMes);
        CalcularMes = (Button) view.findViewById(R.id.btnCalcularMes);
        CalcularMes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularMes ();
            }
        });




        return view;
    }


    private  void CalcularMes () {
        int NumDia;
        NumDia = Integer.parseInt(NumMes.getText().toString());

        if (NumMes.equals("")){
            Mes.setText("Ingrese un numero del 1 al 12");
            NumMes.requestFocus();
        }else {
            switch (NumDia) {
                case 1:
                    Mes.setText("Es Enero");
                    break;
                case 2:
                    Mes.setText("Es Febrero");
                    break;
                case 3:
                    Mes.setText("Es Marzo");
                    break;
                case 4:
                    Mes.setText("Es Abril");
                    break;
                case 5:
                    Mes.setText("Es Mayo");
                    break;
                case 6:
                    Mes.setText("Es Junio");
                    break;
                case 7:
                    Mes.setText("Es Julio");
                    break;
                case 8:
                    Mes.setText("eS Agosto");
                    break;
                case 9:
                    Mes.setText("Es Septiembre");
                    break;
                case 10:
                    Mes.setText("Es Octubre");
                    break;
                case 11:
                    Mes.setText("Es Noviembre");
                    break;
                case 12:
                    Mes.setText("Es Diciembre");
                    break;
                default:
                    Mes.setText("No pertenece a nungun Mes");
                    break;
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
