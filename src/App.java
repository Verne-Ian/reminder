public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.outPut("Lubinga Ian", 23);
    }
}

class User{
    public String name;
    public int age;

    public void outPut(String newName, int ages){
        name = newName;
        age = ages;
        System.out.println(name +" is "+ age +" years old.");
    }
}
