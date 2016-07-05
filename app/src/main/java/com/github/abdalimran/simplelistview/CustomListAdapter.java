package com.github.abdalimran.simplelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Profile>{

    private final Context context;
    private ArrayList<Profile> profiles;

    public CustomListAdapter(Context context, ArrayList<Profile> profiles) {
        super(context, R.layout.list_single, profiles);
        this.context = context;
        this.profiles=profiles;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(R.layout.list_single, null, true);

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView description = (TextView) view.findViewById(R.id.description);
        ImageView propic = (ImageView) view.findViewById(R.id.propic);

        name.setText(profiles.get(position).getName());
        description.setText(profiles.get(position).getDescription());
        propic.setImageResource(profiles.get(position).getPropic());

        return view;
    }
}