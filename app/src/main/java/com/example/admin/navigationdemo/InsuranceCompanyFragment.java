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

public class InsuranceCompanyFragment extends Fragment implements View.OnClickListener {

    EditText mEdtHealth, mEdtAge, mEdtLivesIn, mEdtGender, mEdtCheck;
    Button mBtnCheck;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_gross_salary_calculation, container, false);

        mEdtHealth= (EditText) v.findViewById(R.id.edtHealth);
        mEdtAge= (EditText) v.findViewById(R.id.edtAge);
        mEdtLivesIn= (EditText) v.findViewById(R.id.edtLivesIn);
        mEdtGender= (EditText) v.findViewById(R.id.edtGender);

        mEdtCheck= (EditText) v.findViewById(R.id.edtCheck);

        mBtnCheck= (Button) v.findViewById(R.id.btnCheck);
        mBtnCheck.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        String health, lives_In, gender;
        int age;
        health = mEdtHealth.getText().toString();
        lives_In = mEdtLivesIn.getText().toString();
        gender = mEdtGender.getText().toString();
        age = Integer.parseInt(mEdtAge.getText().toString());

        if(health.equals("excellent") && (age>=25 && age<=35))
        {
            if(lives_In.equals("city") && gender.equals("male"))
            {
                mEdtCheck.setText("Person should be insured.." + " " + " Premium rate is Rs.4 per 1000.." + " " + "Maximum Amount is Rs.2 Lakhs");
            }
            else if(lives_In.equals("city") && gender.equals("female"))
            {
                mEdtCheck.setText("Person should be insured.." + " " + " Premium rate is Rs.3 per 1000.." + " " + "Maximum Amount is Rs.1 Lakh");
            }
        }
        else if(health.equals("poor") && (age>=25 && age<=35))
        {
            if(lives_In.equals("village") && gender.equals("male"))
            {
                mEdtCheck.setText("Person should be insured.." + " " + " Premium rate is Rs.6 per 1000.." + " " + "Maximum Amount is Rs.10,000");
            }
            else
            {
                mEdtCheck.setText("Person should NOT be insured..");
            }
        }
        else
        {
            mEdtCheck.setText("Person should NOT be insured..");
        }

    }

}