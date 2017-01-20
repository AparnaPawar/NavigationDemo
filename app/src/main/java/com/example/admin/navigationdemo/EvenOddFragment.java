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
 * Created by admin on 28-12-2016.
 */

public class EvenOddFragment extends Fragment implements View.OnClickListener {
    EditText medtNum,medtRes;
    Button mbtnCheck;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_even_odd, container, false);


        medtNum= (EditText) v.findViewById(R.id.edtNum);
        medtRes= (EditText) v.findViewById(R.id.edtRes);
        mbtnCheck= (Button) v.findViewById(R.id.btnCheck);
        mbtnCheck.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        int num;

        num=Integer.parseInt(medtNum.getText().toString());
        if (num%2==0)
        {

            medtRes.setText("Number is Even!!");
        }
        else
        {

            medtRes.setText("Number is Odd!!");
        }

    }
}