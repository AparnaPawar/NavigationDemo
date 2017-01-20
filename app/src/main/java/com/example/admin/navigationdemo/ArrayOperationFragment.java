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
 * Created by admin on 28-12-2016.
 */

public class ArrayOperationFragment extends Fragment implements  View.OnClickListener {

    EditText mEdtInput, mEdtDisplay, mEdtArray, mEdtOdd, mEdtEven;
    Button mBtnAdd, mBtnDisplay;
    ArrayList<Integer> myList = new ArrayList<Integer>();
    int result = 0, result1 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_array_operation, container, false);


        mEdtInput = (EditText) v.findViewById(R.id.edtInput);
        mEdtDisplay = (EditText) v.findViewById(R.id.edtSort);

        mEdtOdd = (EditText) v.findViewById(R.id.edtOdd);
        mEdtEven = (EditText) v.findViewById(R.id.edtEven);

        mEdtArray = (EditText) v.findViewById(R.id.edtArray);

        mBtnAdd = (Button) v.findViewById(R.id.btnAdd);
        mBtnDisplay = (Button) v.findViewById(R.id.btnDisplay);

        return v;
    }


    @Override
    public void onClick(View v) {
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num = Integer.parseInt(mEdtInput.getText().toString());
                myList.add(num);


                //mEdtInput.setText("  ");


            }

        });


        mBtnDisplay.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               mEdtArray.setText(String.valueOf(myList));
                                               Collections.sort(myList);
                                               mEdtDisplay.setText("Sorted Array is:" + myList);

                                               Integer array[] = myList.toArray(new Integer[myList.size()]);
                                               {
                                                   for (int i = 0; i < array.length; i++) {
                                                       if (array[i] % 2 == 0) {
                                                           result = result + array[i];
                                                       } else {
                                                           result1 = result1 + array[i];
                                                       }

                                                   }
                                                   mEdtEven.setText("Sum Of Even values:" + result);
                                                   mEdtOdd.setText("Sum Of Odd values :" + result1);


                                               }
                                           }
                                       }


        );

    }
}
