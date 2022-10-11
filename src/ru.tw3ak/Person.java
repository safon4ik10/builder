public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;
    private boolean hasAddress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age > 0) {
            return;
        }
        this.age = age;
    }

    public void happyBirthday() {
        if (this.age > 0) {
            this.age++;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null) {
            this.hasAddress = true;
        }
        this.address = address;
    }

    public boolean isHasAddress() {
        return this.hasAddress;
    }

    public boolean isHasAge() {
        return this.age > 0;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address)
                .setAge(11);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
