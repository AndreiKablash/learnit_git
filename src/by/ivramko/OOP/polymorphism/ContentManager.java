package by.ivramko.OOP.polymorphism;

public class ContentManager extends User {

    public String name = "ContentManager";


    @Override
    public void validateAccessRights() {
        System.out.println("I'm a content manager. I have no enough rights to withdraw money.");
    }

    @Override
    public ProfileInformationData getProfileInformtaion(Profile profile) {
        return new AccountInformation();
    }


}
