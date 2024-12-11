package com.northcoders.databindingdemo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

public class Person extends BaseObservable {

    private String name;
    private int age;
    private String email;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person() {
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return String.valueOf(age);
    }

    public void setAge(int age) {
        notifyPropertyChanged(BR.age);
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
