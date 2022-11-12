package com.example.fragmenttofragmentdatapass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment implements View.OnClickListener{

    EditText editText_firstName;
    EditText editText_secondName;
    Button button_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editText_firstName = view.findViewById(R.id.editText_firstName);
        editText_secondName = view.findViewById(R.id.editText_secondName);
        button_submit = view.findViewById(R.id.button_submit);

        button_submit.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button_submit){
            Bundle bundle = new Bundle();
            String firstName = editText_firstName.getText().toString().trim();
            String secondName = editText_secondName.getText().toString().trim();

            bundle.putString("First_Name",firstName);
            bundle.putString("Second_Name",secondName);

            SecondFragment secondFragment = new SecondFragment();
            secondFragment.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,secondFragment).commit();
        }

    }
}