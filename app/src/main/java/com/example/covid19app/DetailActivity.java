package com.example.covid19app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private int positionCountry;
    Toolbar toolbar;
    TextView tvCountry,tvCases,tcRecorded,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent=getIntent();
        positionCountry=intent.getIntExtra("position",0);
        toolbar = (Toolbar) findViewById(R.id.toolbarCustomd);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvCountry=findViewById(R.id.tvCountry);
        tvCases=findViewById(R.id.tcCased);
        tcRecorded=findViewById(R.id.tcRecoveredd);
        tvCritical=findViewById(R.id.tcCriticald);
        tvActive=findViewById(R.id.tcActived);
        tvTodayCases=findViewById(R.id.tcTodayCased);
        tvTotalDeaths=findViewById(R.id.tcDeathsd);
        tvTodayDeaths=findViewById(R.id.tcTodayDeathsd);
        tvCountry.setText(AffectedCountries.countryModelListView.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelListView.get(positionCountry).getCases());
        tcRecorded.setText(AffectedCountries.countryModelListView.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelListView.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelListView.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelListView.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelListView.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelListView.get(positionCountry).getTodayDeaths());

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
