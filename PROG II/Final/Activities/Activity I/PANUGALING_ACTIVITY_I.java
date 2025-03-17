public class PANUGALING_ACTIVITY_I {

    
    public static void aboutMe (String name, int age, String address) {
        System.out.println("\nMy name is " + name + ". I am " + age + " years old. I live at " + address + ".\n");
    }

    public static void main(String[] args) {
        String name = "James Ivan";
        int age = 19;
        String address = "Carmen, Toledo City";

        
        aboutMe(name, age, address);
    }
}
