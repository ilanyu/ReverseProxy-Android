package com.lanyus.reverseproxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private Button stopButton;
    private EditText bindText;
    private EditText remoteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.start);
        stopButton = findViewById(R.id.stop);
        bindText = findViewById(R.id.bind);
        remoteText = findViewById(R.id.remote);
    }

    public void startServer(View view) {
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        Mobile.Mobile.startServer(bindText.getText().toString(),remoteText.getText().toString());
    }

    public void stopServer(View view) {
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        Mobile.Mobile.stopServer();
    }
}
