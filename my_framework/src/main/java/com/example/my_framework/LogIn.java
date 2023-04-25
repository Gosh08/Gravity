package com.example.my_framework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import scenes.GameScene;

public class LogIn extends AppCompatActivity {

    private SceneFW sceneFW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void setScene(SceneFW sceneFW){
        if(sceneFW==null){
            throw new IllegalArgumentException("Не возможно загрузить сцену");

        }
        this.sceneFW.pause();
        this.sceneFW.dispose();
        sceneFW.resume();
        sceneFW.update();
        this.sceneFW=sceneFW;

    }
}