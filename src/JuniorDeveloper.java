/**
 * Created by user on 24.04.2015.
 */
public class JuniorDeveloper extends MyDevelopers {
    public JuniorDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary + experience > 0 ? basicSalary * experience * 0.1 : 0;
    }
}
