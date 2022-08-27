package com.example.a3hw3monthrecyclerviewaddresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> addresses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        addresses.add("Мамытова 23/56");
        addresses.add("Мамытова 29/3");
        addresses.add("Мамытова 21/47");
        addresses.add("Мамытова 23/58");
        addresses.add("Мамытова 20/6");
        addresses.add("Мамытова 64/54");
        addresses.add("Мамытова 35/81");
        addresses.add("Мамытова 12/72");
        addresses.add("Мамытова 7/57");
        addresses.add("Мамытова 20/50");
        AddressAdapter addressAdapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(addressAdapter);
    }
}