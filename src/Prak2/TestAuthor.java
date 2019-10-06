package Prak2;

public class TestAuthor {
    public static void main(String [] args){
        Author person1 = new Author("Victor", "victor@mail.ru", 'M');
        System.out.println("His name is " + person1.getName());
        System.out.println("His email: " + person1.getEmail());
        person1.setEmail("victor123@mail.ru");
        System.out.println("His new email is " + person1.getEmail());
        System.out.println("His gender is " + person1.getGender());
        System.out.println(person1.ToString());
    }
}
