package ru.sklyarov.products.exceptions;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class ShopError {
    private List<String> messages;
    private Timestamp timestamp;

    public ShopError() {
    }

    public ShopError(List<String> messages) {
        this.messages = messages;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public ShopError(String message) {
        this(List.of(message));
    }
    public ShopError(String... messages) {
        this(Arrays.asList(messages));
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
