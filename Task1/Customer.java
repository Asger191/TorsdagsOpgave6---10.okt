package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

       public Customer(String firstName, String lastname, String username){

            this.id=counter++;

            this.firstName=firstName;
            this.lastName=lastname;
            this.username=username;


        }

            void setFirstName(String firstName){
            this.firstName=firstName;

            }

            public String getFirstName() {
                return firstName;
            }

            void setLastName(String lastName) {
            this.lastName=lastName;
            }

            public String getLastName() {
            return lastName;
            }



            void setUsername(String username) {
            this.username=username;
            }

            public String getUsername(String username) {
            return username;
            }



                    @Override
                    public String toString(){

                    return "Kundens id: "  + id + '\n' + " Kundens fornavn: " + firstName + '\n' + " Kundens efternavn: " + lastName + '\n' + " Kundens brugernavn: " + username + '\n';


                    }



}
