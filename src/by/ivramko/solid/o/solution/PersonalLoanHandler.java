package by.ivramko.solid.o.solution;

public class PersonalLoanHandler implements LoanHandler{

    private Validator validator;

    public  PersonalLoanHandler(Validator validator){
        this.validator=validator;
    }

    @Override
    public void approveLoan(User user) {
        if(validator.isValidUserForLoan(user)){

        }
    }
}
