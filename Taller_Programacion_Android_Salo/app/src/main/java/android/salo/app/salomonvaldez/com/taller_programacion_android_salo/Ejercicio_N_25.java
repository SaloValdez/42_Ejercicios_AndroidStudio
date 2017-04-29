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
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static java.lang.Integer.parseInt;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_25.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_25 extends Fragment {
    private EditText sueldoAnual,resultado;
    private Button calcular;
    private RadioGroup rdGrupo;
    private RadioButton a,b,c,d;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_25() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejercicio__n_25, container, false);
            sueldoAnual = (EditText) view.findViewById(R.id.txtSueldoAnual);
        resultado = (EditText) view.findViewById(R.id.txtSueldoNeto);
        calcular = (Button) view.findViewById(R.id.btnCalcular);
        rdGrupo = (RadioGroup) view.findViewById(R.id.radioGrupoOpciones);
        a = (RadioButton) view.findViewById(R.id.radio10Años);
        b = (RadioButton) view.findViewById(R.id.radioMenos10años);
        c = (RadioButton) view.findViewById(R.id.radioMenos5Años);
        d = (RadioButton) view.findViewById(R.id.radioMenos3Años);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularSueldo();
            }
        });
        return view;
    }
    private void CalcularSueldo(){
        Double sa,aumento,neto;
        String mostrarAumento;
        sa =Double.parseDouble(sueldoAnual.getText().toString().trim());

        if (a.isChecked()){
            aumento = sa * 0.10;
            neto = sa + aumento;
            mostrarAumento = "10%";
            resultado.setText("Aumento: ("+mostrarAumento+") \n" +"Sueldo neto: " + neto);
        }
        if (b.isChecked()){
            aumento = sa *0.07;
            neto = sa + aumento;
            mostrarAumento = "7%";
            resultado.setText("Aumento: ("+mostrarAumento+") \n" +"Sueldo neto: " + neto);
        }
        if (c.isChecked()){
            aumento = sa *0.05;
            neto = sa + aumento;
            mostrarAumento ="5%";
            resultado.setText("Aumento: ("+mostrarAumento+") \n" +"Sueldo neto: " + neto);
        }
        if (d.isChecked()){
            aumento = sa * 0.03;
            neto = sa + aumento;
            mostrarAumento = "3%";
            resultado.setText("Aumento: ("+mostrarAumento+") \n" +"Sueldo neto: " + neto);
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
