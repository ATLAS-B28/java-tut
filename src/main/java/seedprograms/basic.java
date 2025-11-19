package seedprograms;

public class basic {
    public static void main(String[] args) {
        /*System.out.println("Hello World!!!!");
        //exercise data types
        Student s1 = new Student();
        s1.initStudent(1,"Abhijeet",20,90,'m',true,200,130);
        s1.displayStudent();
        Student s2 = new Student();
        s2.initStudent(2,"Aditya",20,80,'m',true,200,130);
        s2.displayStudent();

        add a = new add();
        a.addNum(10,20);
        sub s = new sub();
        s.subNum(10,20);
        multiply m = new multiply();
        m.multiplyNum(10,20);
        divide d = new divide();
        d.divideNum(10,20);
        Calcy cal = new Calcy();
        cal.setA(10);
        cal.setB(5);
        cal.getA();
        cal.getB();
        cal.addNum();
        cal.sub();
        cal.multiply();
        cal.divide();
        cal.divide();

        MyDate da = new MyDate();
        da.setMonth(8);
        da.setDay(28);
        da.setYear(2002);
        da.getMonth();
        da.getDay();
        da.getYear();
        da.displayDate();*/

        /*Account acc = new Account();
        acc.setAccNo(133344);
        acc.setBalance(456677.543);
        acc.setOwnerName("Aditya Bhambere");
        acc.getAccNo();
        acc.getBalance();
        acc.getOwnerName();
        acc.displayAccDets();*/

        /*Chair chair = new Chair();
        chair.setModel_no(12345);
        chair.setBrand("BPI");
        chair.setPrice(123456.789);
        chair.setModel("Floral");
        chair.setType("Arm Chair");
        chair.setNoOfLegs(4);
        chair.getModel_no();
        chair.getBrand();
        chair.getPrice();
        chair.getModel();
        chair.getType();
        chair.getNoOfLegs();
        chair.displayChairDets();*/

        /*MobileDevice mobileDevice = new MobileDevice();
        mobileDevice.setModel_no(1233411);
        mobileDevice.setBrandName("BITS");
        mobileDevice.setModelName("Neo69");
        mobileDevice.setPrice(90212232.22);
        mobileDevice.setColor("Blue");
        mobileDevice.setStorageCapacity(128);
        mobileDevice.setRamCapacity(8);
        mobileDevice.setWaterResistant(true);
        mobileDevice.displayMobileDets();*/

        Customer customer = new Customer();
        customer.setAccNo(123456);
        customer.setCustomerName("Aditya");
        customer.setCustomerAddress("Pune");
        customer.setBalance(123456.789);
        customer.getAccNo();
        customer.getCustomerName();
        customer.getCustomerAddress();
        customer.getBalance();
        customer.displayCustomerDets();
    }
}

/*class Student {
    int rollNo;
    String name;
    int age;
    float percentile;
    char gender;
    boolean isRegular;
    int noOfAttended;
    int noOfAbsent;
    int totalDays = 330;

    public void initStudent(int rollNo, String name,
    int age,float percentile,char gender,boolean isRegular,int noOfAttended,int noOfAbsent) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.percentile = percentile;
        this.gender = gender;
        this.isRegular = isRegular;
        this.noOfAttended = noOfAttended;
        this.noOfAbsent = noOfAbsent;
    }

    public boolean isEligibleToPass(float percentile, boolean isRegular) {
        if(percentile <= 60 && percentile >= 40 && isRegular) {
            return true;
        } else if(percentile >= 60 && isRegular) {
            return true;
        } else {
            return false;
        }
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentile: " + percentile);
        System.out.println("Gender: " + gender);
        System.out.println("Is Regular: " + isRegular);
        System.out.println("No of Attended: " + noOfAttended);
        System.out.println("No of Absent: " + noOfAbsent);
        System.out.println("Attendance: " + (noOfAttended/(float)totalDays)*100);
        System.out.println("Eligible to pass: " + isEligibleToPass(percentile,isRegular));
    }

}

class add {

    public void addNum(int a, int b) {
        System.out.println("Sum: " + (a+b));
    }
}

class sub {
    public void subNum(int a, int b) {
        System.out.println("Difference: " + (a-b));
    }
}

class multiply {
    public void multiplyNum(int a, int b) {
        System.out.println("Product: " + (a*b));
    }
}

class divide {
    public void divideNum(int a, int b) {
        System.out.println("Quotient: " + (a/b));
    }
}*/

/*class Calcy {
    private int a, b;
    //non param constructor
    Calcy() {}
    //getter aka accessor and setter aka mutator
    public void getA() {
        System.out.println(a);
    }
    public void getB() {
        System.out.println(b);
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
     param constructor
    Calcy(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void addNum() {
        System.out.println("Sum: " + (a+b));
    }
    public void sub() {
        System.out.println("Difference: " + (a-b));
    }
    public void multiply() {
        System.out.println("Product: " + (a*b));
    }
    public void divide() {
        System.out.println("Quotient: " + (a/b));
        System.out.println("Remainder: " + (a%b));
    }
}

class MyDate {
    private int month, day, year;
    MyDate() {}
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void getMonth() {
        System.out.println(month);
    }
    public void getDay() {
        System.out.println(day);
    }
    public void getYear() {
        System.out.println(year);
    }
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}*/

/*class Account {

    private int accNo;
    private double balance;
    private String ownerName;
    Account() {}
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void getAccNo() {
        System.out.println(accNo);
    }
    public void getBalance() {
        System.out.println(balance);
    }
    public void getOwnerName() {
        System.out.println(ownerName);
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void displayAccDets() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Owner Name: " + ownerName);
    }
}
*/

/*class Chair {
    int model_no;
    String brand;
    double price;
    String model;
    String type;
    int noOfLegs;

    Chair() {}

    public void setModel_no(int model_no) {
        this.model_no = model_no;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    public void getModel_no() {
        System.out.println(model_no);
    }
    public void getBrand() {
        System.out.println(brand);
    }
    public void getPrice() {
        System.out.println(price);
    }
    public void getModel() {
        System.out.println(model);
    }
    public void getType() {
        System.out.println(type);
    }
    public void getNoOfLegs() {
        System.out.println(noOfLegs);
    }
    public void displayChairDets() {
        System.out.println("Model No: " + model_no);
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rs." + price);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("No of Legs: " + noOfLegs);
    }

}*/

/*class MobileDevice {
    int model_no;
    String brandName;
    String modelName;
    double price;
    String color;
    int storageCapacity;
    int ramCapacity;
    boolean isWaterResistant;

    MobileDevice() {}

    public void setModel_no(int model_no) {
        this.model_no = model_no;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
    public void setWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }

    public int getModel_no() {
        return model_no;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public String getColor() {
        return color;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void displayMobileDets() {
        System.out.println("Model No: " + model_no);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Price: Rs." + price);
        System.out.println("Color: " + color);
        System.out.println("Storage Capacity: " + storageCapacity);
        System.out.println("RAM Capacity: " + ramCapacity);
        System.out.println("Is Water Resistant: " + isWaterResistant);
    }
}*/

class Customer {
    int accNo;
    String customerName;
    String customerAddress;
    double balance;
    Customer() {}
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void getAccNo() {
        System.out.println(accNo);
    }
    public void getCustomerName() {
        System.out.println(customerName);
    }
    public void getCustomerAddress() {
        System.out.println(customerAddress);
    }
    public void getBalance() {
        System.out.println(balance);
    }
    public void displayCustomerDets() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Balance: Rs." + balance);
    }
}