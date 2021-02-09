package by.ivramko.solid.s.solution;

public class SingleResponsibilityDemo {

    public static void main(String[] args) {
        MailboxSettingsService mailboxSettingsService = new MailboxSettingsService();
        User user = new User();

        //responsibility #1 of the MilboxSettingsService - change settings in mailbox
        mailboxSettingsService.changeSecondaryEmail(user, "mewEmail@mail.com");

        // responsibility #2 of the MilboxSettingsService - verify access

    }
}
