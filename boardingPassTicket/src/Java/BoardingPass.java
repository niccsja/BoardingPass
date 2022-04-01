import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
public class BoardingPass
{
    File inputFile;
    File outputFile;
    Random rng;
    Scanner reader;
    FileWriter passFile;
    private static int passes = 0;
    private int passNumber;
    private int age;
    private int eta;
    private String date;
    private String destination;
    private String email;
    private String gender;
    private String name;
    private String origin;
    private String phoneNumber;
    private String departTime;
    private float finalPrice;
    public BoardingPass(String filePath) throws IOException
    {
        inputFile = new File(filePath);
        reader = new Scanner(inputFile);
        name = reader.nextLine();
        email = reader.nextLine();
        phoneNumber = reader.nextLine();
        gender = reader.nextLine();
        age = Integer.parseInt(reader.nextLine());
        date = reader.nextLine();
        origin = reader.nextLine();
        destination = reader.nextLine();
        departTime = reader.nextLine();
        rng = new Random();
        eta = rng.nextInt(18);
        passNumber = newPassNumber();
        finalPrice = getDiscountPrice(age, gender);
    }

    public BoardingPass() {

    }

    public int newPassNumber()
    {
        passes++;
        return passes;
    }

    public float getDiscountPrice(int age, String gender)
    {
        float price = 50.00f;
        if (age <= 12)
            return price*0.5f;
        else if (age >= 60)
            return price*0.4f;
        else if (gender.equalsIgnoreCase("Female"))
            return price*0.75f;
        else
            return price;
    }
    public void toFile() throws IOException
    {
        outputFile = new File("BoardingPass.txt");
        passFile = new FileWriter(outputFile);
        passFile.write("Name: " + name + "\n");
        passFile.write("Phone Number: " + phoneNumber + "\n");
        passFile.write("Age: " + age + "\n");
        passFile.write("Email: " + email + "\n");
        passFile.write("Phone: " + phoneNumber + "\n");
        passFile.write("Gender: " + gender + "\n");
        passFile.write("Age: " + age + "\n");
        passFile.write("Date: " + date + "\n");
        passFile.write("From " + origin + " to " + destination + "\n");
        passFile.write("Departing at " + departTime + "\n");
        passFile.write("ETA: " + eta + "Hours\n");
        passFile.write("Price: " + finalPrice + "\n");
        passFile.write("Passport Number: " + passNumber);
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    public void setDate(String s)
    {
        this.date = s;
    }
    public void setDepartTime(String s)
    {
        this.departTime = s;
    }
    public void setDestination(String s)
    {
        this.destination = s;
    }
    public void setEmail(String s)
    {
        this.email = s;
    }
    public void setEta(int i)
    {
        this.eta = i;
    }
    public void setFinalPrice(float f)
    {
        this.finalPrice = f;
    }
    public void setGender(String s)
    {
        this.gender = s;
    }
    public void setName(String s)
    {
        this.name = s;
    }
    public void setOrigin(String s)
    {
        this.origin = s;
    }
    public void setPassNumber(int i)
    {
        this.passNumber = i;
    }
    public void setPhoneNumber(String s)
    {
        this.phoneNumber = s;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getDate()
    {
        return this.date;
    }
    public String getDepartTime()
    {
        return this.departTime;
    }
    public String getDestination()
    {
        return this.destination;
    }
    public String getEmail()
    {
        return this.email;
    }
    public int getEta()
    {
        return this.eta;
    }
    public float getFinalPrice()
    {
        return this.finalPrice;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getName()
    {
        return this.name;
    }
    public String getOrigin()
    {
        return this.origin;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public int getPassNumber()
    {
        return passNumber;
    }
}
