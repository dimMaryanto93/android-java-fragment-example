package com.maryanto.dimas.android.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.maryanto.dimas.android.fragment.segment.DashboardFragment;
import com.maryanto.dimas.android.fragment.segment.MonitorFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeSceneDashboard(View view) {
        Fragment fg = new DashboardFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, fg);
        transaction.commit();
    }

    public void changeSceneMonitoring(View view) {
        Fragment fg = new MonitorFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, fg);
        transaction.commit();
    }
}
