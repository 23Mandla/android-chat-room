package com.health.chatconnect;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ChatInteface{
    RecyclerView recyclerView;
    ChatAdapter adapter;
    List<ChatModel> chatModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        chatModels = dataList();
        adapter = new ChatAdapter(chatModels, getApplicationContext(), this);

        GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 2, GridLayoutManager.HORIZONTAL, false);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }

    public List<ChatModel> dataList(){
        chatModels = new ArrayList<>();
        chatModels.add(new ChatModel("Tech connection", "Did you watch tech summit"));
        chatModels.add(new ChatModel("Tech connection", "Did you attend tech summit"));
        return chatModels;
    }

    @Override
    public void onChatClick(int position) {
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
    }
}