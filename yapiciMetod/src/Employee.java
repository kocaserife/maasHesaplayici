public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxResult = 0.0;
        if (this.salary >= 1000) {
            taxResult = this.salary * 0.03;
        }
        return taxResult;
    }

    public double bonus(){
        double moreHours = 0.0;
        if(this.workHours > 40){
            moreHours = this.workHours - 40;
        }
        return moreHours *= 30;
    }

    public double raiseSalary(){
        int currentYear = 2022;
        double raise = 0.0;
        int calculatedYear = currentYear - this.hireYear;
        if(this.hireYear < 10 && this.hireYear >= 0){
            raise = this.salary * 0.05;
        }else if(this.hireYear >= 10 && this.hireYear < 20) {
            raise = this.salary * 0.10;
        }else {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    public void toStringEmplooye(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary  - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()) );


    }

}