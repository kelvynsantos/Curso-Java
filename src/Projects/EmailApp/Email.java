package Projects.EmailApp;

import java.util.Scanner;


public class Email {
    private String firstnName;
    private String lastName;
    private String password;
    private String departmnet;
    private int mailBoxCapacity;
    private String Email;
    private String AlternativeEmail;
    private String Sufix = ".intercopix.com";
    Scanner input = new Scanner(System.in);
    public  Email(String firstName, String lastName) {
        this.firstnName = firstName;
        this.lastName = lastName;
        this.departmnet = setDepartment();
        this.Sufix = Sufix;
        Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departmnet + Sufix;
        System.out.println("Your Email is:" + Email);
        setPassword();
    }
    private String setDepartment () {
        System.out.print("Enter the Department code =  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        int depChoice = input.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "dev";}
        else if ( depChoice == 3) {return "acct";}
        else {return "none";}
    }

//    public String getFirstnName() {
//        return firstnName;
//    }
//
//    public void setFirstnName(String firstnName) {
//        this.firstnName = firstnName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = randomPassword();
    }
//
//    public String getDepartmnet() {
//        return departmnet;
//    }
//
//    public void setDepartmnet(String departmnet) {
//        this.departmnet = departmnet;
//    }
//
//    public int getMailBoxCapacity() {
//        return mailBoxCapacity;
//    }
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    public void setEmailCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }
//
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }
    public void setAltEmail(String altEmail) {
        this.AlternativeEmail = altEmail;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstnName='" + firstnName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", departmnet='" + departmnet + '\'' +
                ", mailBoxCapacity=" + mailBoxCapacity +
                ", Email='" + Email + '\'' +
                ", AlternativeEmail='" + AlternativeEmail + '\'' +
                '}';
    }

    String randomPassword(){
        System.out.println("Type the number of digits:");
        int length = 0;
        if (input != null) {
            length = input.nextInt();
        }
        String lower_cases = "abcdefghijklmnopqrstuvwxyz";
        String upper_cases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String password = "";
        for (int i = 0; i <= length; i++){
            int rand = (int) ( 3 * Math.random());
            switch(rand) {
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                     break;
                case 1:
                    rand = (int)(lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(rand));
                    break;
                case 2:
                    rand = (int)(upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(rand));
                    break;
                case 3:
                    rand = (int)(numbers.length * Math.random());
                    password += String.valueOf(numbers[rand]);
                    break;
            }
        }
        return new String(password);
    }
}
