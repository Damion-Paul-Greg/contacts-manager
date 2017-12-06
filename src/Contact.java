import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Contact {
    private String lastname, firstname, phone,
            notes;
    public Contact(String lastnamename, String firstname, String phone,
                   String lastname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
    }
    public Contact() {
    }
    // overrides the default Object method
    public String toString() {
        return lastname + "  " + firstname + "   " + phone;
    }

    public void setLastName(String s) {
        lastname = s;
    }

    public String getLastName() {
        return lastname;
    }

    public void setFirstName(String a) {
        firstname = a;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setPhone(String e) {
        phone = e;
    }

    public String getPhone() {
        return phone;
    }


    /**
     *
     */
    static void write() {
        // Writes contact info to file. -Damani

        try {
            Contact contact;
            contact = new Contact();
            Contact c = contact;
            File file = new File("contactlist.csv");
            // If file doesn't exists, then create it.
            if (!file.exists()) {
                file.createNewFile();
            }
            try (PrintWriter output = new PrintWriter(new FileWriter(
                    "contactlist.csv", true))) {
                output.printf("%s\r\n", c);
            } catch (Exception e) {
            }
            System.out.println("Your contact has been saved.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}