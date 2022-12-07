package codeplateau.assignmenrt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchProduct extends AppCompatActivity {

    CardView interior,exterior,body,fluid,electrical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_product);
        getSupportActionBar().hide();

        interior=findViewById(R.id.interior);
        exterior=findViewById(R.id.exterior);
        body=findViewById(R.id.body);
        fluid=findViewById(R.id.fluid);
        electrical=findViewById(R.id.electrical);

        interior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),InteriorActivity.class));
            }
        });
    }
}