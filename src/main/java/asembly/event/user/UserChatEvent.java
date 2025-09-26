package asembly.event.user;

import java.util.List;

public record UserChatEvent(
        UserChatEventType type,
        String user_id,
        List<String> chats_id
) {}
