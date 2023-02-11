package Homework5;

class Person {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public Person (String name, String post, String email, String phone, int pay, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return name + ". " + post + ". " + "\n" + email + ". " + phone + ". " + pay + ". " + age + "лет.";
    }
}
