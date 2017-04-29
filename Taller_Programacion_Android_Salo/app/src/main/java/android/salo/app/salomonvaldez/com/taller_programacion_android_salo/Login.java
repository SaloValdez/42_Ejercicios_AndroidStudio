package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText Usuario,Contrasena;
    private Cursor fila;
    Button Ingresar,Registrarse;
    Activity Activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Usuario =(EditText) findViewById(R.id.txtUsuario);
        Contrasena = (EditText) findViewById(R.id.txtContrasena);
        Ingresar = (Button) findViewById(R.id.btnIngresar);
        Registrarse = (Button) findViewById(R.id.btnRegistrarse);

        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IngresarApp();
            }
        });

        Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Registro.class);
                startActivity(intent);
            }
        });
    }

    public void  IngresarApp (){
        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String usuario=Usuario.getText().toString();
        String contrasena=Contrasena.getText().toString();
        fila=db.rawQuery("select usuario,contrasena from usuarios where usuario='"+usuario+"' and contrasena='"+contrasena+"'",null);
        if (fila.moveToFirst()){
            String usua=fila.getString(0);
            String pass=fila.getString(1);
            if (usuario.equals(usua)&&contrasena.equals(pass)){
                Intent ven=new Intent(Login.this,MainActivity.class);
                startActivity(ven);
                Usuario.setText("");
                Contrasena.setText("");
            }
        }
    }


    public void salir(View v){
        finish();
        //System.exit(0);
    }



}
