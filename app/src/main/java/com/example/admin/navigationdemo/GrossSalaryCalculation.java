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

public class GrossSalaryCalculation extends Fragment implements View.OnClickListener {

    EditText mEdtSalary,mEdtGrossSalary;
    Button mBtnCalSalary;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_gross_salary_calculation, container, false);


        mEdtSalary= (EditText) v.findViewById(R.id.edtSalary);
        mEdtGrossSalary= (EditText) v.findViewById(R.id.edtGrossSalary);

        mBtnCalSalary= (Button) v.findViewById(R.id.btnCalSalary);
        mBtnCalSalary.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        int sal;
        sal=Integer.parseInt(mEdtSalary.getText().toString());
        double GrossSalary;
        if(sal>1 && sal<4000)
        {
            double hra=0.1,da=0.5,pf=0.15,tax=0.02;
            GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
            mEdtGrossSalary.setText(String.valueOf(GrossSalary));
        }
        else if (sal>=4001 && sal<=8000)
        {
            double hra=0.2,da=0.6,pf=0.1,tax=0.05;
            GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
            mEdtGrossSalary.setText(String.valueOf(GrossSalary));
        }
        else if (sal>=8001 && sal<=12000)
        {
            double hra=0.25,da=0.7,pf=0.1,tax=0.08;
            GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
            mEdtGrossSalary.setText(String.valueOf(GrossSalary));
        }
        else if (sal>12000)
        {
            double hra=0.3,da=0.8,pf=0.15,tax=0.1;
            GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
            mEdtGrossSalary.setText(String.valueOf(GrossSalary));
        }


    }



    }

