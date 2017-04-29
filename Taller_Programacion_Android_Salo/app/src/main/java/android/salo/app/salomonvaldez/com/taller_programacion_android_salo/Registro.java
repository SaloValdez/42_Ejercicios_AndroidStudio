package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.id;
import static android.os.Build.VERSION_CODES.M;

public class Registro extends AppCompatActivity {
        private Button Registrar,Regresar;
    private EditText Id,Usuario,Contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Id = (EditText) findViewById(R.id.txtRid);
        Usuario = (EditText) findViewById(R.id.txtRusuario);
        Contrasena = (EditText) findViewById(R.id.txtRcontrasena);
        Registrar = (Button) findViewById(R.id.btnRegistrar);
        Regresar =(Button) findViewById(R.id.btnRegresar);
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegistrarUsuario();
            }
        });
        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this,Login.class);
                startActivity(intent);
            }
        });
    }

    private void RegistrarUsuario(){
        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String codigo=Id.getText().toString();
        String usuario=Usuario.getText().toString();
        String contraseña=Contrasena.getText().toString();

        ContentValues values=new ContentValues();
        values.put("codigo",codigo);
        values.put("usuario",usuario);
        values.put("contrasena",contraseña);
        db.insert("usuarios",null,values);
        db.close();
        Intent ven=new Intent(this,Login.class);
        startActivity(ven);
    }
}
