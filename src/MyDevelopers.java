/**
 * Created by user on 24.04.2015.
 */
public abstract class MyDevelopers {
    protected String name;
    protected double basicSalary;
    protected int experience;

    public MyDevelopers(String name, double basicSalary, int experience) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();

    public int getExperience() {
        return experience;
    }
}
