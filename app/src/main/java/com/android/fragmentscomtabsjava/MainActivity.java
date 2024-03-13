package com.android.fragmentscomtabsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.fragmentscomtabsjava.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.minhaTabela.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int posicao = tab.getPosition();

                switch (posicao){
                    case 0:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.meuFragment, new PrimeiroFragment()).commit();
                        break;
                    case 1:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.meuFragment, new SegundoFragment()).commit();
                        break;
                    case 2:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.meuFragment, new TerceiroFragment()).commit();
                        break;

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}