package asembly.event.message;

public record MessageEvent(
        MessageEventType type,
        String message_id,
        String chat_id,
        String author_id
) {}