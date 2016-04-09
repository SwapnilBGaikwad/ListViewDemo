package com.example.swapnilgaikwad.repository;


import com.example.swapnilgaikwad.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepo {
    private List<Person> personList = new ArrayList<>();

    public PersonRepo() {
        personList.add(new Person("A" , 10));
        personList.add(new Person("B" , 20));
        personList.add(new Person("C" , 30));
        personList.add(new Person("D" , 40));
        personList.add(new Person("E" , 50));
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
