package BonusWork.PersonClasses;


public class Student extends Person{
    String program;
    int year;
    double fee;

    public Student(String name, String address, int year, String program, double fee) {
        super(name, address);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString(){
        return "name = " + super.getName() + "\naddress = " + super.getAddress() + "\nprogram = " + program + "\nyear = " + year + "\nfee = " + fee;
    }

}
