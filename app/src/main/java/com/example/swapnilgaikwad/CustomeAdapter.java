package com.example.swapnilgaikwad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.swapnilgaikwad.listviewdemo.R;
import com.example.swapnilgaikwad.model.Person;

import java.util.List;

public class CustomeAdapter extends BaseAdapter {

    private Context context;
    private List<Person> personList;
    private LayoutInflater layoutInflater;

    public CustomeAdapter(Context context, List<Person> personList) {
        this.context = context;
        this.personList = personList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Person getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Person person = personList.get(position);

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_element, parent, false);
        }

        PersonHolder personHolder = new PersonHolder(convertView , person);

        return convertView;
    }

    class PersonHolder {
        private TextView age;
        private TextView name;

        public PersonHolder(View convertView, Person person) {
            age = (TextView) convertView.findViewById(R.id.age_id);
            age.setText(person.getAge());
            name = (TextView) convertView.findViewById(R.id.name_id);
            name.setText(person.getName());
        }
    }
}
