package com.example.fragmenttofragmentdatapass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {
    TextView textView_firstName;
    TextView textView_secondtName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView_firstName = view.findViewById(R.id.textView_firstName);
        textView_secondtName = view.findViewById(R.id.textView_secondtName);

        Bundle bundle = this.getArguments();
        String firstName = bundle.getString("First_Name");
        String secondName = bundle.getString("Second_Name");

        textView_firstName.setText(firstName);
        textView_secondtName.setText(secondName);

    }
}