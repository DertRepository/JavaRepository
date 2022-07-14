package Demo;

public class AssignObj {
    private double val1, val2;

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public AssignObj() {
    }

    public double getVal1() {
        return val1;
    }

    public double getVal2() {
        return val2;
    }

    public AssignObj(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public boolean equalTo(AssignObj obj) {
        if (obj.val1 == val1 && obj.val2 == val2) {
            return true;
        } else {
            return false;
        }
    }

    public void showCommandAgs(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Args[" + i + "] :" + args[i]);
        }
    }
}
