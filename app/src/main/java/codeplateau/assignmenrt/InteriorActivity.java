package codeplateau.assignmenrt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import codeplateau.assignmenrt.Model.InteriorAdapter;
import codeplateau.assignmenrt.Model.InteriorModel;

public class InteriorActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<InteriorModel> interiorList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interior);
        getSupportActionBar().hide();

        recyclerView =findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        interiorList = new ArrayList<>();

        interiorList.add(new InteriorModel(1, "Trim Clip",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(2, "2K Trim Clips",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(3, "Ribloks",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(4, "Open Grommets",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(5, "Clossed Grommets",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(6, "Christmas Tree Clips",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(7, "Push On Nuts",R.drawable.itw_logo));
        interiorList.add(new InteriorModel(8, "Mid Panel Nuts",R.drawable.itw_logo));


        InteriorAdapter adapter = new InteriorAdapter(this, interiorList);
        recyclerView.setAdapter(adapter);
    }
}