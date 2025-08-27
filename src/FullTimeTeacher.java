public class FullTimeTeacher extends Teacher {
    public int experienceYears;

    public FullTimeTeacher(String name, double baseSalary, int experienceYears) {
        super(name, baseSalary);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public double calculateSalary(){
        return getBaseSalary() * (getExperienceYears() * 1.10);
    }
}
