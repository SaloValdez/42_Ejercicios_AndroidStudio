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
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static java.lang.Integer.parseInt;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_37.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_37 extends Fragment {
    private EditText cuotaFija,consumoAgua;
    private TextView resultadoAgua;
    private Button calcularAgua;
    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_37() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_37, container, false);
                cuotaFija = (EditText) view.findViewById(R.id.txtCuotaFija);
                consumoAgua = (EditText) view.findViewById(R.id.txtConsumoAgua);
                resultadoAgua = (TextView) view.findViewById(R.id.tvResultadoAgua);
                calcularAgua = (Button)  view.findViewById(R.id.btnCalcularAgua);

                calcularAgua.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CalcularConsumoAgua();
                    }
                });
        return view;
    }
    private  void CalcularConsumoAgua (){
        Double LitrosConsumo,CuotaFijoMensual,TotalPago;
        LitrosConsumo = Double.parseDouble(consumoAgua.getText().toString().trim());
        CuotaFijoMensual = Double.parseDouble(cuotaFija.getText().toString().trim());
        Double opcion1 = 0.0;
        Double opcion2 = 0.1;
        Double opcion3 = 0.3;
        Double gratis = 50.0;
        Double LitrosAdicional;
        Double PagoAdicional;
        LitrosAdicional = LitrosConsumo - gratis;

        if (LitrosConsumo <=50){
            TotalPago = CuotaFijoMensual + opcion1;
            resultadoAgua.setText("Total a pagar: S/. "+TotalPago);
        }
        if (LitrosConsumo >50 && LitrosConsumo <=200){
            PagoAdicional = LitrosAdicional * opcion2;
            TotalPago = CuotaFijoMensual + PagoAdicional;
            resultadoAgua.setText("Total a pagar: S/. "+TotalPago);
        }
        if (LitrosConsumo > 200){
            PagoAdicional = LitrosAdicional * opcion3;
            TotalPago = CuotaFijoMensual + PagoAdicional;
            resultadoAgua.setText("Total a pagar: S/. "+TotalPago);
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
