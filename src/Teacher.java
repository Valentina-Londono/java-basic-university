public abstract class Teacher {
    public String name;
    private double baseSalary;

    public Teacher(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void fullPrint(){
        System.out.println("Name: " + getName() + "\n" + "   Salary: " + calculateSalary());
    }

    public void print(){
        System.out.println("Name: " + getName());
    }
}
