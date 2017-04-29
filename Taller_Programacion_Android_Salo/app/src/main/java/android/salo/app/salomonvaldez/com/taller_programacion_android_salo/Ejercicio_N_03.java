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

public class Ejercicio_N_03 extends Fragment {
    private OnFragmentInteractionListener mListener;
    EditText GradosCelsius;
    TextView Gradosfahrenheit;
    Button ConvertirGrados;
    public Ejercicio_N_03() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_03, container, false);
        GradosCelsius = (EditText)view.findViewById(R.id.txtGradosCelsius);
        ConvertirGrados =(Button) view.findViewById(R.id.btnConvertir);
        Gradosfahrenheit = (TextView)view.findViewById(R.id.txtvFahrenheit);
        ConvertirGrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertirGrados();
            }
        });
        return view;
    }
    private void ConvertirGrados(){

        try {
            Double ValorGrados;
            Double Farenheit;
            ValorGrados = Double.valueOf(GradosCelsius.getText().toString());

            Farenheit = ((9/5)* ValorGrados) + 32;
            Gradosfahrenheit.setText("" + Farenheit);
        }catch (Exception e){
            Activity Actividad;
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
