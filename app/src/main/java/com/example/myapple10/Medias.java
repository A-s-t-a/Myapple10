package com.example.myapple10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Medias extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medias);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        itemAdapter = new ItemAdapter(this);
        itemAdapter.setDate(getData());
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private List<Item> getData() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.facebook,"Facebook"));
        list.add(new Item(R.drawable.instagram,"Instagram"));
        list.add(new Item(R.drawable.messenger,"Messenger"));
        list.add(new Item(R.drawable.reddit,"Reddit"));
        list.add(new Item(R.drawable.tumblr,"Tumblr"));
        list.add(new Item(R.drawable.whatsapp,"Whatsapp"));
        list.add(new Item(R.drawable.x,"X"));
        list.add(new Item(R.drawable.youtube,"Youtube"));

        return list;
    }
}