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

/**
 * Created by admin on 19-12-2016.
 */

public class ArmstrongNumberFragment extends Fragment implements View.OnClickListener {

    EditText mEdtShow;
    Button mBtnShow;
    ArrayList myList=new ArrayList();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_armstrong_number, container, false);


        mEdtShow = (EditText) v.findViewById(R.id.edtShow);
        mBtnShow = (Button) v.findViewById(R.id.btnShow);
        mBtnShow.setOnClickListener(this);



        return v;
    }

        @Override
        public void onClick(View v)
        {

            for (int i = 1; i < 500; i++) {
                int temp = i, mod = 0, sum = 0;
                while (temp != 0) {
                    mod = temp % 10;
                    sum = sum + (mod * mod * mod);
                    temp = temp / 10;
                }
                if (sum == i) {

                    myList.add(i);

                }
            }
            mEdtShow.setText(String.valueOf(myList));
        }


    }

