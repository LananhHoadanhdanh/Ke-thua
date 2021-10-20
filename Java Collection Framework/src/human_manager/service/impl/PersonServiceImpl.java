package human_manager.service.impl;

import human_manager.model.Person;
import human_manager.service.GeneralService;

import java.util.ArrayList;

public class PersonServiceImpl implements GeneralService<Person> {
    private ArrayList<Person> personList;

    public PersonServiceImpl() {
        personList = new ArrayList<>();
    }

    @Override
    public void print() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        System.out.println("___________________________");
    }

    @Override
    public void add(Person person) {
        personList.add(person);
        System.out.println("Đã thêm!");

    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPersonalId() == id) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void deleteById(int id) {
        if (findIndexById(id) != -1) {
            personList.remove(findIndexById(id));
            System.out.println("Đã xóa!");
        } else {
            System.out.println("Không có học sinh này.");
        }
    }

    @Override
    public void editById(int id, Person person) {
        if (findIndexById(id) != -1) {
            personList.set(findIndexById(id), person);
        } else {
            System.out.println("Không có học sinh này.");
        }
    }

    @Override
    public void findByName(String name) {
        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                System.out.println(personList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có tên này!");
        }
    }
}
