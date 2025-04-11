package javabook.volumeone.demos;
public class PrivateAccessDemo {
    public static void main(String[] args)
    {
        Employee johnny = new Employee("Johnny");
        Employee cindy = new Employee("Cindy");
        
        if (johnny.equals(cindy)) {
            System.out.println("Same employee!");
        } else {
            System.out.println("They are not the same employee!");
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Employee other) {
        return name.equals(other.name); }  // equals method accesses private attribute name of other.
    
}