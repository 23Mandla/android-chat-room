package com.health.chatconnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final ChatInteface chatInteface;
    List<ChatModel> chatModel;
    LayoutInflater inflater;

    public ChatAdapter(List<ChatModel> chatModel, Context context, ChatInteface chatInteface) {
        this.chatModel = chatModel;
        this.inflater = LayoutInflater.from(context);
        this.chatInteface = chatInteface;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.chat_card, parent, false);
        return new ViewHolder(view, chatInteface);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChatModel chatModel1 = chatModel.get(position);
        holder.title.setText(chatModel1.getTitle());
        holder.first_conv.setText(chatModel1.getFirstchat());

    }

    @Override
    public int getItemCount() {
        return chatModel.size();
    }
}
