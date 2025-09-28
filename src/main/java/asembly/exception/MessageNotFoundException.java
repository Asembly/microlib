package asembly.exception;

import java.util.Map;

public class MessageNotFoundException extends BusinessException {
    public MessageNotFoundException(String message_id) {
        super(
                "Message with id: " + message_id + " not found",
                "MESSAGE_NOT_FOUND",
                Map.of("message_id", message_id)
        );
    }
}
