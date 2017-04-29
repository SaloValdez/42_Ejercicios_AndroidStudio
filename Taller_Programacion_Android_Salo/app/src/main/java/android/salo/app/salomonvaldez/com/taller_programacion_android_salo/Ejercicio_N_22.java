package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.M;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_22.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_22 extends Fragment  implements RadioGroup.OnCheckedChangeListener{

    private RadioButton Hectogramo,Decagramo,Gramo,Decigramo,Centigramo,Miligramo,Libras,Toneladas,Onzas,Quilates;
    private EditText Kilogramos,Resultado;
    private RadioGroup rg1;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_22() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_22, container, false );

        Hectogramo = (RadioButton)view.findViewById(R.id.radioHectogramo);
        Decagramo = (RadioButton)view.findViewById(R.id.radioDecagramo);
        Gramo = (RadioButton)view.findViewById(R.id.radioGramo);
        Decigramo = (RadioButton)view.findViewById(R.id.radioDecigramo);
        Centigramo= (RadioButton)view.findViewById(R.id.radioCentigramo);
        Miligramo = (RadioButton)view.findViewById(R.id.radioMiligramo);
        Libras = (RadioButton)view.findViewById(R.id.radioLibras);
        Toneladas = (RadioButton)view.findViewById(R.id.radioToneladas);
        Onzas = (RadioButton)view.findViewById(R.id.radioOnzas);
        Quilates = (RadioButton)view.findViewById(R.id.radioQuilates);
        Kilogramos = (EditText) view.findViewById(R.id.txtKilogramos);
        Resultado = (EditText) view.findViewById(R.id.txtResultado);
        rg1 = (RadioGroup) view.findViewById(R.id.rg1);

        //radioGrup
    rg1.setOnCheckedChangeListener(this);


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

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int kg;
        Double lb,t,oz,ct,mg;
        long cg,dg ,g , dag,hg;

        kg = Integer.parseInt(Kilogramos.getText().toString().trim());

        if (Hectogramo.isChecked()){
            hg = kg * 10;
            Resultado.setText( hg + " Hectogramos");
            Resultado.setTextColor(Color.RED);
        }
        if (Decagramo.isChecked()){
            dag = kg * 100;
            Resultado.setText( dag + " Decagramos");
            Resultado.setTextColor(Color.RED);
        }
        if (Gramo.isChecked()){
            g = kg * 1000;
            Resultado.setText( g + " Gramos");
            Resultado.setTextColor(Color.RED);
        }
        if (Decigramo.isChecked()){
            dg = kg * 10000;
            Resultado.setText( dg + " Decigramos");
            Resultado.setTextColor(Color.RED);
        }
        if (Centigramo.isChecked()){
            cg = kg * 10000;
            Resultado.setText( cg + " Centigramos");
            Resultado.setTextColor(Color.RED);
        }
        if (Miligramo.isChecked()){
            mg = kg * 1000.0;
            Resultado.setText( mg + " Miligramos");
            Resultado.setTextColor(Color.RED);
        }
        if (Libras.isChecked()){
            lb = kg /0.4536;
            Resultado.setText( lb + " Libras");
            Resultado.setTextColor(Color.RED);
        }
        if (Toneladas.isChecked()){
            t = kg * 0.001;
            Resultado.setText( t + " Toneladas");
            Resultado.setTextColor(Color.RED);
        }

        if (Onzas.isChecked()){
            oz = kg * 35.27396194958 ;
            Resultado.setText( oz + " Onzas");
            Resultado.setTextColor(Color.RED);
        }
        if (Quilates.isChecked()){
            ct = kg * 5000.0 ;
            Resultado.setText( ct + " Quilates");
            Resultado.setTextColor(Color.RED);
        }
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
