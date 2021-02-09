package by.ivramko.solid.o.solution;



public class OpenClosedPrincipleDemo {

    public static void main(String[] args) {
        User user = new User();
        LoanHandler loanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
        loanHandler.approveLoan(user);

        System.out.println();
        System.out.println("========================");
        System.out.println();

        LoanHandler loanHandler1 = new MortgageLoanHandler(new MortgageLoanValidator());
        loanHandler1.approveLoan(user);
    }
}
