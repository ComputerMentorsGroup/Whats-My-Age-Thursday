package org.computermentors.whatsmyage.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import org.computermentors.whatsmyage.BackEnd.Calculate;
import org.computermentors.whatsmyage.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Calculate mCalculate = new Calculate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatePicker birthDatePicker = (DatePicker) findViewById(R.id.birthDatePicker);
        final Button findAgeButton = (Button) findViewById(R.id.findAgeButton);


        findAgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date date = mCalculate.getDate(birthDatePicker);

                int age = mCalculate.getAge(date);

                startAgeActivity(age);
            }
        });

    }

    private void startAgeActivity(int age){
        Intent intent = new Intent(this, AgeActivity.class);
        intent.putExtra("age", age);
        startActivity(intent);
        Toast.makeText(this, "" + age, Toast.LENGTH_LONG).show();
    }


}
