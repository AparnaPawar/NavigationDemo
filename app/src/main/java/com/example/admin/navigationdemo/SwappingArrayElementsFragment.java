package com.example.admin.navigationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by admin on 05-01-2017.
 */

public class SwappingArrayElementsFragment extends Fragment {
    EditText mEdtElements,mEdtBeforeSwap,mEdtAfterSwap;
    Button mBtnAdd,mBtnSwap;
    ArrayList<Integer> myList=new ArrayList<Integer>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_swappingarrayelements, container, false);

        mEdtElements= (EditText) v.findViewById(R.id.edtElements);
        mEdtAfterSwap= (EditText) v.findViewById(R.id.edtAfterSwap);
        mEdtBeforeSwap= (EditText) v.findViewById(R.id.edtBeforeSwap);

        mBtnAdd= (Button) v.findViewById(R.id.btnAdd);
        mBtnSwap= (Button) v.findViewById(R.id.btnSwap);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values;
                values=Integer.parseInt(mEdtElements.getText().toString());
                myList.add(values);
                mEdtBeforeSwap.setText(String.valueOf(myList));

            }
        });

        mBtnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.swap(myList, 0, myList.size() - 1);
                mEdtAfterSwap.setText(String.valueOf(myList));

            }
        });

        return v;
    }
}
