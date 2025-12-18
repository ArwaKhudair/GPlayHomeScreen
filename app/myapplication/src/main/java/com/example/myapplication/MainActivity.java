package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapters.SocialMediaAdapter;
import com.example.myapplication.models.SocialMediaModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SocialMediaAdapter adapter;
    private ArrayList<SocialMediaModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        // إنشاء قائمة البيانات - 6 ألعاب فقط
        arrayList = new ArrayList<>();
        arrayList.add(new SocialMediaModel(1, R.drawable.black, "Block Blast!", "Puzzle • Block • Casual • Offline", 4.5f));
        arrayList.add(new SocialMediaModel(2, R.drawable.vita_mahjong, "Vita Mahjong", "Board • Puzzle • Mahjong solitaire", 4.6f));
        arrayList.add(new SocialMediaModel(3, R.drawable.jigsolitaire, "Jigsolitaire", "Puzzle", 4.3f));
        arrayList.add(new SocialMediaModel(4, R.drawable.title, "Tile Explorer - Triple Match", "Puzzle • Match 3 • Casual • Offline", 4.5f));
        arrayList.add(new SocialMediaModel(5, R.drawable.water, "Water Match™ - ASMR Water Sort", "Casual", 4.7f));
        arrayList.add(new SocialMediaModel(6, R.drawable.roblox, "Roblox", "Adventure • Simulation • Sandbox", 4.4f));
        
        // إنشاء وربط الـ Adapter
        adapter = new SocialMediaAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);
    }
}