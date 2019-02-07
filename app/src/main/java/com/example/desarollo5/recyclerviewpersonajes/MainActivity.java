package com.example.desarollo5.recyclerviewpersonajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private ArrayList<Personaje> personajes;
  private Adapter adapter;
  private RecyclerView recyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

     recyclerView = (RecyclerView) findViewById(R.id.recycler);
     recyclerView.setLayoutManager(new LinearLayoutManager(this));

     personajes = new ArrayList<>();
     personajes.add(new Personaje("Bart","Bart simpson",R.drawable.bart));
     personajes.add(new Personaje("Krusty","Krustt",R.drawable.krusti));



  }
}
