package Experiment_7_ArrayList;

import java.util.*;
public class Person {
    private String name;
    private	Person mother;
    private Person father;
    private ArrayList<Person> kids;

    public Person(String person) {
        name = person;
        mother = null;
        father= null;
        kids=new ArrayList<Person>();
    }
    public String getName(){
        return name;
    }
    public Person getMother() {
        return mother;
    }
    public Person getFather() {
        return father;
    }
    public int numKids() {
        return kids.size();
    }
    public Person nthKid(int n) {
        return kids.get(n);
    }
    public void setMother(Person mother) {
        this.mother = mother;
    }
    // post: sets the father of this penson
    public void setFather(Person father) {
        this.father = father;
    }
    public void addkid(Person kid) {
        kids.add(kid);
    }

}
