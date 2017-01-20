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


public class CheckCharacterFragment extends Fragment implements View.OnClickListener {

    EditText mEdtInput,mEdtResult;
    Button mBtnCheck;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_check_character, container, false);

        mEdtInput = (EditText) v.findViewById(R.id.edtInput);
        mEdtResult = (EditText) v.findViewById(R.id.edtRes);
        mBtnCheck = (Button) v.findViewById(R.id.btnCheck);
        mBtnCheck.setOnClickListener(this);


        return v;

    }

        @Override
    public void onClick(View v) {


            char ch = mEdtInput.getText().charAt(0);
            if (ch >= 48 && ch <= 57) {
                mEdtResult.setText("Entered character is Digit");
            } else if (ch >= 65 && ch <= 90) {
                mEdtResult.setText("Entered character is Capital Letter");

            } else if (ch >= 97 && ch <= 122) {
                mEdtResult.setText("Entered character is Small Case Letter");

            } else if (ch >= 0 && ch <= 47) {
                mEdtResult.setText("Entered character is Special Symbol");

            } else if (ch >= 58 && ch <= 64) {
                mEdtResult.setText("Entered character is Special Symbol");

            } else if (ch >= 91 && ch <= 96) {
                mEdtResult.setText("Entered character is digit");

            } else if (ch >= 123 && ch <= 127) {
                mEdtResult.setText("Entered character is digit");


            }
        }


}
