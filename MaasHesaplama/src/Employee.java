public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    double tax;
    double raiseSalary;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    void tax() {
        this.tax = tax;
        if (0 < salary && salary < 1000) {
            this.tax = this.salary*0;
        } else {
            this.tax += ((this.salary * 3) / 100);
        }
    }

    void bonus() {
        this.bonus = bonus;
        if (this.workHours > 40) {
            bonus = (workHours - 40) * 30;

        } else {
            this.bonus = 0;
        }
    }

     void raiseSalary() {
        int currentYear = 2021;
        if ( currentYear-hireYear < 10) {
            this.raiseSalary += ((salary * 5) / 100);
        } else if ((9 <  currentYear-hireYear) && ( currentYear-hireYear < 20)) {
            raiseSalary += ((salary * 10) / 100);
        }
        if (19 <  currentYear-hireYear) {
            this.raiseSalary += ((salary * 15) / 100);

        }
    }

    public void print() {
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maas Artisi : " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte Maas : " + (this.salary+this.bonus-this.tax));
        System.out.println("Toplam Maaş: " + (this.salary+this.bonus+this.raiseSalary-this.tax));
    }
}
