import java.util.Scanner;

/*A student portal provides user to register their profile.
During registration the system needs to validate the user should be located in India.
If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
registerUser– The parameter are String username,String userCountry and add the following logic,
• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves,
Name Country Expected Output Mickey US InvalidCountryException should be thrown.
The message should be “User Outside India cannot be registered” Mini India The message should be
“User registration done successfully”
Sample Input and Output
*/
class InvalidCountryException extends Exception{
    @Override
    public String toString() {
        return "User outside India caanot be registered";
    }
}
class UserRegistration{
    private String uname;
    private String uCountry;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getuCountry() {
        return uCountry;
    }

    public void setuCountry(String uCountry) throws InvalidCountryException {
        if(!uCountry.equals("India")){
            InvalidCountryException ob = new InvalidCountryException();
            throw ob;
        }
        this.uCountry = uCountry;
    }
}
public class Exercise7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UserRegistration s1 = new UserRegistration();
        try{
            System.out.println("Enter name : ");
            String name = sc.next();
            s1.setUname(name);
            System.out.println("Enter country : ");
            String coun = sc.next();
            s1.setuCountry(coun);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
