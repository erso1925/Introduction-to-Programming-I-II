/* Author: Erþen Pamuk, Berk Özüm Kaya, Hakan Turinay
 * E.E.P
 */
package RIS;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter=0;
        int lecturecode;
        int choice;
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||WELCOME TO RAGNAROK INFORMATION SYSTEM!|||||||||||||||||||"
                + "\n||||||||||||||||If you are a STUDENT please enter 1 to join!||||||||||||||\n"
                + "|||||||||||||||If you are a TEACHER please enter 2 to join!|||||||||||||||\n" +
                "|||||If you want to join as an ADMINISTRATION please enter 3 to join!|||||");
        choice = input.nextInt();
        int tempID;
        String tempName;
        Student st = new Student();
        Teacher t = new Teacher();
        Administration ad=new Administration();

        switch(choice) {

            default :
                System.out.println("You entered wrong number.\nProcess is terminating itself...");
                break;

            case 1:

                int choice2;
                System.out.println("You are trying to join as a student...");
                System.out.print("Please enter the first 9 digits of your ID: ");
                tempID = input.nextInt();

                if(tempID!=201606010&&tempID!=201606020) { //Acces-control
                    System.out.println("You entered a wrong ID.\nIf you want to join, restart the process!");
                    break;
                }

                System.out.print("Please enter your name: ");
                tempName = input.next();
                st.setID(tempID);
                st.setName(tempName);

                while(true) {

                    System.out.println("What would you like to do " +st.getName() + "?");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("Press 1 to see grades of your class."
                            + "\nPress 2 to see your profile."
                            + "\nPress 3 to see absenteeisms."
                            + "\nPress -1 to exit.");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    choice2 =input.nextInt();

                    switch(choice2) {

                        default :
                            System.out.println("You entered wrong number.\nRedirecting ...");
                            break;

                        case 1:

                            int choice3;
                            System.out.println("Please enter '116' to see notes of SE116.\nPlease enter '154' to see notes of MATH154.");
                            choice3 = input.nextInt();

                            switch(choice3) {

                                default :
                                    System.out.println("You entered wrong number.\nRedirecting ...");
                                    break;

                                case 116:
                                    st.displayNotesL1();
                                    break;

                                case 154:
                                    st.displayNotesL2();
                                    break;

                            }
                            break;

                        case 2:

                            System.out.println("Your name is "+st.getName());
                            System.out.println("Your ID is "+st.getID());

                            if(tempID==201606010) {

                                System.out.println("Your department is Software Engineering.");
                            }

                            else if(tempID==201606020) {
                                System.out.println("Your department is Computer Engineering.");
                            }
                            break;

                        case 3:

                            int choice4;
                            System.out.println("Please enter '116' to see the absenteeisms of SE116."
                                    + "\nPlease enter '154' to see the absenteeisms of MATH154.");
                            choice4 = input.nextInt();

                            switch(choice4) {

                                default :
                                    System.out.println("You entered wrong number.\nRedirecting ...");
                                    break;

                                case 116:

                                    st.displayabsL1();
                                    break;

                                case 154:

                                    st.displayabsL2();
                                    break;

                            }
                            break;

                        case -1:

                            System.out.println("Goodbye " +st.getName() + "!");
                            System.exit(0);
                    }
                }

            case 2:

                int missions;
                System.out.println("You are trying to join as a teacher...");
                System.out.print("Please enter your ID: ");
                tempID = input.nextInt();

                if(tempID!=9991&&tempID!=9992) { //Acces-control

                    System.out.println("You entered a wrong ID\nIf you want to join restart the process!");
                    break;
                }

                System.out.print("Please enter your name: ");
                tempName = input.next();
                st.setID(tempID);
                st.setName(tempName);
                System.out.println("You joined as "+st.getName());
                System.out.println("Your ID is "+st.getID());

                if(tempID==9991) {

                    lecturecode=116;
                    System.out.println("Your lesson is SE116.");

                    while(true) {

                        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                        System.out.println("Please enter 1 to display notes."
                                + "\nPlease enter 2 to display absenteeism of your lecture."
                                + "\nPlease enter 3 to edit notes."
                                + "\nPlease enter 4 to edit absenteeisms of your lecture."
                                + "\nPlease enter 5 to display analytics of notes."
                                + "\nPlease enter -1 to exit.");
                        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                        missions=input.nextInt();

                        switch(missions) {

                            default :
                                System.out.println("You entered wrong number\nRedirecting ...");
                                break;

                            case 1:

                                if(lecturecode==116)
                                    t.displayNotesL1();
                                if(lecturecode==154)
                                    t.displayNotesL2();
                                break;

                            case 2:

                                if(lecturecode==116)
                                    t.displayabsL1();
                                if(lecturecode==154)
                                    t.displayabsL2();
                                break;

                            case 3:

                                t.editNotes(lecturecode);
                                break;

                            case 4:

                                t.editAbsenteeisms(lecturecode);
                                break;

                            case 5:

                                int choice7;
                                System.out.println("-------------------------------------------------------------");
                                System.out.println("Please enter 1 to see the minimum note of your class."
                                        + "\nPlease enter 2 to see the maximum note of your class."
                                        + "\nPlease enter 3 to see the averages of notes of your class."
                                        + "\nPlease enter 4 to see how many students are successfull.");
                                System.out.println("-------------------------------------------------------------");
                                choice7=input.nextInt();
                                switch(choice7) {
                                    default :
                                        System.out.println("You entered wrong number.\nRedirecting ...");
                                        break;

                                    case 1:

                                            t.findmin(lecturecode);
                                        break;

                                    case 2:

                                            t.findmax(lecturecode);
                                        break;

                                    case 3:

                                            t.findavg(lecturecode);
                                        break;

                                    case 4:

                                            t.passCounter(lecturecode);
                                        break;
                                }

                                break;

                            case -1:

                                System.out.println("Goodbye " +st.getName() +" hocam!");
                                System.exit(0);

                        }
                    }
                }

                if(tempID==9992) {

                    lecturecode=154;
                    System.out.println("Your Lesson is MATH154.");

                    while(true) {

                        System.out.println("Please enter 1 to edit notes."
                                + "\nPlease enter 2 to display grades."
                                + "\nPlease enter 3 to display absenteeism of your lecture."
                                + "\nPlease enter 4 to edit absenteeisms of your lecture."
                                + "\nPlease enter 5 to display analytics of notes."
                                + "\nPlease enter -1 to exit.");
                        missions=input.nextInt();
                        
                        switch(missions) {
                            default :
                                System.out.println("You entered wrong number.\nRedirecting ...");
                                break;

                            case 1:
                                t.editNotes(lecturecode);
                                break;

                            case 2:

                                if(lecturecode==116)
                                    t.displayNotesL1();
                                if(lecturecode==154)
                                    t.displayNotesL2();

                                break;

                            case 3:

                                if(lecturecode==116)
                                    t.displayabsL1();
                                if(lecturecode==154)
                                    t.displayabsL2();
                                break;

                            case 4:

                                t.editAbsenteeisms(lecturecode);
                                break;

                            case 5:

                                int choice7;
                                System.out.println("Please enter 1 to see the minimum note of your class."
                                        + "\nPlease enter 2 to see the maximum note of your class."
                                        + "\nPlease enter 3 to see the averages of notes of your class."
                                        + "\nPlease enter 4 to see how many students are successfull.");
                                choice7=input.nextInt();
                                
                                switch(choice7) {

                                    default :
                                        System.out.println("You entered wrong number.\nRedirecting ...");
                                        break;

                                    case 1:

                                            t.findmin(lecturecode);
                                        break;

                                    case 2:

                                            t.findmax(lecturecode);
                                        break;

                                    case 3:


                                            t.findavg(lecturecode);
                                        break;

                                    case 4:


                                            t.passCounter(lecturecode);
                                        break;
                                }

                                break;

                            case -1:
                                System.out.println("Goodbye " +st.getName() +" hocam!");
                                System.exit(0);

                        }
                    }
                }
                
            case 3:

                System.out.println("You are trying to join as an Administration...");
                System.out.print("Please enter your ID: ");
                tempID = input.nextInt();

                if(tempID!=0001) { //Acces-control

                    System.out.println("You entered a wrong ID\nIf you want to join restart the process!");
                    break;
                }
                
                System.out.print("Please enter your name: ");
                tempName = input.next();
                ad.setID(tempID);
                ad.setName(tempName);
                System.out.println("You joined as "+ad.getName());
                
                while(true) {

                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("Please enter 1 to edit notes."
                            + "\nPlease enter 2 to display grades"
                            + ".\nPlease enter 3 to display absenteeism of your lecture."
                            +"\nPlease enter 4 to edit absenteeisms of your lecture."
                            + "\nPlease enter 5 to display analytics of notes."
                            +"\nPlease enter 6 to add GPA point"
                            + "\nPlease enter 7 to see GPA points"
                            + "\nPlease enter 8 to see Course and Exam Programs"
                            +"\nPlease enter 9 to edit Course and Exam Programs"
                            + "\nPlease enter -1 to exit.");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    missions = input.nextInt();
                    
                    switch (missions){
                    
                        default :
                            System.out.println("You entered wrong number.\nRedirecting ...");
                            break;

                        case 1:
                            System.out.println("Which lecture you want to edit notes?(116 for SE116 / 154 for MATH154");
                            lecturecode=input.nextInt();
                            ad.editNotes(lecturecode);
                            break;

                        case 2:
                            System.out.println("Which lecture you want to display grades?(116 for SE116 / 154 for MATH154");
                            lecturecode=input.nextInt();

                            if(lecturecode==116)
                                ad.displayNotesL1();
                            if(lecturecode==154)
                                ad.displayNotesL2();

                            break;

                        case 3:
                            System.out.println("Which lecture you want to display grades?(116 for SE116 / 154 for MATH154");
                            lecturecode=input.nextInt();

                            if(lecturecode==116)
                                ad.displayabsL1();
                            if(lecturecode==154)
                                ad.displayabsL2();
                            break;

                        case 4:
                            System.out.println("Which lecture you want to edit absenteeisms of your lecture?"
                            		+ "(116 for SE116 / 154 for MATH154");
                            lecturecode=input.nextInt();

                            ad.editAbsenteeisms(lecturecode);
                            break;

                        case 5:

                            int choice7;
                            System.out.println("Please enter 1 to see the minimum note of your class."
                                    + "\nPlease enter 2 to see the maximum note of your class."
                                    + "\nPlease enter 3 to see the averages of notes of your class." +
                                    "\nPlease enter 4 to see how many students are successfull.");
                            choice7=input.nextInt();

                            switch(choice7) {

                                default :
                                    System.out.println("You entered wrong number.\nRedirecting ...");
                                    break;

                                case 1:
                                    System.out.println("Which of the lecture you want to see the minimum note of your class?"
                                    		+ "(116 for SE116 / 154 for MATH154");
                                    lecturecode=input.nextInt();
                                        t.findmin(lecturecode);
                                    break;

                                case 2:
                                    System.out.println("Which of the lecture you want to see the maximum note of your class?"
                                    		+ "(116 for SE116 / 154 for MATH154");
                                    lecturecode=input.nextInt();
                                        t.findmax(lecturecode);
                                    break;

                                case 3:
                                    System.out.println("Which of the lecture you want to see the averages of notes of your class?"
                                    		+ "(116 for SE116 / 154 for MATH154");
                                    lecturecode=input.nextInt();
                                        t.findavg(lecturecode);
                                    break;

                                case 4:
                                    System.out.println("Which of the lecture you want to see how many students are successfull?"
                                    		+ "(116 for SE116 / 154 for MATH154");
                                    lecturecode=input.nextInt();
                                        t.passCounter(lecturecode);
                                    break;
                            }

                            break;

                        case 6:
                        	System.out.println("Please enter a value between 0 and 4");
                            System.out.println("Which of the lecture you want to add GPA points?");
                            ad.addgpa();
                            break;

                        case 7:
                            ad.displayNotesgpa();
                            break;

                        case 8:

                            if(counter==0){
                                ad.setDate();
                                ad.setTime2();
                                ad.setLecture();
                                ad.setTime();
                                ad.setMonth();
                                ad.setPlace();
                                counter++;
                            }

                            else ;

                            ad.displaySchedule();
                            break;

                        case 9:
                            ad.editSchedule();
                            break;
                            
                        case -1:

                            System.out.println("Goodbye " +ad.getName() +" hocam!");
                            System.exit(0);

                    }
                }
        }
        input.close();
    }
}
