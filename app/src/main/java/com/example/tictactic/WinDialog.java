package com.example.tictactic;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WinDialog extends Dialog {

    private final String msg;
    private  final MainActivity mainActivity;
    public WinDialog(@NonNull Context context, String msg, MainActivity mainActivity) {
        super(context);
        this.msg = msg;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_dialog);

        final TextView message = findViewById(R.id.msgText);
        final Button btn = findViewById(R.id.startAgainBtn);

        message.setText(msg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.restartMatch();
                dismiss();
            }
        });

    }
}
