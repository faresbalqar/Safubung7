public class Course {
    private Student[] participants = new Student[40];
    private int numberOfParticipants = 0;
    private String name;
    private String lecturer;

public Course(String name){
    this.name = name;
}

public String getName() {
    return name;
}

public String getLecturer() {
    return lecturer;
}

public void setName(String name) {
    this.name = name;
}

public void setLecturer(String lecturer) {
    this.lecturer = lecturer;
}

public Student[] getParticipants() {
    return participants;
}

public void setParticipants(Student[] participants) {
    this.participants = participants;
}

public int getNumberOfParticipants() {
    return numberOfParticipants;
}

public void setNumberOfParticipants(int numberOfParticipants) {
    this.numberOfParticipants = numberOfParticipants;
}

public void print(){
    System.out.println("Name der Veranstaltung: " + this.name);
    System.out.println("Name des Dozenten: " + lecturer);
}

public boolean register(Student student){
    if(numberOfParticipants < 40){
    participants[numberOfParticipants] = student;
    numberOfParticipants++;
    } else {
        return false;
    }
    return true;
}

public int getCapacity() {
    return participants.length;
}

}