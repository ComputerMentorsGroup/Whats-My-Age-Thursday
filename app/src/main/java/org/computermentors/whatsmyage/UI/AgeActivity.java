package org.computermentors.whatsmyage.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.computermentors.whatsmyage.R;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        final TextView ageTextView = (TextView) findViewById(R.id.ageTextView);
        final Button backButton = (Button) findViewById(R.id.backButton);

    }


}
