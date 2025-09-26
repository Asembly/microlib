package asembly.event.user;

public record UserMessageEvent(
        UserMessageEventType type,
        String text,
        String author_id,
        String chat_id
) {}
