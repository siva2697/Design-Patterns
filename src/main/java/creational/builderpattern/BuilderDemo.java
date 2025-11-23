package creational.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {

    public static void main(String[] args) {

        EmailSendRequest request1 = new EmailSendRequest.Builder(
                "glssk",
                "vbvr",
                "Meeting Reminder"
        ).build();

        System.out.println("Email Req 1: " + request1);


        EmailSendRequest request2 = new EmailSendRequest.Builder(
                "glssk",
                "vbvr",
                "Meeting Reminder"
        ).addCC(new ArrayList<>(List.of("xyz@gmail.com", "zzy@gmail.com"))
        ).addBCC(new ArrayList<>(List.of("hello@gmail.com"))
        ).build();

        System.out.println("Email Req 2: " + request2);

        // This will throw error
        EmailSendRequest request3 = new EmailSendRequest.Builder(
                "glssk1",
                "vbvr",
                null
        ).build();

        System.out.println("Email Req 3: " + request3);
    }
}
