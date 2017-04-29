package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.test.suitebuilder.TestMethod;
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
 * {@link Ejercicio_N_38.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_38 extends Fragment {
    private EditText Peso,Altura;
    private Button CalcularImc;
    private TextView ResultadoImc;
    private Activity activity;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_38() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_38, container, false);
            Peso = (EditText) view.findViewById(R.id.txtPesoImc);
        Altura = (EditText) view.findViewById(R.id.txtAlturaImc);
        CalcularImc = (Button) view.findViewById(R.id.btnCalcularImc);
        ResultadoImc = (TextView) view.findViewById(R.id.tvResultadoImc);
        CalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularIMC();
            }
        });
        return view;
    }

    private void CalcularIMC(){

        try{
            Double altura,imc,peso;
            peso = Double.parseDouble(Peso.getText().toString().trim());
            altura = Double.parseDouble(Altura.getText().toString().trim());
            imc = (peso/(altura*altura));
            if (imc < 16){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Criterio de Ingrese al Hospital. "  );
            }else if (imc >=16 && imc <17){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Infrapeso. "  );
            }else if (imc >=17 && imc <18){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Bajo Peso. "  );
            }else if (imc >=18 && imc <25){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Normal (Saludable). "  );
            }else if (imc >=25 && imc <30){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Sobrepeso (Obesidad de Grado I)."  );
            }else if (imc >=30 && imc <35){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Sobrepeso Crónico (Obesidad de Grado II). "  );
            }else if (imc >=35 && imc <40){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Obesidad Premórbida (Obesidad de Grado III). "  );
            }else if ( imc <40){
                ResultadoImc.setText( " - Imc : " + imc + " \n - Estado : Obesidad Mórbida (Obesidad de Grado IV). "  );
            }
        }catch (Exception e){
            activity = getActivity();
            Toast.makeText(activity,"!Error¡. Ingrese su peso y altura.",Toast.LENGTH_SHORT).show();
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
