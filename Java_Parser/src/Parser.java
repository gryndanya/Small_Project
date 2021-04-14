public class Parser {
    public static void main(String[] args) {

    }
}
abstract class Person {

    abstract void sayName();

    abstract void status();

    abstract void sayLogin();
}

class User extends Person{

    private String name;
    private String surname;
    private int old;
    private String login;

    User(String name, String surname, int old, String login){
        this.name = name;
        this.surname = surname;
        this.old = old;
        this.login = login;
    }
    @Override
    void sayName() {
        System.out.println(name + surname + old + login);
    }

    @Override
    void status() {
        System.out.println("User");
    }

    @Override
    void sayLogin() {
        System.out.println("Login : "+login);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

class Doctor extends User {

    private String name;
    private String surname;
    private int old;
    private String login;

    Doctor(String name, String surname, int old, String login) {
        super(name, surname, old, login);
    }

    @Override
    void sayName() {
        System.out.println(name + surname + old + login);
    }

    @Override
    void status() {
        System.out.println("Doctor");
    }

    @Override
    void sayLogin() {
        System.out.println("Login : "+login);
    }

    public void sentOrder(String order, Pharmacist pharmacist){
        pharmacist.setOrder(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

class Patient extends User{

    private String name;
    private String surname;
    private int old;
    private String login;
    private String prescription;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    Patient(String name, String surname, int old, String login) {
        super(name, surname, old, login);
    }

    @Override
    void sayName() {
        System.out.println(name + surname + old + login);
    }

    @Override
    void status() {
        System.out.println("Patient");
    }

    @Override
    void sayLogin() {
        System.out.println("Login : "+login);
    }
}

class Pharmacist extends User{

    private String name;
    private String surname;
    private int old;
    private String login;
    private String order;

    Pharmacist(String name, String surname, int old, String login) {
        super(name, surname, old, login);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getOld() {
        return old;
    }

    @Override
    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    @Override
    void sayName() {
        System.out.println(name + surname + old + login);
    }

    @Override
    void status() {
        System.out.println("Pharmacist");
    }

    @Override
    void sayLogin() {
        System.out.println("Login : "+login);
    }
}