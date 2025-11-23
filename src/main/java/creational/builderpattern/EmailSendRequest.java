package creational.builderpattern;

import java.time.Instant;
import java.util.List;

public class EmailSendRequest {

    // Required parameters
    private final String from;
    private final String to;
    private final String subject;

    // Optional parameters - initialized to default values
    private List<String> cc = null;
    private List<String> bcc = null;
    private Instant scheduledAt = null;


    private EmailSendRequest(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.subject = builder.subject;
        this.cc = builder.cc;
        this.bcc = builder.bcc;
        this.scheduledAt = builder.scheduledAt;
    }

    public static class Builder {

        // Required parameters
        private final String from;
        private final String to;
        private final String subject;

        // Optional parameters - initialized to default values
        private List<String> cc = null;
        private List<String> bcc = null;
        private Instant scheduledAt = null;

        public Builder(String from, String to, String subject) {

            if(from == null || to == null || subject == null) {
                throw new IllegalArgumentException("From, To and Subject cannot be null");
            }

            this.from = from;
            this.to = to;
            this.subject = subject;
        }

        public Builder addCC(List<String> cc) {
            this.cc = cc;
            return this;
        }

        public Builder addBCC(List<String> bcc) {
            this.bcc = bcc;
            return this;
        }

        public Builder scheduleAt(Instant scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }

        public EmailSendRequest build() {
            return new EmailSendRequest(this);
        }
    }

    @Override
    public String toString() {
        return "EmailSendRequest{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", cc=" + cc +
                ", bcc=" + bcc +
                ", scheduledAt=" + scheduledAt +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public Instant getScheduledAt() {
        return scheduledAt;
    }
}
