package RIS;

public class Administration extends Teacher implements Faculty {

    double[] gpa = new double[15];
    String[] lecture = new String[3];

    int[] day = new int[3];
    String[] place = new String[3];
    String[] month = new String[3];
    int[] time = new int[3];
    int[] time2 = new int[3];

    public void setDate() {
        day[1] = 23;
        day[2] = 26;
    }

    public void setLecture() {
        lecture[1] = "SE116";
        lecture[2] = "MATH154";
    }

    public void setMonth() {
        month[1] = "May";
        month[2] = "May";

    }

    public void setPlace() {
        place[1] = "M303";
        place[2] = "C501";
    }

    public void setTime() {
        time[1] = 13;
        time[2] = 17;
    }

    public void setTime2() {
        time2[1] = 30;
        time2[2] = 45;
    }

    public Administration() {
        super();
    }

    @Override
    public void setName(String Name) {
        super.setName(Name);
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public int getID() {
        return super.getID();
    }


    @Override
    public String[] getClassnames() {
        return super.getClassnames();
    }

    @Override
    public void displayNotesL1() {
        super.displayNotesL1();
    }

    @Override
    public void displayNotesL2() {
        super.displayNotesL2();
    }

    @Override
    public void displayabsL1() {
        super.displayabsL1();
    }

    @Override
    public void displayabsL2() {
        super.displayabsL2();
    }

    @Override
    public void editNotes( int lecturecode) {
        super.editNotes(lecturecode);
    }

    @Override
    public void editAbsenteeisms( int lecturecode) {
        super.editAbsenteeisms( lecturecode);
    }

    @Override
    public void findmin(int lecturecode) {
        super.findmin(lecturecode);
    }

    @Override
    public void findmax(int lecturecode) {
        super.findmax(lecturecode);
    }

    @Override
    public void findavg(int lecturecode) {
        super.findavg(lecturecode);
    }

    @Override
    public void passCounter(int lecturecode) {
        super.passCounter(lecturecode);

    }

    public void addgpa() {

        double[] semester = new double[15];

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX" + "\t" + "Students" + "\t" + "");

        for (int i = 1; i < getClassnames().length; i++) {
            System.out.println(i + "\t" + getClassnames()[i]);
            System.out.println("Enter the GPA of student");
            double grade = input.nextDouble();
            if (grade < 0) {
                System.out.println("Please enter a value between 0 and 4");
                break;

            }
            else if (grade > 4) {
                System.out.println("Please enter a value between 0 and 4");
                break;
                
            }
            else {
                semester[i] = grade;
            }
            setgpa(semester);
        }     
      }

    public double[] setgpa(double[] x) {
        gpa = x;
        return x;

    }

    public void displayNotesgpa() {

        System.out.println("These are the GPA's of SE116:");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("INDEX" + "\t" + "Students" + "\t" + "GPA");

        for (int i = 1; i < getClassnames().length; i++) {

            System.out.println(i + "\t" + getClassnames()[i] + "\t" + "=============> " + gpa[i]);

        }
    }

    public void displaySchedule() {
        System.out.println("Course and Exam Programs: ");
        System.out.println(lecture[1] + " " + place[1] + " " + day[1] + " " + month[1] + " " + time[1] + ":" + time2[1]);
        System.out.println(lecture[2] + " " + place[2] + " " + day[2] + " " + month[2] + " " + time[2] + ":" + time2[2]);

    }

    public void editSchedule() {
        System.out.println("Which lecture's plan you want to edit (116 for SE116 / 154 for MATH154");
        String lectureName = input.next();
        if (lectureName.equals("116")) {

            System.out.println("Press 1 to edit place\nPress 2 to edit date\nPress 3 to edit time");
            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter the new place");
                    place[1] = input.next();
                    break;

                case 2:
                    System.out.println("Enter the new day");
                    day[1] = input.nextInt();
                    System.out.println("Enter the new month");
                    month[1] = input.next();
                    break;

                case 3:
                    System.out.print("Enter the new time: ");
                    time[1]=input.nextInt();
                    System.out.print(":");
                    time2[1]=input.nextInt();
                    break;

            }
        }
  
        if (lectureName.equals("154")) {

            System.out.println("Press 1 to edit place\nPress 2 to edit date\nPress 3 to edit time");
            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter the new place");
                    place[2] = input.next();
                    break;

                case 2:
                    System.out.println("Enter the new day");
                    day[2] = input.nextInt();
                    System.out.println("Enter the new month");
                    month[2] = input.next();
                    break;

                case 3:
                    System.out.print("Enter the new time: ");
                    time[2]=input.nextInt();
                    System.out.print(":");
                    time2[2]=input.nextInt();
                    break;

            }
        }
    }
}
