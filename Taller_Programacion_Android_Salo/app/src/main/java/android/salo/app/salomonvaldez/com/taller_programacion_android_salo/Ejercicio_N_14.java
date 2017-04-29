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

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_14.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_14 extends Fragment {
    private EditText Texto,ResultadoTexto;
    private Button Verificar;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_14() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_14, container, false);
        Texto = (EditText) view.findViewById(R.id.txtLetra);
        ResultadoTexto = (EditText) view.findViewById(R.id.txtResultado);
        Verificar = (Button) view.findViewById(R.id.btnVerificar);
                Verificar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        VerificarLetra();
                    }
                });
        return  view;
    }


    private  void VerificarLetra(){
        String Letra ;
        Letra = Texto.getText().toString().toLowerCase().trim();

        switch(Letra){
            case "a":
                ResultadoTexto.setText(" es vocal");
                break;
            case "e":
                ResultadoTexto.setText(" es vocal");
                break;
            case "i":
                ResultadoTexto.setText(" es vocal");
                break;
            case "o":
                ResultadoTexto.setText(" es vocal");
                break;
            case "u":
                ResultadoTexto.setText(" es vocal");
                break;
            default:
                ResultadoTexto.setText(" es consonante ");
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
