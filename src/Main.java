public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstname("Bruno")
                .lastName("Camargo")
                .email("    ")
                .user(null)
                .build();

        System.out.println(person);
    }
}