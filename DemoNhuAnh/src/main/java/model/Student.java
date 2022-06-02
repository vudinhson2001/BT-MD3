package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private Class classId;

    public Student() {
    }

    public Student(int id, String name, int age, Class classId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public Student(int id, String name, int age, int classId) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }
}

