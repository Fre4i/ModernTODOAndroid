package com.mirea.moderntodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mirea.moderntodo.view.PlanListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("some_int", 0);

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container, PlanListFragment.class, bundle)
                    .commit();
        }
    }
}