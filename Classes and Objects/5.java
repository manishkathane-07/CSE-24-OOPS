/*
Define a class employee with the following specification:
1. Members are: empno of type integer, ename of type String, basic, hr and da
are of type float, netpay of type float.
2. Member functions:
3. Calculate() : A function to find basix+hra+da with the float return type.
4. havedata(): function to accept values for empno, ename, basic, hra, da and
invoke calculate() to calculate netpay.
5. dispdata(): function to display all the data members.
*/

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        empno = 1;
        ename = "Raj";
        basic = 10000;
        hra = 2000;
        da = 1000;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}