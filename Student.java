package RIS;

public class Student {

    private int ID;
    private String name;

    public Student(){
    	
    }

    public void setID(int ID) {
        this.ID=ID;
    }

    public int getID() {
        return ID;
    }

    public void setName(String Name) {
        this.name=Name;
    }

    public String getName() {
        return name;
    }

    int[] classabsenteeismc= {4,6,2,7,19,16,19,8,2,10,13,18,11,4,8};
    int[] classabsenteeismt= {6,4,8,5,14,12,17,14,5,6,11,15,13,7,11};

    public String[] getClassnames() {

        String [] classnames= new String[15];
        classnames[1]="ERÞEN PAMUK";
        classnames[2]="RANA GÜLER";
        classnames[3]="BERK ÖZÜM KAYA";
        classnames[4]="HAKAN TURÝNAY";
        classnames[5]="ZUHAL ASLANCAN";
        classnames[6]="UMUTCAN HAZIR";
        classnames[7]="UTKU DURMUS";
        classnames[8]="ÖZGÜR BULUT";
        classnames[9]="EREL ÖZTÜRK";
        classnames[10]="ALÝ GÝLÝM";
        classnames[11]="GÝZAY EROÐLU";
        classnames[12]="SILA TEKCAN";
        classnames[13]="ARDA GÜNAY";
        classnames[14]="KUTAY KOYLAN";

        return classnames;
    }
    
    public void displayNotesL1(int[]classnotes) {

        System.out.println("These are the notes of SE116:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"NOTES");

        for(int i=1;i<getClassnames().length;i++) {

            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> " +classnotes[i]);

        }
    }

    public void displayNotesL1() {

        int[] classnotes= {0,82,81,37,56,24,62,81,51,42,34,10,64,100,99};

        System.out.println("These are the notes of SE116:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"NOTES");

        for(int i=1;i<getClassnames().length;i++) {

            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> " +classnotes[i]);

        }
    }

    public void displayabsL1() {

        System.out.println("These are the absenteeisms of SE116:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"ABSENTEEÝSM.");
        for(int i=1;i<getClassnames().length;i++) {
            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> "+classabsenteeismc[i]);

        }
    }
    public void displayabsL1(int[]classabsenteeism) {

        System.out.println("These are the absenteeisms of SE116:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"ABSENTEEÝSM.");
        for(int i=1;i<getClassnames().length;i++) {
            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> "+classabsenteeism[i]);

        }
    }

    public void displayabsL2(int[]classabsenteeism2){

        System.out.println("These are the absenteeisms of MATH154:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"ABSENTEEÝSM.");

        for(int i=1;i<getClassnames().length;i++) {

            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> " +classabsenteeism2[i]);

        }
    }
    public void displayabsL2(){

        System.out.println("These are the absenteeisms of MATH154:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"ABSENTEEÝSM.");

        for(int i=1;i<getClassnames().length;i++) {

            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> " +classabsenteeismt[i]);

        }
    }

    public void displayNotesL2() {

        int[] classnotes= {0,88,89,39,48,52,30,9,41,52,74,43,49,88,100};

        System.out.println("These are the notes of MATH154:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"NOTES.");

        for(int i=1;i<getClassnames().length;i++) {

            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> " +classnotes[i]);

        }
    }
    public void displayNotesL2(int[] classnotes2) {

        int[] classnotes= {0,88,89,39,48,52,30,9,41,52,74,43,49,88,100};

        System.out.println("These are the notes of MATH154:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX"+"\t"+"Students"+"\t"+"NOTES.");

        for(int i=1;i<getClassnames().length;i++) {

            System.out.println(i+"\t"+getClassnames()[i]+"\t" +"=============> " +classnotes2[i]);

        }
    }
}

