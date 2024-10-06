package com.example.my_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList  <Pictures> pictures = new ArrayList<>();

    int [] pictureArr = {R.drawable.bathman, R.drawable.baseline_attribution_24,R.drawable.bathman,
            R.drawable.bathman,R.drawable.bathman,R.drawable.bathman,R.drawable.bathman,
            R.drawable.bathman,R.drawable.bathman,R.drawable.bathman,R.drawable.bathman,
            R.drawable.bathman,R.drawable.bathman,R.drawable.bathman,R.drawable.bathman,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myrecycleview);

        setUpPictures();
        Recyclerviewadapter adapter = new Recyclerviewadapter( this,pictures);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void  setUpPictures(){
        String [] pName = getResources().getStringArray(R.array.pName);

        for (int i = 0; i < pName.length; i++){
            pictures.add(new Pictures(pName[i],pictureArr[i]));
        }
    }
}