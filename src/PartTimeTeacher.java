public class PartTimeTeacher extends Teacher {
    public double activeHours;

    public PartTimeTeacher(String name, double baseSalary, double activeHours) {
        super(name, baseSalary);
        this.activeHours = activeHours;
    }

    public double getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(double activeHours) {
        this.activeHours = activeHours;
    }

    public double calculateSalary(){
        return (getBaseSalary() * getActiveHours());
    }
}
