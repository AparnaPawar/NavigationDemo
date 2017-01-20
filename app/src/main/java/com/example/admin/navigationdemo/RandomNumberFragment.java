package com.example.admin.navigationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by admin on 04-01-2017.
 */

public class RandomNumberFragment extends Fragment implements View.OnClickListener {
    EditText mEdtNum;
    Button mBtnGenerate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_random_number, container, false);
        mEdtNum= (EditText) v.findViewById(R.id.edtNum);
        mBtnGenerate= (Button) v.findViewById(R.id.btnGenerate);

        mBtnGenerate.setOnClickListener(this);

        return v;

    }

    @Override
    public void onClick(View v) {
        int min=10,max=100;
        int random=(int)(Math.random()*(max-min)+min);
        mEdtNum.setText(String.valueOf(random));

    }
}