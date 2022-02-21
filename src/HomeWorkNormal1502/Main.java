package HomeWorkNormal1502;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee();
        employeeOne.LFP ="Иванов Иван Иванович";
        employeeOne.post = "Инженер";
        employeeOne.email = "ivan@jmail.com";
        employeeOne.telephone = "89213341248";
        employeeOne.salary = 85000;
        employeeOne.age = 44;

        Employee employeeTwo = new Employee();
        employeeTwo.LFP = "Петров Петр Петрович";
        employeeTwo.post = "Электрик";
        employeeTwo.email = "petya@jmail.com";
        employeeTwo.telephone = "89211481965";
        employeeTwo.salary = 55000;
        employeeTwo.age = 56;

        Employee employeeThree = new Employee();
        employeeThree.LFP = "Семенов Семен Семенович";
        employeeThree.post = "Сварщик";
        employeeThree.email = "svarka@jmail.com";
        employeeThree.telephone = "89119277165";
        employeeThree.salary = 49000;
        employeeThree.age = 32;

        Employee [] array = new Employee[3];
        array[0] = employeeOne;
        array[1] = employeeTwo;
        array[2] = employeeThree;

        for (int i = 0; i < array.length; i++) {
            if (array[i].age >= 40)
                array[i].info();



        }
    }
}
