package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.csaper6.collegeapp.Model.Guardian;
import com.example.csaper6.collegeapp.Model.Profile;
import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class ProfileFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        //wire widgets
        EditText firstNameProfile = (EditText)  rootView.findViewById(R.id.first_name_profile);
        EditText lastNameProfile = (EditText) rootView.findViewById(R.id.last_name_profile);
        //Button submitProfile = (Button) rootView.findViewById(R.id.submit_profile);

        //get information from the model layer
        Profile p = new Profile("Yohan", "Kim");

        //put the information in the view layer
        firstNameProfile.setText(p.getFirstName());
        lastNameProfile.setText(p.getLastName());

        return rootView;
    }
}

