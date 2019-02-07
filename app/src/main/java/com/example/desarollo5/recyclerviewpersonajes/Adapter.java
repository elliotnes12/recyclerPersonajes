package com.example.desarollo5.recyclerviewpersonajes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerHolder> {

  private ArrayList<Personaje> lista;
  private int layout;

  public Adapter(ArrayList<Personaje> lista, int layout) {
    this.lista = lista;
    this.layout = layout;
  }

  @NonNull
  @Override
  public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

    View view = LayoutInflater.from(viewGroup.getContext()).inflate(this.layout,viewGroup,false);
    RecyclerHolder holder = new RecyclerHolder(view);

    return holder;
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerHolder recyclerHolder, int position) {

     recyclerHolder.name.setText(lista.get(position).getNombre());
     recyclerHolder.profile.setText(lista.get(position).getInfo());
     recyclerHolder.image.setImageResource(lista.get(position).getFoto());
  }

  @Override
  public int getItemCount() {
    return lista.size();
  }

  public class RecyclerHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView profile;
    ImageView image;
    public RecyclerHolder(@NonNull View itemView) {
      super(itemView);
      name = (TextView) itemView.findViewById(R.id.name);
      profile = (TextView) itemView.findViewById(R.id.profile);
      image = (ImageView) itemView.findViewById(R.id.imagen);
    }
  }
}
