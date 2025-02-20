package mocks.crud.task.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Long id;

    private String name;

    private Integer age;

    private Address address;

    private List<Person> relatives;

    public Person(Long id, String name, Integer age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        relatives = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Person> getRelatives() {
        return relatives;
    }

    public void addRelatives(Person relative) {
        this.relatives.add(relative);
    }
}
