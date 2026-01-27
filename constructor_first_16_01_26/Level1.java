package constructor_first_16_01_26;

import java.util.ArrayList;

public class Level1 {

    static void main(String[] args) {

       ArrayList<Employees> emplist = new ArrayList<>();

       emplist.add(new Employees("Ak",1,35000));
       emplist.add(new Employees("Aksh",2,40000));
       emplist.add(new Employees("Akshant",3,50000));

       for(Employees emp:emplist){
           emp.displayDetails();
           System.out.println("------------");
       }
    }
}


class Employees{

    private String name;
    private int id;
    private float salary;

    Employees(String name,int id,float salary){

        this.name=name;
        this.id= id;
        this.salary=salary;
    }

    void displayDetails(){

        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}
