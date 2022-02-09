package com.example.mymessenger;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

public class CreateMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view)
    {
        EditText messageView= (EditText)findViewById(R.id.message) ;
        String messageText= messageView.getText().toString();
       // Intent intent= new Intent(this,ReceiveMessageActivity.class);

        //message la mot id, messageText la value (key/value)
      //  intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);

        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_TEXT,messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chooserIntent= Intent.createChooser(intent,chooserTitle);
        startActivity(chooserIntent);



    }
}
