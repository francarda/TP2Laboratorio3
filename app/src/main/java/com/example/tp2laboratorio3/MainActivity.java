package com.example.tp2laboratorio3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp2laboratorio3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        binding.btLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail= binding.etMail.getText().toString();
                String pass= binding.etPass.getText().toString();
                vm.loggin(mail, pass);
            }
        });
        binding.btRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vm.registrarse();
            }
        });

    }
}