package gr.aueb.cf;

public class UserMain {
    static void main() {
        User player = new User(1, "Lebron", "James");

        player.setId(1);
        player.setFirstname("Lebron");
        player.setLastname("James");

        System.out.println("User id" + player.getId());
        System.out.println("User firstname: " + player.getFirstname());
        System.out.println("User lastname: " + player.getLastname());
    }
}
