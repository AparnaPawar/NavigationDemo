package com.example.admin.navigationdemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by admin on 28-12-2016.
 */


public class CompareStringFragment extends Fragment implements View.OnClickListener {

    EditText mEdtFirstString,mEdtSEcondString,mEdtResult;
    Button mBtnCompare;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_compare_string,container, false);
        mEdtFirstString= (EditText) v.findViewById(R.id.edtFirstString);
        mEdtSEcondString= (EditText) v.findViewById(R.id.edtSecondString);
        mEdtResult= (EditText) v.findViewById(R.id.edtResult);
        mBtnCompare= (Button) v.findViewById(R.id.btnCompare);

        mBtnCompare.setOnClickListener(this);


    return  v;
    }

        @Override
    public void onClick(View v) {



            String str1,str2;
            str1=mEdtFirstString.getText().toString();
            str2=mEdtSEcondString.getText().toString();
            if(str1.equals(str2))
            {
                mEdtResult.setText("Two Strings Are Equal...");
            }
            else
            {
                mEdtResult.setText("Two Strings Are Not Equal!!!");
            }

        }


}
