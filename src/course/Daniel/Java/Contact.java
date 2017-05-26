package course.Daniel.Java;

/**
 * Created by Jakars on 26/05/2017.
 //Properties:
 // firstname
 //lastname
 //phone
 //constructor
 //getters and setters
 //hashcode
 //equals
 //toString
 //finally, implement comparable<contact>
 */
public class Contact implements Comparable<Contact>{

    private String firstname;
    private String lastname;
    private String phone;



    public Contact(String firstname, String lastname, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!firstname.equals(contact.firstname)) return false;
        if (lastname != null ? !lastname.equals(contact.lastname) : contact.lastname != null) return false;
        return phone.equals(contact.phone);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + phone.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact o) {
        int firstNameDiff = firstname.compareTo(o.firstname);
        if (firstNameDiff!=0)return firstNameDiff;

        if (lastname != null && o.lastname != null) {
            int lastNameDiff = lastname.compareTo(o.lastname);
            if (lastNameDiff != 0) return lastNameDiff;
        }

        return phone.compareTo(o.phone);
    }
}
