package Lab8;

import Lab3.Lab3_6;

public class hocVien {
    private String name;
    private String age;

    hocVien(String name, String age){
        this.name = name;
        this.age = age;
    }

    hocVien(String name){
        this(name, "null");
    }

    hocVien(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
