package Experiment_7_ArrayList;

//第二题 ②
import java.util.*;

public class FamilyInfo {
    private ArrayList<Person> people;
    private final String LIST_END = "END";
    public FamilyInfo() {
        people = new ArrayList<Person>();
    }
    public Person getPerson(String name) {
        int pos = indexOf(name);
        if(pos !=-1) {
            return people.get(pos);
        } else{
            return null;
        }
    }
    private int indexOf(String name) {
        for(int i=0;i<people.size();i++) {
            if (people.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    public void read(Scanner input) {
        String name=input.nextLine();
        while(!name.equals(LIST_END)) {
            ProcessParents(input);
        }
    }
    public void ProcessParents(Scanner input) {
        String personName,motherName,fatherName;
        Person person,mother,father;
        for(;;) {
            personName= input.nextLine();
            if(personName.equals(LIST_END))
                break;
            person = getPerson(personName);
            motherName=input.nextLine();
            fatherName = input.nextLine();
            if(!motherName.equals("unknown")){
                mother = getPerson(motherName);
                person.setMother(mother);
                mother.addkid(person);
            }
            if(!fatherName.equals("unknown")) {
                father= getPerson(fatherName);
                person.setFather(father);
                father.addkid(person);
            }

        }
    }
}
