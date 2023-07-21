
public class Student {

    private int rollNo;
    private String sname;
    private String scity;
    private int sage;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sname='" + sname + '\'' +
                ", scity='" + scity + '\'' +
                ", sage=" + sage +
                '}';
    }

    public Student(int rollNo, String sname, String scity, int sage) {
        this.rollNo = rollNo;
        this.sname = sname;
        this.scity = scity;
        this.sage = sage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }
}
