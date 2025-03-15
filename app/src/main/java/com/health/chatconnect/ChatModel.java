package com.health.chatconnect;

import android.widget.TextView;

public class ChatModel {
    String title;
    String firstchat;

    public ChatModel(String title, String firstchat) {
        this.title = title;
        this.firstchat = firstchat;
    }

    public CharSequence getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CharSequence getFirstchat() {
        return firstchat;
    }

    public void setFirstchat(String firstchat) {
        this.firstchat = firstchat;
    }
}
