package com.maryanto.dimas.android.fragment.segment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maryanto.dimas.android.fragment.R;

/**
 * Created by dimmaryanto93 on 02/05/2018.
 */

public class DashboardFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.control_fragment, container, false);
    }
}
