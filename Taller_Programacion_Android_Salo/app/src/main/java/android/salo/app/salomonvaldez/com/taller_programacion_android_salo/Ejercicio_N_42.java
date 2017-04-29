package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_42.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Ejercicio_N_42#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ejercicio_N_42 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private EditText Hectareas,SuperficieM2,Ppino,Poyameles,Pcedro,CantPino,CantOyameles,CantCedro,Total;
    private Button CalcularArboles;
    private Activity Actividad;
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    public Ejercicio_N_42() {
        // Required empty public constructor
    }
    public static Ejercicio_N_42 newInstance(String param1, String param2) {
        Ejercicio_N_42 fragment = new Ejercicio_N_42();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_42, container, false);
        Hectareas = (EditText) view.findViewById(R.id.txtHectareas);
        SuperficieM2 = (EditText) view.findViewById(R.id.txtSuperficieM2);
        Ppino = (EditText) view.findViewById(R.id.txtPorcentajePino);
        Poyameles = (EditText) view.findViewById(R.id.txtPorcentajeOyameles);
        Pcedro = (EditText) view.findViewById(R.id.txtPorcentajeCedro);
        CantPino = (EditText) view.findViewById(R.id.txtCantidadPino);
        CantOyameles = (EditText) view.findViewById(R.id.txtCantidadOyameles);
        CantCedro = (EditText) view.findViewById(R.id.txtCantidadCedro);
        Total = (EditText) view.findViewById(R.id.txtTotalArboles);
        CalcularArboles = (Button) view.findViewById(R.id.btnCalcularCantidad);

        CalcularArboles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularCantidadArboles();
            }
        });



        return  view;
    }

    private  void CalcularCantidadArboles(){
        try {
            float numHectareas,numMetros2;
            numHectareas = Float.parseFloat(Hectareas.getText().toString().trim());
            numMetros2 = numHectareas * 10000;
            SuperficieM2.setText("" + numMetros2);
            String pino,oyamel,cedro;
            float pinoDisp =10, oyamelDisp=15,cedroDisp=18;
            double  m2pino,m2oyamel,m2cedro,Tpino,Toyamel,Tcedro;

            if (numMetros2 > 100000){
                pino = "70%";
                oyamel = "20%";
                cedro = "10%";
                Ppino.setText(pino);
                Poyameles.setText(oyamel);
                Pcedro.setText(cedro);



                //m2 disponibles para cada tipo de arbol
                m2pino = numMetros2 * 0.70;
                m2oyamel = numMetros2 * 0.20;
                m2cedro = numMetros2 * 0.10;

                Tpino =(m2pino / pinoDisp) * 8;
                Toyamel =(m2oyamel / oyamelDisp) * 15;
                Tcedro =(m2cedro / cedroDisp) * 10;

                int numA = (int) Tpino;
                int numB = (int) Toyamel;
                int numC = (int) Tcedro;
                CantPino.setText("" +numA + "  'Pinos' ");
                CantOyameles.setText("" +numB + "  'Oyameles' ");
                CantCedro.setText("" + numC + "  'Cedros' ");
                float TotalArboles = numA + numB + numC;
                int numD = (int) TotalArboles;
                Total.setText("" + numD + " Árboles");
            }else if (numMetros2 <= 100000){
                pino = "50%";
                oyamel = "30%";
                cedro = "20%";
                Ppino.setText(pino);
                Poyameles.setText(oyamel);
                Pcedro.setText(cedro);



                //m2 disponibles para cada tipo de arbol
                m2pino = numMetros2 * 0.50;
                m2oyamel = numMetros2 * 0.30;
                m2cedro = numMetros2 * 0.20;

                Tpino =(m2pino / pinoDisp) * 8;
                Toyamel =(m2oyamel / oyamelDisp) * 15;
                Tcedro =(m2cedro / cedroDisp) * 10;

                int numA = (int) Tpino;
                int numB = (int) Toyamel;
                int numC = (int) Tcedro;
                CantPino.setText("" +numA + "  'Pinos' ");
                CantOyameles.setText("" +numB + "  'Oyameles' ");
                CantCedro.setText("" + numC + "  'Cedros' ");
                float TotalArboles = numA + numB + numC;
                int numD = (int) TotalArboles;
                Total.setText("" + numD + " Árboles");
            }




        }catch (Exception e){
            Actividad = getActivity();
            Toast.makeText(Actividad,"Hay algun Error. Comuniquese con el adminstrador",Toast.LENGTH_LONG).show();
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
