public class Author {
    private static String name;
    private static String email;
    private static char gender;
    public Author(String a, String b, char c){
        this.name = a;
        this.email = b;
        this.gender = c;
    }
    public static String getName(){
        return name;
    }
    public static String getEmail(){
        return email;
    }
    public static void setEmail(String a){
        email = a;
    }
    public static char getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
