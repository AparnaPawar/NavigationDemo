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

public class ConversionOfLength extends Fragment implements View.OnClickListener{
    EditText mEdtFeet,mEdtInches,mEdtCentimeters;
    Button mBtnCal;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_conversion_length, container, false);

        mEdtFeet= (EditText) v.findViewById(R.id.edtFeet);
        mEdtInches= (EditText) v.findViewById(R.id.edtInches);
        mEdtCentimeters= (EditText) v.findViewById(R.id.edtCentimeters);

        mBtnCal= (Button) v.findViewById(R.id.btnCalLength);
        mBtnCal.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        int feet,inches;
        double cm;
        feet=Integer.parseInt(mEdtFeet.getText().toString());
        inches=Integer.parseInt(mEdtInches.getText().toString());

        cm=(feet*30.48)+(inches*2.54);
        mEdtCentimeters.setText(String.valueOf(cm));
    }
}
