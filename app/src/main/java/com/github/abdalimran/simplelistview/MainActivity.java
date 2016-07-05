package com.github.abdalimran.simplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private ArrayList<Profile>profiles;
    private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profiles = new ArrayList<>();
        addProfiles();

        list=(ListView)findViewById(R.id.list);
        adapter = new CustomListAdapter(this,profiles);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),profiles.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addProfiles()
    {
        profiles.add(new Profile("Name 1","This is sample description 1.",R.drawable.img1));
        profiles.add(new Profile("Name 2","This is sample description 2.",R.drawable.img2));
        profiles.add(new Profile("Name 3","This is sample description 3.",R.drawable.img3));
        profiles.add(new Profile("Name 4","This is sample description 4.",R.drawable.img4));
        profiles.add(new Profile("Name 5","This is sample description 5.",R.drawable.img5));
        profiles.add(new Profile("Name 6","This is sample description 6.",R.drawable.img6));
        profiles.add(new Profile("Name 7","This is sample description 7.",R.drawable.img7));
    }
}
