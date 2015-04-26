/**
 * Написать своего наследника Developer. Добавить его в
 * существующий проект.
 * Created by user on 24.04.2015.
 */
public class LeadOfTeamDeveloper extends MyDevelopers {

    public LeadOfTeamDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary * 5 + experience > 0 ? basicSalary * experience * 0.2 : 0;
    }
}
