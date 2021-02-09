package by.ivramko.solid.o.problem;

public class LoanHandler {

        private PersonalLoanValidator personalLoanValidator;
        private MortgageLoanValidator mortgageLoanValidator;

    public void approvePersonalLoan(User user) {
        if (personalLoanValidator.isValidUserForPersonalLoan(user)) {
            // proceed with personal loan approval
        }
    }

    public void approveMortgage(User user) {
        if (mortgageLoanValidator.isValidUserForMortgage(user)) {
            // proceed with personal loan approval
        }
    }
}
