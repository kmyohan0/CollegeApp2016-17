package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.csaper6.collegeapp.Model.Sibling;
import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/13/16.
 */
public class SiblingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_sibling, container, false);

        EditText firstNameSibling = (EditText)  rootView.findViewById(R.id.first_name_profile);
        EditText lastNameSibling = (EditText) rootView.findViewById(R.id.last_name_profile);
        EditText relationshiSibling = (EditText) rootView.findViewById(R.id.relationship_sibling);
        EditText ageSibling = (EditText) rootView.findViewById(R.id.age_sibling);
        Button submitSibling = (Button) rootView.findViewById(R.id.submit_sibling);

        Sibling s = new Sibling("Yohan", "Kim", 17, "Brother");

        firstNameSibling.setText(s.getFirstName());
        lastNameSibling.setText(s.getLastName());
        ageSibling.setText("" + s.getAge());
        relationshiSibling.setText(s.getRelationship());

        return rootView;
    }
}
