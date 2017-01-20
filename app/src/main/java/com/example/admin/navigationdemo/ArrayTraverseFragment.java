package com.example.admin.navigationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by admin on 05-01-2017.
 */

public class ArrayTraverseFragment extends Fragment{

    EditText mEdtName,mEdtAge,mEdtShow;
    Button mBtnAdd,mBtnFirst,mBtnLast,mBtnNext,mBtnPrevious;
    Map<String, String> myLinkedHashmap=new LinkedHashMap<>();
    ArrayList myList=new ArrayList();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_array_traverse, container, false);

        mEdtName = (EditText) v.findViewById(R.id.edtName);
        mEdtAge = (EditText) v.findViewById(R.id.edtAge);
        mEdtShow = (EditText) v.findViewById(R.id.edtShow);

        mBtnAdd = (Button) v.findViewById(R.id.btnAdd);
        mBtnFirst = (Button) v.findViewById(R.id.btnFirst);
        mBtnLast = (Button) v.findViewById(R.id.btnLast);
        mBtnNext = (Button) v.findViewById(R.id.btnNext);
        mBtnPrevious = (Button) v.findViewById(R.id.btnPrevious);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name, age;
                name = mEdtName.getText().toString();
                age = mEdtAge.getText().toString();

                myLinkedHashmap.put(name, age);
                if (myLinkedHashmap.size() > 5) {
                    Toast.makeText(getContext(), "Array is FULL!!!!!", Toast.LENGTH_LONG).show();
                }
            }

        });

        mBtnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Map.Entry obj = myLinkedHashmap.entrySet().iterator().next();
                mEdtShow.setText(obj.getKey() + " " + obj.getValue());

            }
        });

        mBtnLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Map.Entry obj = (Map.Entry) myLinkedHashmap.entrySet().toArray()[myLinkedHashmap.size() - 1];
                mEdtShow.setText(obj.getKey() + " " + obj.getValue());

            }
        });

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Iterator itr = myLinkedHashmap.entrySet().iterator();
                while (itr.hasNext()) {
                    mEdtShow.setText(String.valueOf(itr.next()));
                }


            }
        });

        mBtnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ListIterator<Map.Entry<String, String>> listIterator = new LinkedList<>(myLinkedHashmap.entrySet()).listIterator();
                while (listIterator.hasPrevious()) {
                    mEdtShow.setText(listIterator.previous().getKey());
                }
            }

        });






    return v;
    }
}