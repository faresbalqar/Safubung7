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

    public void printStudent(){
        System.out.println(this.Vorname);
        System.out.println(this.Nachname);
        System.out.println(this.Studiengang);
        System.out.println(this.Semester);
        System.out.println(this.MatrNr);


    }

    
    

    
    
    
