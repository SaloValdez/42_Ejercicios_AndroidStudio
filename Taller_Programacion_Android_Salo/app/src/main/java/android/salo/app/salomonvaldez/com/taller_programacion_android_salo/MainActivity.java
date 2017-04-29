package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener,
        Ejercicio_N_01.OnFragmentInteractionListener,
        Ejercicio_N_02.OnFragmentInteractionListener,
        Ejercicio_N_03.OnFragmentInteractionListener,
        Ejercicio_N_04.OnFragmentInteractionListener,
        Ejercicio_N_05.OnFragmentInteractionListener,
        Ejercicio_N_06.OnFragmentInteractionListener,
        Ejercicio_N_07.OnFragmentInteractionListener,
        Ejercicio_N_08.OnFragmentInteractionListener,
        Ejercicio_N_09.OnFragmentInteractionListener,
        Ejercicio_N_10.OnFragmentInteractionListener,
        Ejercicio_N_11.OnFragmentInteractionListener,
        Ejercicio_N_12.OnFragmentInteractionListener,
        Ejercicio_N_13.OnFragmentInteractionListener,
        Ejercicio_N_14.OnFragmentInteractionListener,
        Ejercicio_N_15.OnFragmentInteractionListener,
        Ejercicio_N_16.OnFragmentInteractionListener,
        Ejercicio_N_17.OnFragmentInteractionListener,
        Ejercicio_N_18.OnFragmentInteractionListener,
        Ejercicio_N_19.OnFragmentInteractionListener,
        Ejercicio_N_20.OnFragmentInteractionListener,
        Ejercicio_N_22.OnFragmentInteractionListener,
        Ejercicio_N_23.OnFragmentInteractionListener,
        Ejercicio_N_24.OnFragmentInteractionListener,
        Ejercicio_N_25.OnFragmentInteractionListener,
        Ejercicio_N_26.OnFragmentInteractionListener,
        Ejercicio_N_27.OnFragmentInteractionListener,
        Ejercicio_N_28.OnFragmentInteractionListener,
        Ejercicio_N_29.OnFragmentInteractionListener,
        Ejercicio_N_30.OnFragmentInteractionListener,
        Ejercicio_N_31.OnFragmentInteractionListener,
        Ejercicio_N_32.OnFragmentInteractionListener,
        Ejercicio_N_33.OnFragmentInteractionListener,
        Ejercicio_N_34.OnFragmentInteractionListener,
        Ejercicio_N_35.OnFragmentInteractionListener,
        Ejercicio_N_36.OnFragmentInteractionListener,
        Ejercicio_N_37.OnFragmentInteractionListener,
        Ejercicio_N_38.OnFragmentInteractionListener,
        Ejercicio_N_39.OnFragmentInteractionListener,
        Ejercicio_N_40.OnFragmentInteractionListener,
        Ejercicio_N_41.OnFragmentInteractionListener,
        Ejercicio_N_42.OnFragmentInteractionListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "El " ,Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        boolean FragmentTransaction = false;
        Fragment fragment = null;


        if (id == R.id.nav_Ejercicio1) {
            fragment = new Ejercicio_N_01();
            FragmentTransaction = true;
        } else if (id == R.id.nav_Ejercicio2) {
            fragment = new Ejercicio_N_02();
            FragmentTransaction = true;

        } else if (id == R.id.nav_Ejercicio3) {
            fragment = new Ejercicio_N_03();
            FragmentTransaction = true;
        } else if (id == R.id.nav_Ejercicio4) {
            fragment = new Ejercicio_N_04();
            FragmentTransaction = true;
           // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");

        }else if (id == R.id.nav_Ejercicio5) {
            fragment = new Ejercicio_N_05();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");

        }else if (id == R.id.nav_Ejercicio6) {
            fragment = new Ejercicio_N_06();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");

        }else if (id == R.id.nav_Ejercicio7) {
            fragment = new Ejercicio_N_07();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");

        }else if (id == R.id.nav_Ejercicio8) {
            fragment = new Ejercicio_N_08();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio9) {
            fragment = new Ejercicio_N_09();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio10) {
            fragment = new Ejercicio_N_10();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio11) {
            fragment = new Ejercicio_N_11();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio12) {
            fragment = new Ejercicio_N_12();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }
        else if (id == R.id.nav_Ejercicio13) {
            fragment = new Ejercicio_N_13();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio14) {
            fragment = new Ejercicio_N_14();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio15) {
            fragment = new Ejercicio_N_15();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio16) {
            fragment = new Ejercicio_N_16();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio17) {
            fragment = new Ejercicio_N_17();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio18) {
            fragment = new Ejercicio_N_18();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio19) {
            fragment = new Ejercicio_N_19();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio20) {
            fragment = new Ejercicio_N_20();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio21) {
               Intent siguiente = new Intent(MainActivity.this,Ejercicio_N_21_Actividad.class);
            startActivity(siguiente);
            //fragment = new Ejercicio_N_21();
            //FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio22) {
            fragment = new Ejercicio_N_22();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio23) {
            fragment = new Ejercicio_N_23();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio24) {
            fragment = new Ejercicio_N_24();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio25) {
            fragment = new Ejercicio_N_25();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio26) {
            fragment = new Ejercicio_N_26();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio27) {
            fragment = new Ejercicio_N_27();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio28) {
            fragment = new Ejercicio_N_28();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio29) {
            fragment = new Ejercicio_N_29();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio30) {
        fragment = new Ejercicio_N_30();
        FragmentTransaction = true;
        // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
        //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio31) {
            fragment = new Ejercicio_N_31();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio32) {
            fragment = new Ejercicio_N_32();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio33) {
            fragment = new Ejercicio_N_33();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio34) {
            fragment = new Ejercicio_N_34();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio35) {
            fragment = new Ejercicio_N_35();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio36) {
            fragment = new Ejercicio_N_36();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio37) {
            fragment = new Ejercicio_N_37();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio38) {
            fragment = new Ejercicio_N_38();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio39) {
        fragment = new Ejercicio_N_39();
        FragmentTransaction = true;
        // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
        //getSupportActionBar().setTitle("SALOMON2");
        }else if (id == R.id.nav_Ejercicio40) {
            fragment = new Ejercicio_N_40();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }
        else if (id == R.id.nav_Ejercicio41) {
        fragment = new Ejercicio_N_41();
        FragmentTransaction = true;
        // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
        //getSupportActionBar().setTitle("SALOMON2");
        }
        else if (id == R.id.nav_Ejercicio42) {
            fragment = new Ejercicio_N_42();
            FragmentTransaction = true;
            // Log.i("NavigationDrawer","Entro a la opcion MANAGE");
            //getSupportActionBar().setTitle("SALOMON2");
        }







        else if (id == R.id.nav_share) {
            Log.i("NavigationDrawer","Entro a la opcion SHARE");
            getSupportActionBar().setTitle("SALOMON3");
        } else if (id == R.id.nav_send) {
            Log.i("NavigationDrawer","Entro a la opcion SEND");
            getSupportActionBar().setTitle("SALOMON4");
        }

        if(FragmentTransaction){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,fragment).commit();

            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
