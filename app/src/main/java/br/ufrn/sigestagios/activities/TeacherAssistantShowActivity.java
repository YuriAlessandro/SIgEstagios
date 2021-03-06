package br.ufrn.sigestagios.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import br.ufrn.sigestagios.R;
import br.ufrn.sigestagios.models.TeacherAssistant;

/**
 * Created by Joao on 02/12/2017.
 */

public class TeacherAssistantShowActivity extends AppCompatActivity {
    TeacherAssistant offer;
    TextView description, term, email, year, cpf_cnpj, responsible, positionsRemunerated, positionsVolunteers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_assistant_show_activity);

        offer = (TeacherAssistant) getIntent().getSerializableExtra("OFFER");

//        offer = new TeacherAssistant (
//                "desc",
//                "INSTITUTO METROPOLE DIGITAL",
//                0 ,
//                "exemplo@gmail.com",
//                2017 ,
//                "22312345678",
//                2,
//                2,
//                "JOAO EMMANUEL",
//                5,
//                2);

        description = (TextView) findViewById(R.id.taDesc);
        description.setText("Descrição: " + offer.getDescription());

        term = (TextView) findViewById(R.id.taTerm);
        term.setText(offer.getUnit());

        email = (TextView) findViewById(R.id.taEmail);
        email.setText(offer.getEmail());

        year = (TextView) findViewById(R.id.taYear);
        year.setText("Ano: " + offer.getYear());

        cpf_cnpj = (TextView) findViewById(R.id.taCpf_cnpj);
        cpf_cnpj.setText(offer.getCpf_cnpj());

        responsible = (TextView) findViewById(R.id.taResponsible);
        responsible.setText(offer.getResponsible());

        positionsRemunerated = (TextView) findViewById(R.id.taPositionsRemunerated);
        positionsRemunerated.setText("Vagas Remuneradas: " + offer.getPositionsRemunerated());

        positionsVolunteers = (TextView) findViewById(R.id.taPositionsVolunteers);
        positionsVolunteers.setText("Vagas Voluntárias: " + offer.getPositionsVolunteers());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Monitoria");
    }
}
