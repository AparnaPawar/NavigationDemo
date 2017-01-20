package com.example.admin.navigationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 28-12-2016.
 */

public class MyCalculatorFragment extends Fragment implements View.OnClickListener {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button btnClear;
    private TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_mycalculator, container, false);

        operand1 = (EditText) v.findViewById(R.id.edtOperand1);
        operand2 = (EditText) v.findViewById(R.id.edtOperand2);
        btnAddition = (Button) v.findViewById(R.id.btnAddition);
        btnSubtraction = (Button) v.findViewById(R.id.btnSubtraction);
        btnDivision = (Button) v.findViewById(R.id.btnDivision);
        btnMultiplication = (Button) v.findViewById(R.id.btnMultiplication);
        btnClear = (Button) v.findViewById(R.id.btnClear);

        txtResult = (TextView) v.findViewById(R.id.txtResult);


        return v;

    }

    @Override
    public void onClick(View v) {


        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(getContext(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(getContext(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();

                }

            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {

                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(getContext(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();

                }

            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {

                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(getContext(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();

                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();

            }
        });

    }
}