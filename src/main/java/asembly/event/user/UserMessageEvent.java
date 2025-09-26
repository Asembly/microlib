package asembly.event.user;

public record UserMessageEvent(
        UserMessageEventType type,
        String text,
        String user_id,
        String chat_id
) {}
