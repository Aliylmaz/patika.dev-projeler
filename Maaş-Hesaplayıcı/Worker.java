public class Worker {


    String name;
    int salary;
    int workHours;
    int hireYear;


    Worker(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            double tax = salary * 0.03;
            return tax;
        }
    }

    double bonus() {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;

    }

    double raiseSalary() {
        if (hireYear < 0 || hireYear > 2021) {
            System.out.println("Geçersiz bir tarih girdiniz !");


        } else {
            int farkYil = 2021 - hireYear;
            double zam;

            if (farkYil > 0 && farkYil < 10) {
                zam = salary * 0.05;
                return zam;
            } else if (farkYil > 9 && farkYil < 20) {
                zam = salary * 0.1;
                return zam;

            } else if (farkYil > 19) {
                zam = salary * 0.15;
                return zam;

            } else if (farkYil == 0) {
                return 0;

            }

        }
        return 0;

    }

    String toStr() {
        double total = salary - tax() + bonus() + raiseSalary();
        double tot = salary - tax() + bonus();
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + workHours);
        System.out.println("İşe giriş tarihi :" + hireYear);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Maaş artışı :" + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + tot);
        System.out.println("Toplam maaş :" + total);

        return null;
    }


