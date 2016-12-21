package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/13/16.
 */
public class GuardianFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);

        EditText firstNameGuardian = (EditText)  rootView.findViewById(R.id.first_name_guardian);
        EditText lastNameGuardian = (EditText) rootView.findViewById(R.id.last_name_guardian);
        EditText occpationGuardian = (EditText) rootView.findViewById(R.id.occupation_guardian);
        EditText ageGuardian = (EditText) rootView.findViewById(R.id.age_guardian);
        Button submit = (Button) rootView.findViewById(R.id.submit_guardian);
        return rootView;
    }

}

