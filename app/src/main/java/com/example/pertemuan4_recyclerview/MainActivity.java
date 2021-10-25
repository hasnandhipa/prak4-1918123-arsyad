package com.example.pertemuan4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Canyon", "2518001", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Pine", "2518002", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Ans", "2518003", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Beryl", "2518004", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Deft", "2518005", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Chovy", "2518006", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Dune", "2518007", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Sith", "2518008", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Feby", "2518009", "2025"));
        mahasiswaArrayList.add(new Mahasiswa("Putri", "2518010", "2025"));
    }
}