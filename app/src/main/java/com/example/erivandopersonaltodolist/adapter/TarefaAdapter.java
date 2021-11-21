package com.example.erivandopersonaltodolist.adapter;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.erivandopersonaltodolist.R;
import com.example.erivandopersonaltodolist.model.Tarefa;

import java.util.List;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.MyViewholder> {
    private List<Tarefa> listaTarefas;

    public TarefaAdapter(List<Tarefa> lista) {
        this.listaTarefas = lista;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_tarefa_adapter, parent, false);

        return new MyViewholder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        Tarefa tarefa = listaTarefas.get(position);
        holder.tarefa.setText(tarefa.getNomeTarefa());

    }

    @Override
    public int getItemCount() {
        return this.listaTarefas.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder{

        TextView tarefa;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            tarefa = itemView.findViewById(R.id.textTarefa);
        }
    }

}
