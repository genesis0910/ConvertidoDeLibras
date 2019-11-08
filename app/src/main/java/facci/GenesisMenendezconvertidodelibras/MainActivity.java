package facci.GenesisMenendezconvertidodelibras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText parametro;
    Button EnviarParametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos los elementos necesarios
        parametro = (EditText)findViewById(R.id.editTextLibra);
        EnviarParametro = (Button)findViewById(R.id.buttonEnviar);
        // agregamo un evento al boton para que envie el parametro
        EnviarParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Declaramos un evento intent que sirve para enlazar con otra actividad
                Intent intent = new Intent(MainActivity.this,convertir.class);
                //Se crea un objeto del tipo bundle, el cual se encargara de almacenar el dato a enviar
                Bundle bundle = new Bundle();
                // el metodo put fija los parametros a enviar mediante un id
                bundle.putString("libra",parametro.getText().toString());
                //enviamos el dato mediante el putExtra, el cual permite enviar un solo parametro entre actividades
                intent.putExtras(bundle);
                //Llamamos al dicho evento con el metodo startActivity
                startActivity(intent);
            }
        });


    }
}
