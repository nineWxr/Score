package com.nine.score;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.nine.score.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ViewModelProvider.AndroidViewModelFactory instance = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication());
        MainViewModel mainViewModel = instance.create(MainViewModel.class);
        binding.setMain(mainViewModel);
        binding.setLifecycleOwner(this);
    }
}