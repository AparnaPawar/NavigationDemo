package com.example.admin.navigationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.support.v4.app.Fragment;
/**
 * Created by admin on 28-12-2016.
 */

public class ArithmaticOperationFragment extends Fragment implements View.OnClickListener,AdapterView.OnItemSelectedListener {


    EditText mEdtFirstNum, mEdtSecondNum, mEdtResult;
    Button mBtnDisp;
    Spinner mspinner;
    String item;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.activity_aritmatic_operation, container, false);


        mEdtFirstNum = (EditText) v.findViewById(R.id.edtFirstNum);
        mEdtSecondNum = (EditText) v.findViewById(R.id.edtSecondNum);
        mEdtResult = (EditText) v.findViewById(R.id.edtResult);
        mspinner = (Spinner) v.findViewById(R.id.spinner);
        mBtnDisp = (Button) v.findViewById(R.id.btnDisp);
        mspinner = (Spinner) v.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.Operations, R.layout.support_simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        mspinner.setAdapter(adapter);
        mspinner.setOnItemSelectedListener(this);

        mBtnDisp.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View v) {

        double no1, no2, result;
        no1 = Integer.parseInt(mEdtFirstNum.getText().toString());
        no2 = Integer.parseInt(mEdtSecondNum.getText().toString());

        if (item.equals("Addition")) {
            result = no1 + no2;
            mEdtResult.setText("Addition is :" + result);
        } else if (item.equals("Subtraction")) {
            result = no1 - no2;
            mEdtResult.setText("Subtraction is :" + result);
        } else if (item.equals("Multiplication")) {
            result = no1 * no2;
            mEdtResult.setText("Multiplication is :" + result);
        } else if (item.equals("Division")) {
            result = no1 / no2;
            mEdtResult.setText("Division is :" + result);

        }


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        item=parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}