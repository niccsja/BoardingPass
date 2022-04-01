

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {

    String name;
    String phoneNumber;
    String email;
    String gender;
    String age;
    String date;
    String origin;
    String destination;
    String departureTime;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        welcome();
        System.out.println("Please enter your name:");
        main.setName(input.nextLine());
        System.out.println("Please enter your email:");
        main.setEmail(input.nextLine());
        System.out.println("Please enter your phoneNumber:");
        main.setPhoneNumber(input.nextLine());
        System.out.println("Please enter your gender (M/F):");
        main.setGender(input.nextLine());
        System.out.println("Please enter your age:");
        main.setAge(input.nextLine());
        System.out.println("Please enter the date:");
        main.setDate(input.nextLine());
        System.out.println("Please enter your place of origin:");
        main.setOrigin(input.nextLine());
        System.out.println("Please enter your destination:");
        main.setDestination(input.nextLine());
        System.out.println("Please enter your desired departure time:");
        main.setDepartureTime(input.nextLine());

        FileWriter newWriter = new FileWriter("custInfo.txt");
        newWriter.write(main.getName());
        newWriter.write("\r\n");
        newWriter.write(main.getEmail());
        newWriter.write("\r\n");
        newWriter.write(main.getPhoneNumber());
        newWriter.write("\r\n");
        newWriter.write(main.getGender());
        newWriter.write("\r\n");
        newWriter.write(main.getAge());
        newWriter.write("\r\n");
        newWriter.write(main.getDate());
        newWriter.write("\r\n");
        newWriter.write(main.getOrigin());
        newWriter.write("\r\n");
        newWriter.write(main.getDestination());
        newWriter.write("\r\n");
        newWriter.write(main.getDepartureTime());
        newWriter.write("\r\n");
        newWriter.close();

        Scanner output = new Scanner(new File("custInfo.txt"));
        while (output.hasNextLine())
        {
            System.out.println("\r\n");
            System.out.println(output.nextLine());
        }


    }

    public static void welcome() {
        System.out.println("Welcome to the boarding pass vendor! Please enter your information for more information.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {

        return this.phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender()
    {

        return this.gender;
    }

    public void setAge(String age) {
        this.age= age;
    }

    public String getAge()
    {
        return this.age;
    }
    public void setDate(String date) {
        this.date= date;
    }

    public String getDate()
    {
        return this.date;
    }
    public void setOrigin(String origin) {
        this.origin= origin;
    }

    public String getOrigin()
    {
        return this.origin;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination()
    {
        return this.destination;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime()
    {
        return this.departureTime;
    }



}
