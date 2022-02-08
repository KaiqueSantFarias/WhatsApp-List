package com.curso.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.curso.whatsapplist.Adapter.AdapterUsuario;
import com.curso.whatsapplist.Model.Usuario;
import com.curso.whatsapplist.RecycleItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_usuario;
    private List<Usuario> usuarioList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_usuario = findViewById(R.id.recycler_usuarios);

        recycler_usuario.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        recycler_usuario.setHasFixedSize(true);
        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);
        recycler_usuario.setAdapter(adapterUsuario);

        Usuarios();

        // Evento de click na RecycleView
        recycler_usuario.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(),
                recycler_usuario,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        Usuario usuario = usuarioList.get(position);

                        Toast.makeText(getApplicationContext(), "Usuário: " + usuario.getNomeUsuario(), Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Usuario usuario = usuarioList.get(position);
                        Toast.makeText(getApplicationContext(), "Usuário: " + usuario.getNomeUsuario(), Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }

        ));
    }
    public void Usuarios(){

        Usuario usuario1 = new Usuario(R.drawable.usuario1,"Marcos","Olá como vai ?");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario(R.drawable.usuario2,"Camila","Oi, tudo bem com você?");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario(R.drawable.usuario1,"Vitor","Futebol amanhã?");
        usuarioList.add(usuario3);

        Usuario usuario4 = new Usuario(R.drawable.usuario2,"Marcela","Bom Dia!");
        usuarioList.add(usuario4);

        Usuario usuario5 = new Usuario(R.drawable.usuario1,"Pedro","Viu o jogo hoje ?");
        usuarioList.add(usuario5);

        Usuario usuario6 = new Usuario(R.drawable.usuario2,"Luiza","Como vai a faculdade?");
        usuarioList.add(usuario6);

        Usuario usuario7 = new Usuario(R.drawable.usuario1,"Carlos","Estou bem e você ?");
        usuarioList.add(usuario7);

        Usuario usuario8 = new Usuario(R.drawable.usuario2,"Fernanda","Vou sair mais cedodo trabalho.");
        usuarioList.add(usuario8);

        Usuario usuario9 = new Usuario(R.drawable.usuario1,"Felipe","Nos vemos amanhã então");
        usuarioList.add(usuario9);

        Usuario usuario10 = new Usuario(R.drawable.usuario2,"Mariana","Obrigada, até amanhã!");
        usuarioList.add(usuario10);

        Usuario usuario11 = new Usuario(R.drawable.usuario1,"Vitor","Temos um time formado");
        usuarioList.add(usuario11);

        Usuario usuario12 = new Usuario(R.drawable.usuario2,"Luiza","Assistiu aquele filme que te indiquei ?");
        usuarioList.add(usuario12);
    }
}