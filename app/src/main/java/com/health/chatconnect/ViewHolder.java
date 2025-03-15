package com.health.chatconnect;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView first_conv;
    public ViewHolder(@NonNull View itemView, ChatInteface chatInteface) {
        super(itemView);
        title = itemView.findViewById(R.id.textView);
        first_conv = itemView.findViewById(R.id.textView2);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chatInteface != null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        chatInteface.onChatClick(position);
                    }
                }

            }
        });
    }
}