package asembly.event.message;

public record MessageEvent(MessageEventType type, String chat_id, String author_id) {}