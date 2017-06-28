package BonusWork.PersonClasses;

/**
 * Created by Aaron on 6/28/2017.
 */
public class Staff extends Person{
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString(){
        return "name = " + super.getName() + "\naddress = " + super.getAddress() + "school = " + school + "\npay = " + pay;
    }
}
