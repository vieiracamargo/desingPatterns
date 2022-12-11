public class Person {
    private String firstName;
    private String lastName;
    private String user;
    private String email;

    private Person(String firstName, String lastName, String user, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", user='" + user + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String user;
        private String email;

        public PersonBuilder firstname(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder user(String user){
            this.user = user;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public Person build(){
           if(Utils.isValid(firstName) && Utils.isValid(lastName) && Utils.isValid(user) && Utils.isValid(email)){
               return new Person(firstName, lastName, user, email);
           }else{
               throw new RuntimeException("Todos os campos devem ser preenchidos!");
           }
        }
    }

}

