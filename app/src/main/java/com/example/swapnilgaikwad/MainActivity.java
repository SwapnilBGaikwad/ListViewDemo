package com.example.swapnilgaikwad;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.swapnilgaikwad.listviewdemo.R;
import com.example.swapnilgaikwad.model.Person;
import com.example.swapnilgaikwad.repository.PersonRepo;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = (ListView) findViewById(R.id.list_view_id);

        PersonRepo personRepo = new PersonRepo();

        List<Person> data = personRepo.getPersonList();

        listView.setAdapter(new CustomeAdapter(MainActivity.this , data));

    }

}
