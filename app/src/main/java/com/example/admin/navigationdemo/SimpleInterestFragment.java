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

public class SimpleInterestFragment extends Fragment implements View.OnClickListener{

    EditText mEdtAmount,mEdtRate,mEdtPeriod,mEdtSI;
    Button mBtnCalculate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_simple_interest, container, false);
        mEdtAmount= (EditText) v.findViewById(R.id.edtAmount);
        mEdtRate= (EditText) v.findViewById(R.id.edtRateInterest);
        mEdtPeriod= (EditText) v.findViewById(R.id.edtPeriod);
        mEdtSI= (EditText) v.findViewById(R.id.edtSI);

        mBtnCalculate= (Button) v.findViewById(R.id.btnCalculate);
        mBtnCalculate.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View v) {


        double amount,rate,period,SimpleInterest;
        amount=Integer.parseInt(mEdtAmount.getText().toString());
        rate=Integer.parseInt(mEdtRate.getText().toString());
        period=Integer.parseInt(mEdtPeriod.getText().toString());

        SimpleInterest=(amount*rate*period)/100;
        mEdtSI.setText(String.valueOf(SimpleInterest));
    }
}
