package RIS;

import java.util.*;

public class Teacher extends Student {

    Scanner input = new Scanner(System.in);

    public Teacher() {
    	
        super();
        int[] classnotes = {0, 82, 81, 37, 56, 24, 62, 81, 51, 42, 34, 10, 64, 100, 99};
        int[] classnotes2 = {0, 88, 89, 39, 48, 52, 30, 9, 41, 52, 74, 43, 49, 88, 100};
        int[] classabsenteeism = {4, 6, 2, 7, 19, 16, 19, 8, 2, 10, 13, 18, 11, 4, 8};
        int[] classabsenteeism2 = {6, 4, 8, 5, 14, 12, 17, 14, 5, 6, 11, 15, 13, 7, 11};
        setClassnotes(classnotes);
        setClassnotes2(classnotes2);
        setClassabsenteeism(classabsenteeism);
        setClassabsenteeism2(classabsenteeism2);
    }
    
    int[] classnotes;
    int[] classnotes2;
    int[] classabsenteeism;
    int[] classabsenteeism2;

    public void setClassabsenteeism(int[] classabsenteeism) {
        this.classabsenteeism = classabsenteeism;
    }

    public void setClassabsenteeism2(int[] classabsenteeism2) {
        this.classabsenteeism2 = classabsenteeism2;
    }

    public void setClassnotes(int[] classnotes) {
        this.classnotes = classnotes;
    }

    public void setClassnotes2(int[] classnotes2) {
        this.classnotes2 = classnotes2;
    }

    public int[] getClassnotes() {
        return classnotes;
    }

    public int[] getClassabsenteeism() {
        return classabsenteeism;
    }

    public int[] getClassabsenteeism2() {
        return classabsenteeism2;
    }

    public int[] getClassnotes2() {
        return classnotes2;
    }

    @Override
    public String[] getClassnames() {
        return super.getClassnames();
    }

    public void editNotes(int lecturecode) {

        switch (lecturecode) {

            case 116:
                int y;
                int note;

                System.out.println("INDEX" + "\t" + "Students" + "\t" + "NOTES");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

                for (int i = 1; i < getClassnames().length; i++) {

                    System.out.println(i + "\t" + getClassnames()[i] + "\t" + "=============> " + getClassnotes()[i]);
                }

                System.out.println("Which student do you want to edit?(Please write their index.)");
                y = input.nextInt();

                if (y <= 14) {

                    System.out.println("Please enter a note for this student.");
                    note = input.nextInt();
                    getClassnotes()[y] = note;
                    setClassnotes(getClassnotes());
                    System.out.println("Changed like this.");
                    System.out.println(y + "\t" + getClassnames()[y] + "\t" + getClassnotes()[y]);
                } 
                
                else {
                	
                    System.out.println("You entered wrong index.");
                    System.out.println("Redirecting...");
                }

                break;

            case 154:

                int c;
                int notes;

                System.out.println("INDEX" + "\t" + "Students" + "\t" + "NOTES.");

                for (int i = 1; i < getClassnames().length; i++) {

                    System.out.println(i + "\t" + getClassnames()[i] + "\t" + "=============> " + getClassnotes2()[i]);
                }

                System.out.println("Which student do you want to edit?(Please write their index.)");
                c = input.nextInt();

                if (c <= 14) {

                    System.out.println("Please enter a note for this student.");
                    notes = input.nextInt();
                    getClassnotes2()[c] = notes;
                    System.out.println("Changed like this.");
                    System.out.println(c + "\t" + getClassnames()[c] + "\t" + getClassnotes2()[c]);
                } 
                
                else {
                	
                    System.out.println("You entered wrong index.");
                    System.out.println("Redirecting...");
                }
                setClassnotes2(getClassnotes2());
        }
    }

    @Override
    public void displayNotesL1() {
        super.displayNotesL1(getClassnotes());
    }

    @Override
    public void displayNotesL2() {
        super.displayNotesL2(getClassnotes2());
    }

    @Override
    public void displayabsL1() {
        super.displayabsL1(getClassabsenteeism());
    }

    @Override
    public void displayabsL2() {
        super.displayabsL2(getClassabsenteeism2());
    }

    public void editAbsenteeisms(int lecturecode) {

        switch (lecturecode) {

            case 116:
                int t;
                int abs;

                System.out.println("These are absenteeism of SE116 class section:");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("INDEX" + "\t" + "Students" + "\t" + "ABSENTEEÝSMS");

                for (int i = 1; i < getClassnames().length; i++) {

                    System.out.println(i + "\t" + getClassnames()[i] + "\t" + "=============> " + getClassabsenteeism()[i]);
                }
                System.out.println("Which student do you want to edit?(please write their index.)");
                t = input.nextInt();

                if (t <= 14) {

                    System.out.println("Please enter a new abseentism value for this student.");
                    abs = input.nextInt();
                    classabsenteeism[t] = abs;
                    System.out.println("Changed like this.");
                    System.out.println(t + "\t" + getClassnames()[t] + "\t" + getClassabsenteeism()[t]);
                } else {

                    System.out.println("You entered wrong index.");
                    System.out.println("Redirecting...");

                }
                setClassabsenteeism(getClassabsenteeism());

                break;

            case 154:
                int k;
                int abs2;


                System.out.println("These are absenteeism of SE116 class section:");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("INDEX" + "\t" + "Students" + "\t" + "ABSENTEEÝSMS.");

                for (int i = 1; i < getClassnames().length; i++) {
                    System.out.println(i + "\t" + getClassnames()[i] + "\t" + "=============> " + getClassabsenteeism2()[i]);
                }

                System.out.println("Which student do you want to edit?(please write their index.)");
                k = input.nextInt();

                if (k <= 14) {

                    System.out.println("Please enter a new abseentism value for this student.");
                    abs2 = input.nextInt();
                    getClassabsenteeism2()[k] = abs2;
                    System.out.println("Changed like this.");
                    System.out.println(k + "\t" + getClassnames()[k] + "\t" + getClassabsenteeism2()[k]);
                } 
                else {
                	
                    System.out.println("You entered wrong index.");
                    System.out.println("Redirecting...");
                }
                setClassabsenteeism2(getClassabsenteeism2());
        }
    }

    public void findmin(int lecturecode) {
        if (lecturecode == 116) {
            int i, min;
            min = getClassnotes()[0];
            for (i = 1; i < 15; i++) {
                if (getClassnotes()[i] < min) {
                    min = getClassnotes()[i];
                }
            }
            System.out.println("The minimum note is " + min);
        }
        
        if (lecturecode==154){
            int i, min;
            min = getClassnotes2()[0];
            for (i = 1; i < 15; i++) {
                if (getClassnotes2()[i] < min) {
                    min = getClassnotes2()[i];
                }
            }
            System.out.println("The minimum note is " + min);

        }
    }

    public void findmax(int lecturecode) {
        if (lecturecode == 116) {
            int i, max;
            max = getClassnotes()[0];
            for (i = 1; i < 15; i++) {
                if (getClassnotes()[i] > max) {
                    max = getClassnotes()[i];
                }
            }
            System.out.println("The maximum note is " + max);
        }
        
        if (lecturecode==154){
            int i, max;
            max = getClassnotes2()[0];
            for (i = 1; i < 15; i++) {
                if (getClassnotes2()[i] > max) {
                    max = getClassnotes2()[i];
                }
            }
            System.out.println("The maximum note is " + max);
        }
    }

    public void findavg(int lecturecode) {
    	
        if (lecturecode == 116) {

            int i;
            double sum = 0;
            for (i = 1; i < 15; i++) {
                sum = getClassnotes()[i] + sum;
            }

            double avg = sum / 15.0;
            System.out.println("The average of these notes is " + avg);
        }

        if (lecturecode == 154) {

            int i;
            double sum = 0;
            for (i = 1; i < 15; i++) {
                sum = getClassnotes2()[i] + sum;
            }

            double avg = sum / 15.0;
            System.out.println("The average of these notes is " + avg);
        }
    }

    public void passCounter(int lecturecode) {
                if (lecturecode == 116) {
                    int i;
                    int passcounter = 0;
                    for (i = 1; i < 15; i++) {
                        if (getClassnotes()[i] > 60) {
                            passcounter++;
                        }
                    }
                    System.out.println("There is/are " + passcounter + " successfull student(s).");
                }

        if (lecturecode == 154) {
            int i;
            int passcounter = 0;
            for (i = 1; i < 15; i++) {
                if (getClassnotes2()[i] > 60) {
                    passcounter++;
                }
            }
            System.out.println("There is/are " + passcounter + " successfull student(s).");
        }
    }
}
