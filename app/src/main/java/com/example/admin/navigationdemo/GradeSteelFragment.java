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


public class GradeSteelFragment extends Fragment implements View.OnClickListener {


    EditText mEdtHardness,mEdtCarbon,mEdtTensile,mEdtGrade;
    Button mBtnGrade;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_even_odd, container, false);

        mEdtHardness= (EditText) v.findViewById(R.id.edtHardness);
        mEdtCarbon= (EditText) v.findViewById(R.id.edtCarbon);
        mEdtTensile= (EditText) v.findViewById(R.id.edtTensile);
        mEdtGrade= (EditText) v.findViewById(R.id.edtGrade);

        mBtnGrade= (Button) v.findViewById(R.id.btnGrade);
        mBtnGrade.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        int hardness,tensile;
        double carbon;
        hardness = Integer.parseInt(mEdtHardness.getText().toString());
        carbon = Double.parseDouble(mEdtCarbon.getText().toString());
        tensile = Integer.parseInt(mEdtTensile.getText().toString());
        if (hardness > 50)
        {
            if (carbon < 0.7)
            {
                if (tensile > 5600)
                {
                    mEdtGrade.setText("Grade is 10");
                } else {
                    mEdtGrade.setText("Grade is 9");
                }
            } else {
                if (tensile > 5600) {
                    mEdtGrade.setText("Grade is 7");
                } else {
                    mEdtGrade.setText("Grade is 6");
                }
            }
        }
        else
        {
            if (carbon < 0.7)
            {
                if (tensile > 5600)
                {
                    mEdtGrade.setText("Grade is 8");
                } else {
                    mEdtGrade.setText("Grade is 6");
                }
            } else
            {
                if (tensile > 5600)
                {
                    mEdtGrade.setText("Grade is 6");
                } else
                {
                    mEdtGrade.setText("Grade is 5");
                }
            }
        }
    }
}
