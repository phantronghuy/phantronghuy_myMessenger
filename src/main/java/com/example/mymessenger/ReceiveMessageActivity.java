package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;


public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = new Intent(this,CreateMessageActivity.class);

        //ham nhan key tu intent voi key la message;
        String messageText= intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView= (TextView)findViewById(R.id.message);
        messageView.setText(messageText);

    }



}