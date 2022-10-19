public class Employee {

    double salary;
    String name;
    double workHours; /// in a week hours
    double hireYear;

    Employee(String name,int salary,int workHours,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }




    double tax(){

        if(salary<1000){
            return salary;
        }
        else if(salary>=1000){
            return salary*0.03;
        }
        return 0;
    }

    double bonus(){

        if(workHours>=40){
            return (workHours-40)*30;
        }else
            return 0;
    }

    double raiseSalary(){

        if (2021-hireYear<9){
            return salary*0.05;
        }else if (2021-hireYear>=9 && 2021-hireYear<19 ){
            return salary*0.1;
        }
        else if (2021-hireYear>=19){
            return salary*0.15;
        }
        return 0;
    }

    double tax=tax();
    double bonus=bonus();
    double raise=raiseSalary();
    double salaryWithTaxandBonus = (double)salary + (double)raise + (double)bonus - (double)tax;
    double totalSalary=(double)raise+ (double)salary;


    public String toString(){

        System.out.println("İsim\t\t\t:"+ name);
        System.out.println("Maaş\t\t\t:"+ salary);
        System.out.println("Çalışma saati\t:"+ workHours);
        System.out.println("Başlangıç yılı\t:"+ hireYear);
        System.out.println("Vergi\t\t\t:"+tax());
        System.out.println("Bonus\t\t\t:"+bonus());
        System.out.println("Maaş Artışı\t\t:"+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte toplam maaş\t:"+ (salary-tax()+bonus()));
        System.out.println("Toplam maaş\t\t:"+(raiseSalary()+salary));
        return null;
    }

}
