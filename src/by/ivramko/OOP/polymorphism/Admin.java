package by.ivramko.OOP.polymorphism;

public class Admin extends User {
    public String name = "admin";
    private final String userGroup = "admin";

    @Override
    public void validateAccessRights() {
        System.out.println("I'm an admin user. I can do whatever I want in the system.");
    }

    @Override
    public AccountInformation getProfileInformtaion(Profile profile) {
	//	userGroup = "default";
	//	profile = new UserProfile();
        return new AccountInformation();
    }

}
