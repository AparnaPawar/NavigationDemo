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
 * Created by admin on 14-12-2016.
 */

public class CircleAreaFragment extends Fragment implements View.OnClickListener{

    EditText mEdtRadius,mEdtResult;
    Button mBtnCheck;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_circlearea,container,false);


        mEdtRadius= (EditText)v. findViewById(R.id.edtRadius);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);
        mBtnCheck= (Button) v.findViewById(R.id.btnRadius);
        mBtnCheck.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {

        double area,radius;

        radius=Integer.parseInt(mEdtRadius.getText().toString());
        area=3.14*radius*radius;

        mEdtResult.setText(String.valueOf(area));


    }
}




