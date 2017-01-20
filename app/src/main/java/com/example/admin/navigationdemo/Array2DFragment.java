package com.example.admin.navigationdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.Fragment;
/**
 * Created by admin on 28-12-2016.
 */

public class Array2DFragment extends Fragment implements View.OnClickListener{

    EditText mEdt00, mEdt01, mEdt02, mEdt10, mEdt11, mEdt12, mEdt20, mEdt21, mEdt22;
    Button mBtnAdd, mBtnMultiplication, mBtnA, mBtnB;
    int a00, a01, a02, a10, a11, a12, a20, a21, a22, b00, b01, b02, b10, b11, b12, b20, b21, b22;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_array2d, container, false);

        mEdt00 = (EditText) v.findViewById(R.id.edt00);
        mEdt01 = (EditText) v.findViewById(R.id.edt01);
        mEdt02 = (EditText) v.findViewById(R.id.edt02);

        mEdt10 = (EditText) v.findViewById(R.id.edt10);
        mEdt11 = (EditText) v.findViewById(R.id.edt11);
        mEdt12 = (EditText) v.findViewById(R.id.edt12);

        mEdt20 = (EditText) v.findViewById(R.id.edt20);
        mEdt21 = (EditText) v.findViewById(R.id.edt21);
        mEdt22 = (EditText) v.findViewById(R.id.edt22);

        mBtnA = (Button) v.findViewById(R.id.btnA);
        mBtnB = (Button) v.findViewById(R.id.btnB);
        mBtnAdd = (Button) v.findViewById(R.id.btnAdd);
        mBtnMultiplication = (Button) v.findViewById(R.id.btnMultipication);


        return v;
    }

    @Override
    public void onClick(View v) {

        a00=Integer.parseInt(mEdt00.getText().toString());
        a01=Integer.parseInt(mEdt01.getText().toString());
        a02=Integer.parseInt(mEdt02.getText().toString());

        a10=Integer.parseInt(mEdt10.getText().toString());
        a11=Integer.parseInt(mEdt11.getText().toString());
        a12=Integer.parseInt(mEdt12.getText().toString());

        a20=Integer.parseInt(mEdt20.getText().toString());
        a21=Integer.parseInt(mEdt21.getText().toString());
        a22=Integer.parseInt(mEdt22.getText().toString());



        mBtnB.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {


        b00=Integer.parseInt(mEdt00.getText().toString());
        b01=Integer.parseInt(mEdt01.getText().toString());
        b02=Integer.parseInt(mEdt02.getText().toString());

        b10=Integer.parseInt(mEdt10.getText().toString());
        b11=Integer.parseInt(mEdt11.getText().toString());
        b12=Integer.parseInt(mEdt12.getText().toString());

        b20=Integer.parseInt(mEdt20.getText().toString());
        b21=Integer.parseInt(mEdt21.getText().toString());
        b22=Integer.parseInt(mEdt22.getText().toString());

        }
        });


        mBtnAdd.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        mEdt00.setText(String.valueOf((a00 + b00)));
        mEdt01.setText(String.valueOf((a01 + b01)));
        mEdt02.setText(String.valueOf((a02 + b02)));

        mEdt10.setText(String.valueOf((a10 + b10)));
        mEdt11.setText(String.valueOf((a11 + b11)));
        mEdt12.setText(String.valueOf((a12 + b12)));

        mEdt20.setText(String.valueOf((a20 + b20)));
        mEdt21.setText(String.valueOf((a21 + b21)));
        mEdt22.setText(String.valueOf((a22 + b22)));
        }
        });


        mBtnMultiplication.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        mEdt00.setText(String.valueOf((a00 * b00)+(a01*b10)+(a02*b20)));
        mEdt01.setText(String.valueOf((a00 * b01)+(a01*b11)+(a02*b21)));
        mEdt02.setText(String.valueOf((a00 * b02)+(a01*b12)+(a02*b22)));

        mEdt10.setText(String.valueOf((a10 * b00)+(a11*b10)+(a12*b20)));
        mEdt11.setText(String.valueOf(((a10 * b01)+(a11*b11)+(a12*b21))));
        mEdt12.setText(String.valueOf((a10 * b02)+(a11*b12)+(a12*b22)));

        mEdt20.setText(String.valueOf((a20 * b00)+(a21*b10)+(a22*b20)));
        mEdt21.setText(String.valueOf((a20 * b01)+(a21*b11)+(a22*b21)));
        mEdt22.setText(String.valueOf((a20 * b02)+(a21*b12)+(a22*b22)));
        }


        });
        }


        }
