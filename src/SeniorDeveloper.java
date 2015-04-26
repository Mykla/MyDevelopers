/**
 * Created by user on 24.04.2015.
 */
public class SeniorDeveloper extends MyDevelopers {
    public SeniorDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary * 2 + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }

}
