package com.example.PRM391x_QuizApp_khoidtFX01411;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.PRM391x_QuizApp_khoidtFX01411.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvFirstName = findViewById(R.id.firstName);
        tvFirstName.setText(getResources().getString(R.string.firstName));
        TextView tvLastName = findViewById(R.id.lastName);
        tvLastName.setText(getResources().getString(R.string.lastName));
        final EditText editFirstName = findViewById(R.id.editFirstName);
        final EditText editLastName = findViewById(R.id.editLastName);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String firstName = editFirstName.getText().toString();
                final String lastName = editLastName.getText().toString();
                Intent intent = new Intent(getApplicationContext(),CustomMainActivity.class);
                intent.putExtra("firstName",firstName);
                intent.putExtra("lastName",lastName);
                startActivity(intent);
            }
        });
    }

    private void setMargins (View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(left, top, right, bottom);
            view.requestLayout();
        }
    }

}
