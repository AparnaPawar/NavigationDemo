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

public class DriverInsuranceFragment extends Fragment implements View.OnClickListener {

    EditText mEdtMaritalStatus,mEdtGender,mEdtAge,mEdtCheck;
    Button mBtnCheck;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_driver_insurance, container, false);


        mEdtMaritalStatus= (EditText) v.findViewById(R.id.edtMaritalStatus);
        mEdtGender= (EditText) v.findViewById(R.id.edtGender);
        mEdtAge= (EditText) v.findViewById(R.id.edtAge);
        mEdtCheck= (EditText) v.findViewById(R.id.edtCheck);

        mBtnCheck= (Button) v.findViewById(R.id.btnCheck);
        mBtnCheck.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        String marital_status,gender;
        int age;
        marital_status=mEdtMaritalStatus.getText().toString();
        gender=mEdtGender.getText().toString();
        age=Integer.parseInt(mEdtAge.getText().toString());

        if(marital_status.equals("married"))
        {
            mEdtCheck.setText("Driver is insured");
        }
        else if( marital_status.equals("unmarried") && gender.equals("male"))
        {
            if(age>30)
            {
                mEdtCheck.setText("Driver is insured");
            }
            else {
                mEdtCheck.setText("Driver is NOT insured!!");
            }
        }
        else if( marital_status.equals("unmarried") && gender.equals("female"))
        {

            if(age>25) {
                mEdtCheck.setText("Driver is insured");
            }
            else {
                mEdtCheck.setText("Driver is NOT insured!!!");
            }
        }



    }
}

