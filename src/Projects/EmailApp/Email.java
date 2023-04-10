package EmailApp;

import java.util.Scanner;


public class Email {
    private String firstnName;
    private String lastName;
    private String password;
    private String departmnet;
    private int mailBoxCapacity;
    private String alternativeEmail;
    Scanner input = new Scanner(System.in);
    public  Email(String firstName, String lastName) {
        this.firstnName = firstName;
        this.lastName = lastName;
        this.departmnet = setDepartment();
    }
    private String setDepartment () {
        System.out.print("Enter the Department code =  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        int depChoice = input.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "dev";}
        else if ( depChoice == 3) {return "acct";}
        else {return "none";}

    }

    public String getFirstnName() {
        return firstnName;
    }

    public void setFirstnName(String firstnName) {
        this.firstnName = firstnName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartmnet() {
        return departmnet;
    }

    public void setDepartmnet(String departmnet) {
        this.departmnet = departmnet;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    private String randomPassword(int lenght){
        System.out.println("Type the number of digits:");
        lenght = input.nextInt();
        String lower_cases = "a b c d e f g h i j k l m n o p q r s t u v w x y z".trim();
        String upper_cases = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".trim();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String password = "";
        for ( int i = 0; i < lenght; i++){
            int rand = (int) ( 10 * Math.random());
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
                case 3:
                    rand = (int)(numbers.length * Math.random());
                    password += String.valueOf(numbers[rand]);
                    break;
            }
        }
        return password;
    }
}
