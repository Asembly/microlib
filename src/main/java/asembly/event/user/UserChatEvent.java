package asembly.event.user;

public record UserChatEvent(
        UserEventType type,
        String user_id,
        String chat_id
) {}
