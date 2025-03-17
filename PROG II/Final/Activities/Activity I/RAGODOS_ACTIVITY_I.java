public class RAGODOS_ACTIVITY_I {

    
    public static void aboutMe (String name, int age, String address) {
        System.out.println("\nMy name is " + name + ". I am " + age + " years old. I live at " + address + ".\n");
    }

    public static void main(String[] args) {
        String name = "Shofe Ragodos";
        int age = 18;
        String address = "Ilihan, Toledo City";

        
        aboutMe(name, age, address);
    }
}