package asembly.exception;

import java.util.Map;

public class ChatNotFoundException extends BusinessException {
    public ChatNotFoundException(String chat_id) {
        super(
                "Chat with id: " + chat_id + " not found",
                "CHAT_NOT_FOUND",
                Map.of("chat_id", chat_id)
        );
    }
}
