import java.util.ArrayList;

/**
 * Created by user on 26.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        MyDevelopers[] list = {
                new LeadOfTeamDeveloper("Max",2000,9),
                new JuniorDeveloper("Petia",500,0),
                new SeniorDeveloper("Misha",1600,5),
                new SeniorDeveloper("Sergey",1500,2),
                new SeniorDeveloper("Alex",1200,4),
                new SeniorDeveloper("Igor",1400,4),
                new SeniorDeveloper("Anton",1500,4),
                new JuniorDeveloper("Fedor",500,0),
                new SeniorDeveloper("Timur",1700,2),
                new LeadOfTeamDeveloper("Ivan",2000,9),
                new JuniorDeveloper("Tikhon",500,0),
                new SeniorDeveloper("Nikolay",1500,5),
                new LeadOfTeamDeveloper("Dmitro",2000,10),
                new JuniorDeveloper("Vasil",500,1),
                new SeniorDeveloper("Evgen",1800,4),
                new LeadOfTeamDeveloper("Kiril",2000,7),
                new SeniorDeveloper("Vitalii",1200,3)
        };

        for (MyDevelopers d:list){
            if ((d instanceof SeniorDeveloper)&(d.getBasicSalary()>=1500)){
                System.out.printf("%12s %10s %10s", d.getName(),d.getBasicSalary(),d.getSalary());
                System.out.println();
            }
        }

        // Разделение Developers на 3 списка JuniorDeveloper, SeniorDeveloper, LeadOfTeamDeveloper
        ArrayList<MyDevelopers> junior = new ArrayList();
        ArrayList<MyDevelopers> senior = new ArrayList();
        ArrayList<MyDevelopers> lead = new ArrayList();

        for (MyDevelopers d:list){
            if (d instanceof JuniorDeveloper){
                junior.add(d);
            } else{
                if (d instanceof SeniorDeveloper){
                    senior.add(d);
                } else {
                    lead.add(d);
                }
            }
        }

        System.out.println();
        System.out.println("Junior Developer:");
        System.out.printf("%12s %15s %15s %10s", "Name", "Basic Salary", "Experience", "Salary");
        System.out.println();

        for (MyDevelopers d:junior){
            System.out.printf("%12s %15s %15s %10s", d.getName(),d.getBasicSalary(),d.getExperience(),d.getSalary());
            System.out.println();
        }

        System.out.println();
        System.out.println("Senior Developer:");
        System.out.printf("%12s %15s %15s %10s", "Name", "Basic Salary", "Experience", "Salary");
        System.out.println();

        for (MyDevelopers d:senior){
            System.out.printf("%12s %15s %15s %10s", d.getName(),d.getBasicSalary(),d.getExperience(),d.getSalary());
            System.out.println();
        }

        System.out.println();
        System.out.println("Team Lead:");
        System.out.printf("%12s %15s %15s %10s", "Name", "Basic Salary", "Experience", "Salary");
        System.out.println();

        for (MyDevelopers d:lead){
            System.out.printf("%12s %15s %15s %10s", d.getName(),d.getBasicSalary(),d.getExperience(),d.getSalary());
            System.out.println();
        }
    }

}
