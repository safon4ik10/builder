public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Возвраст должен быть больше нуля");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null){
            throw new IllegalArgumentException("Фамилия или имя не может быть пустым");
        }
        Person person = new Person(name, surname);
        person.setAge(age);
        person.setAddress(address);
        return person;
    }
}