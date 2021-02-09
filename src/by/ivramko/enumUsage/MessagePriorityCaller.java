package by.ivramko.enumUsage;

import java.util.Scanner;

public class MessagePriorityCaller {

    enum MessageType{
        A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);

        private Priority messagePriority;

        private MessageType(Priority messagePriority){
            this.messagePriority=messagePriority;
        }

        public Priority getPriority() {
            return messagePriority;
        }
    }

    enum Priority {
        HIGH, MEDIUM, LOW;
    }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter message type to check it priority: ");
            String userInput = sc.next();
            if (isValidMessageType(userInput)) {
                System.out.println(MessageType.valueOf(userInput).getPriority());
                break;
            } else {
                System.out.println("Please, enter valid "
                        + "message type. Only 'A', 'B', 'C' or 'D' are allowed");
                continue;
            }

        }

    }

    private static boolean isValidMessageType(String userInput) {
        boolean flag = true;
        try {
            MessageType type = MessageType.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            flag =false;
        }
        return flag;
    }

}
