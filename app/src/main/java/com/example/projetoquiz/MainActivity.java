package com.example.projetoquiz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txvPerguntas;
    RadioGroup rdgPrincipal;
    Button btnResponder;
    int pontuacao = 0;
    int indicePergunta = 0;

    String [] perguntas {
        "Minha Pergunta 1"
        "Minha Pergunta 2"
        "Minha Pergunta 3"
        "Minha Pergunta 4"
        "Minha Pergunta 5"
    };

    int [] respostasCorretas {
      R.id.rb_a;
      R.id.rb_a;
      R.id.rb_b;
      R.id.rb_d;
      R.id.rb_c;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txvPerguntas = findViewById(R.id.txv_perguntas);
        rdgPrincipal = findViewById(R.id.rdg_principal);
        btnResponder = findViewById(R.id.btn_responder);

        // Nosso Metodo!

        carregarPerguntas();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}