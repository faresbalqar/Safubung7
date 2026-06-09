public class Lecturer {
    private String firstName;
    private String lastName;    

public Lecturer(String fn, String ls){
    this.firstName = fn;
    this.lastName = ls;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

}