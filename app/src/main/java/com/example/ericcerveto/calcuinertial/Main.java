package com.example.ericcerveto.calcuinertial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_resultat);
        final EditText edit_densitat =(EditText) findViewById(R.id.edit_densitat);
        final EditText edit_masa = (EditText) findViewById(R.id.edit_masa);
        final EditText edit_diametre = (EditText) findViewById(R.id.edit_diametre);
        final EditText edit_diametreint = (EditText) findViewById(R.id.edit_diametreint);
        final EditText edit_longitud = (EditText) findViewById(R.id.edit_longitud);
        final TextView label_resultat = (TextView) findViewById(R.id.label_resultat);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sdensitat = edit_densitat.getText().toString();
                float densitat = Float.parseFloat(sdensitat);
                String smasa = edit_masa.getText().toString();
                float masa = Float.parseFloat(smasa);
                String sdiametre = edit_diametre.getText().toString();
                float diametre = Float.parseFloat(sdiametre);
                String sdiametreint = edit_diametreint.getText().toString();
                float diametreint = Float.parseFloat(sdiametreint);
                String slongitud = edit_longitud.getText().toString();
                float longitud = Float.parseFloat(slongitud);

                //LAYOUT CILINDRE
                //Nomes amb la masa

                float inercia11 = (masa*(Math.pow((diametre/2,2)))/2;
                String sinercia1 = String.format("%f",inercia11);
                //si es amb la Densitat

                float inercia21 = ((Math.PI*densitat*longitud*Math.pow(diametre/2,4))/2;
                String sinercia2 = String.format("%f",inercia21);

                //LAYOUT CILINDRE FORADAT
                //Nomes amb la masa

                float inercia12 = ((masa*(Math.pow(diametre/2,2)+Math.pow(diametreint/2,2)))/2;
                String sinercia1 = String.format("%f",inercia12);
                //si es amb la Densitat

                float inercia21 = (Math.PI*densitat*longitud*(Math.pow(diametre/2,4)-Math.pow(diametreint/2,4)))/2;
                String sinercia2 = String.format("%f",inercia21);




                label_resultat.setText(sinercia1);







            }
        });


    }
}
