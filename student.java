public class Student {
    private String Vorname;
    private String Nachname;
    private int MatrNr;
    private String Studiengang; 
    private int Semester;

    ///konstruktor
    
    public Student(int matNr, int fsemester, String vname, String nname){
        this.MatrNr = matNr;
        this.Semester = fsemester;
        this.Vorname = vname;
        this.Nachname = nname;
    }

    //// getter und setter

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public int getMatrNr() {
        return MatrNr;
    }

    public String getStudiengang() {
        return Studiengang;
    }

    public int getSemester() {
        return Semester;
    }

    public void setVorname(String vorname) {
        this.Vorname = vorname;
    }

    public void setNachname(String nachname) {
       this.Nachname = nachname;
    }

    public void setMatrNr(int matrNr) {
        this.MatrNr = matrNr;
    }

    public void setStudiengang(String studiengang) {
        this.Studiengang = studiengang;
    }

    public void setSemester(int semester) {
        this.Semester = semester;
    }

    public void printStudent(){
        System.out.println("Vorname : " + this.Vorname);
        System.out.println("Nachname : " + this.Nachname);
        System.out.println("MatrNr : " + this.MatrNr);
        System.out.println("Semester : " + this.Semester);
    }
    
}   
