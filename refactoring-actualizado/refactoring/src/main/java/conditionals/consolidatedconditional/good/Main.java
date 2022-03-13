package conditionals.consolidatedconditional.good;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
	
    private double extraSalary;
    private static int seniority;
    private static int education;
    private static int incidents;
    private static boolean certification;

    static double calculateExtraSalary(){
        double result = 500;
        if (!isEligibleExtraSalary())
            return 0;

        return result;
    }
    private static boolean isEligibleExtraSalary(){
        boolean category = seniority < 1 || education < 1;
        boolean experience = incidents > 10 || !certification;
        return category || experience;
    }

    public static void main(String[] args) {
        String pattern = "dd/MM/YYYY";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate initDate = LocalDate.of(2022, 1, 1);
        String formattedNow = initDate.format(formatter);

        Employee Empleado1 = new Employee("Andres", 1000.0, 1, 1, 10, true, formattedNow);
        System.out.println(Empleado1);
        if(calculateExtraSalary()>0)
            System.out.println("Salario Extra: " + calculateExtraSalary() + " Empleado: " + Empleado1.name());
    }

}
record Employee(String name, double extraSalary, int seniority, int education, int incidents, boolean certification, String initDate) {
    static final Integer LIFESPAN = 100;

    Employee(String name, double extraSalary, int seniority, int education, int incidents, boolean certification, String initDate) {
        this.name = name;
        this.extraSalary = extraSalary;
        this.seniority = seniority;
        this.education = education;
        this.incidents = incidents;
        this.certification = certification;
        this.initDate = initDate;
    }
}
