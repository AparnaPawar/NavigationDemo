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


public class CompoundInterestFragment extends Fragment implements View.OnClickListener{

    EditText mEdtAmount,mEdtRateAnnual,mEdtTime,mEdtYears,mEdtResult;
    Button mBtnCal;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_compound_interest,container, false);

        mEdtAmount= (EditText) v.findViewById(R.id.edtAmount);
        mEdtRateAnnual= (EditText) v.findViewById(R.id.edtRateAnnual);
        mEdtTime= (EditText) v.findViewById(R.id.edtTime);
        mEdtYears= (EditText) v.findViewById(R.id.edtYears);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);

        mBtnCal= (Button) v.findViewById(R.id.btnCal);
        mBtnCal.setOnClickListener(this);

        return v;


}

    @Override
    public void onClick(View v) {
        double p,r,n,t,A,pow,N;
        p=Double.parseDouble(mEdtAmount.getText().toString());
        r=Double.parseDouble(mEdtRateAnnual.getText().toString());
        n=Double.parseDouble(mEdtTime.getText().toString());
        t=Double.parseDouble(mEdtYears.getText().toString());

        N=(1+(r/n));
        pow=n*t;
        A=p*(Math.pow(N,pow));
        mEdtResult.setText(String.valueOf(A));

    }
}
