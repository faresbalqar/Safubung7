public class Exercise extends Course {
    private String type = "PCÜ";
    
    public Exercise(String name){
        super(name);
        Student[] participants = new Student[20];
    }

    public void print(){
    System.out.println("Typ der Veranstaltung: " + getType());
    System.out.println("Name der Veranstaltung: " + getName());
    System.out.println("Name des Dozenten: " + getLecturer());
}

    public String getType() {
        return type;
    }

}
