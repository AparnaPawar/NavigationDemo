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
 * Created by admin on 05-01-2017.
 */

public class CalculateTemperatureFragment extends Fragment implements View.OnClickListener {
    EditText mEdtInput,mEdtOutput;
    Button mBtncalculate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_calculate_temperature, container, false);

        mEdtInput= (EditText) v.findViewById(R.id.EdtInput);
        mEdtOutput= (EditText) v.findViewById(R.id.EdtOutput);
        mBtncalculate= (Button) v.findViewById(R.id.BtnCaculate);
        mBtncalculate.setOnClickListener(this);

        return v;

    }

    @Override
    public void onClick(View v) {
        float fahrenheit,celsius;
        fahrenheit=Float.parseFloat(mEdtInput.getText().toString());
        celsius=(fahrenheit-32)*5/9;
        mEdtOutput.setText(String.valueOf(celsius));

    }
}