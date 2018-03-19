package co.paulfran.paulfranco.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactsButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                // The Button was clicked so update the fact TextView with a new fact
                String fact = "Ostriches can run faster than horses";
                factTextView.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
