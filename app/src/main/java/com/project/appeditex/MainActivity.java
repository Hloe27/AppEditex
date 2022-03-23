package com.project.appeditex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn=findViewById(R.id.txtNombre);
        etp=findViewById(R.id.txtPassword);
    }

    //Metodo par el botn registrar

    public void Registrar(View view){
        String nombre=etn.getText().toString();
        String passwor=etp.getText().toString();

        if(nombre.length()==0){
            Toast.makeText(this,"Debe ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(passwor.length()==0){
            Toast.makeText(this,"Debe ingresar una contraseña", Toast.LENGTH_LONG).show();
        }
        if(nombre.length()!=0 && passwor.length()!=0){
            Toast.makeText(this, "Registro en proceso", Toast.LENGTH_SHORT).show();
        }


    }

}