/* 
Define a class Resort with the following description:
1. Members are: RNo to store Room Number, Name store customer name,
Charges to store per day charges, Days to store number of days of stay.
2. Member functions:
3. Compute() to calculate and return Amount as Days * Charges and if the
values of Days*Charges is more than 11000 then as 1.02*Days*Charges
4. Getinfo() A function to enter the content Rno, Name, Charges and Days.
5. DispInfo() A function to enter the content Rno, Name, Charges, Days and
Amount by calling function Compute().
*/

class Resort {
    int RNo, Days;
    String Name;
    double Charges;

    double Compute() {
        double amt = Days * Charges;
        if (amt > 11000)
            amt = 1.02 * amt;
        return amt;
    }

    void Getinfo() {
        RNo = 101;
        Name = "Amit";
        Charges = 2000;
        Days = 6;
    }

    void DispInfo() {
        System.out.println("Room: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Amount: " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}