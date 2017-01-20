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

public class TelephonyBillFragment extends Fragment implements View.OnClickListener{


    EditText mEdtCallsMonth,mEdtMonthlyBill;
    Button mBtnGenerateBill;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_telephony_bill, container, false);
        mEdtCallsMonth= (EditText) v.findViewById(R.id.edtCallsMonth);
        mEdtMonthlyBill= (EditText) v.findViewById(R.id.edtMonthlyBill);

        mBtnGenerateBill= (Button) v.findViewById(R.id.btnGenerateBill);
        mBtnGenerateBill.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        int calls;
        double bill;
        calls=Integer.parseInt(mEdtCallsMonth.getText().toString());
        if(calls<=100)
        {
            bill=200*calls;
            mEdtMonthlyBill.setText(String.valueOf(bill));
        }
        else if(calls>100 && calls<=150)
        {
            calls=calls-100;
            bill=200+(0.60*calls);
            mEdtMonthlyBill.setText(String.valueOf(bill));
        }
        else if(calls>150 && calls<=200)
        {
            calls=calls-100;
            bill=200+(0.50*calls);
            mEdtMonthlyBill.setText(String.valueOf(bill));
        }
        else if(calls>200)
        {
            calls=calls-100;
            bill=200+(0.40*calls);
            mEdtMonthlyBill.setText(String.valueOf(bill));
        }


    }

}