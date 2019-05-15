package br.com.digitalhouse.digital.exerciciolayout02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaração de atributos
    EditText editTextNomeProduto;
    EditText editTextPrecoProduto;
    EditText editTextPorcentagem;
    Button btnTotalCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNomeProduto =findViewById(R.id.editTextNomeProduto);
        editTextPrecoProduto =findViewById(R.id.editTextPrecoProduto);
        editTextPorcentagem =findViewById(R.id.editTextPorcentagem);
        btnTotalCalcular =findViewById(R.id.btnTotalCalcular);

        btnTotalCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float valorTotal = 0;

                valorTotal = Float.valueOf(editTextPrecoProduto.getText().toString()) *
                        (1 - (Float.parseFloat(editTextPorcentagem.getText().toString()) / 100));

                Toast.makeText(MainActivity.this, "Valor Total: " + valorTotal,
                Toast.LENGTH_LONG).show();
            }
        });



    }
}
