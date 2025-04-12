package netology.creational;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        if (name != null) {
            this.name = name;
            return this;
        } else {
            throw new IllegalArgumentException("Name can't be null");
        }
    }

    public PersonBuilder setSurname(String surname) {
        if (surname != null) {
            this.surname = surname;
            return this;
        } else {
            throw new IllegalArgumentException("Surname can't be null");
        }
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Age can't be negative");
        }
    }

    public PersonBuilder setAddress(String address) {
        if (address != null) {
            this.address = address;
            return this;
        } else {
            throw new IllegalArgumentException("Address can't be null");
        }
    }

    public Person build() {
        if (name != null && surname != null && age >= 0 && address != null) {
            Person person = new Person(name, surname, age);
            person.setAddress(address);
            return person;
        } else {
            throw new IllegalStateException("All fields must be set");
        }
    }
}
