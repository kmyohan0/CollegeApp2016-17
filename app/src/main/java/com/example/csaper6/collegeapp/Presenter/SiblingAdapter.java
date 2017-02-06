package com.example.csaper6.collegeapp.Presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.csaper6.collegeapp.Model.Sibling;
import com.example.csaper6.collegeapp.R;

import java.util.List;

/**
 * Created by csaper6 on 2/6/17.
 */
public class SiblingAdapter extends ArrayAdapter<Sibling> {

    public SiblingAdapter(Context context, List<Sibling> objects) {super(context, 0, objects);}

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_sibling, null);

        }
        Sibling sibling = getItem(position);

        TextView nameText = (TextView) convertView.findViewById(R.id.text_name);
        TextView relationshipText = (TextView) convertView.findViewById(R.id.text_relationship);
        TextView ageText = (TextView) convertView.findViewById(R.id.text_age);

        nameText.setText((sibling.getFirstName().toString()) + " " +  (sibling.getLastName().toString()));
        relationshipText.setText(sibling.getRelationship());
        ageText.setText("" + sibling.getAge());

        return convertView;

    }
}
