package com.zsergei.unifiedstateexam.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zsergei.unifiedstateexam.R;

/**
 * Created by Sergei Zarochentsev on 16.11.2015.
 */
public class TextTheoryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.theory_text_fragment, container, false);
    }
}
