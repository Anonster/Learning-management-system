
public class School{
    
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    // empty constructor
    public School() {
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    // getters
    public int getTotalMoneyEarned() {
        return totalMoneyEarned ;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent ;
    }

    /*
     * Adds the total money earned by the school.
     *  MoneyEarned is the money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /*
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     *  moneySpent is the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
       totalMoneyEarned -= moneySpent;
    }

     

}