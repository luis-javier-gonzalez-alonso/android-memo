package com.example.memogame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.memogame.databinding.MainAndOnlyActivityBinding;

public class MainAndOnlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(MainAndOnlyActivityBinding.inflate(getLayoutInflater()).getRoot());
    }
}