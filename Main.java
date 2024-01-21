public class Main {
    public static void main(String[] args) {
        User user1 = User.getUser();
        user1.setNome("Pino");
        user1.setEta(44);

        User user2 = User.getUser();
        user2.setNome("Giuseppe");
        user2.setEta(21);

        user1.stampaInformazioni();
        user2.stampaInformazioni();
    }
}
