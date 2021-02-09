package by.ivramko.solid.s.problem;

public class SingleResponsibilityDemo {

    public static void main(String[] args) {
        MailboxSettingsService mailboxSettingsService = new MailboxSettingsService();
        User user = new User();

        //responsibility #1 of the MilboxSettingsService - change settings in mailbox
        mailboxSettingsService.changeSecondaryEmail(user, "mewEmail@mail.com");

        // responsibility #2 of the MilboxSettingsService - verify access
        if (mailboxSettingsService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }
}
