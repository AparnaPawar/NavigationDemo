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
 * Created by Admin on 04-06-2015.
 */
public class ContentFragment extends Fragment {

    EditText mEdtArea,mEdtResult;
    Button mBtnCalculate;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.content_fragment,container,false);


        mEdtArea = (EditText) v.findViewById(R.id.edt_area);
        mEdtResult = (EditText) v.findViewById(R.id.edt_result);

        mBtnCalculate = (Button) v.findViewById(R.id.btn_result);


        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float r = Float.parseFloat(mEdtArea.getText().toString());
                double ar = 3.14*r*r;

                mEdtResult.setText(String.valueOf(ar));

            }
        });




        return v;
    }
}
