package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    /*
    * Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"*/
    public void calculateSalary(int salary) {
            if(salary <= 0)
                System.out.println("wrong input!");
            else if(salary <= 10000)
                System.out.println(resSalary(salary, 15));
            else if(salary <= 20000)
                System.out.println(resSalary(salary, 18));
            else
                System.out.println(resSalary(salary, 20));

    }

    private double resSalary(int salary, int percent) {
        double n_percent = (double)(salary / 100) * percent;
        return salary - n_percent;
    }

}
