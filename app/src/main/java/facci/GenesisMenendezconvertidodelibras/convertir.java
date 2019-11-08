package facci.GenesisMenendezconvertidodelibras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class convertir extends AppCompatActivity {
    TextView libra, tonelada;

    double  libra_, tonelada_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertir);

        //Declaramos los elementos necesarios
        libra = (TextView)findViewById(R.id.lbl_libra);
        tonelada = (TextView)findViewById(R.id.lbl_tonelada);

        //Recibimos los parametos definidos en el objeto bundle
        Bundle bundle = this.getIntent().getExtras();

        //calculamos
        libra_ = Double.parseDouble(bundle.getString("libra"));
        tonelada_ = libra_ / 2204.6;

        //Enviamos el parametro recibo al label
        libra.setText(bundle.getString("libra"));
        tonelada.setText(String.valueOf(tonelada_));
    }
}
