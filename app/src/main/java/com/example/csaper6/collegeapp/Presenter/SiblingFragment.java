package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.csaper6.collegeapp.Model.Guardian;
import com.example.csaper6.collegeapp.Model.Sibling;
import com.example.csaper6.collegeapp.R;
import com.backendless.BackendlessUser;
import com.backendless.Backendless;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by csaper6 on 12/13/16.
 */

public class SiblingFragment extends ListFragment implements View.OnClickListener{

    private List<Sibling> siblingList;
    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = super.onCreateView(inflater, container, savedInstanceState);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        wirewidgets();

        siblingList = new ArrayList<>();
        populateList();

        SiblingAdapter adapter = new SiblingAdapter(getActivity(), siblingList);

        setListAdapter(adapter);



        return rootView;
    }

    private void wirewidgets() {

        EditText firstNameSibling = (EditText)  rootView.findViewById(R.id.first_name_profile);
        EditText lastNameSibling = (EditText) rootView.findViewById(R.id.last_name_profile);
        EditText relationshiSibling = (EditText) rootView.findViewById(R.id.relationship_sibling);
        EditText ageSibling = (EditText) rootView.findViewById(R.id.age_sibling);
        Button submitSibling = (Button) rootView.findViewById(R.id.submit_sibling);
    }

    private void populateList() {
        siblingList.add(new Sibling("Michael","Wu",18,"A PLTW android studio classmate"));
    }


    @Override
    public void onClick(View view) {

    }
}
