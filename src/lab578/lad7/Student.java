package lad7;

public  class Student {
    //properties of student class
    private String name;
    private int age;
    private String gender;
    private double height;
    //default constructor
    public Student(){}

    public Student(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
    //design constructor


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() { return name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}