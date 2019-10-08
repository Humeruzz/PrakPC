package Prak2;

public class Author {
    String name, email;
    char gender;

    protected Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }

    void setEmail(String email){
        this.email = email;
    }

    char getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Email: " + email + ", Gender: " + gender + ".";
    }

 }
