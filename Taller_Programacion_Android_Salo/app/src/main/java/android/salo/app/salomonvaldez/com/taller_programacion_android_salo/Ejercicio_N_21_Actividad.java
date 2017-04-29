package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.res.Resources;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Ejercicio_N_21_Actividad extends AppCompatActivity {
        private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio__n_21__actividad);
        inicializarTabs();

    }

    private  void inicializarTabs(){

        tabHost = (FragmentTabHost) findViewById(R.id.tabHost);
        tabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);

        Resources res = getResources();



        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3");

        tab1.setIndicator(res.getString(R.string.pes1String),null);
        tab2.setIndicator(res.getString(R.string.pes2String),null);
        tab3.setIndicator(res.getString(R.string.pes3String),null);

        //añadiendo las clases y pestañlas
        tabHost.addTab(tab1,Ejercicio_N_21_Equilatero.class, null);
        tabHost.addTab(tab2,Ejercicio_N_21_Escaleno.class, null);
        tabHost.addTab(tab3,Ejercicio_N_21_Isosceles.class, null);


    }


}
