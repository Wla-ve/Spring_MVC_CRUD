package web.model;

import javax.persistence.*;


@Entity
@Table(schema = "spring", name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Byte age;

    public User() {
    }

    public User(String firstName, String lastName, Byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String password) {
        this.lastName = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User {" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = '" + age + '\'' +
                '}';
    }
}