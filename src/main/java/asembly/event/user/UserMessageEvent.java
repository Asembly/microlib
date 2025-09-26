package asembly.event.user;

import java.util.List;

public record UserMessageEvent(
        UserMsgEventType type,
        String text,
        String user_id,
        String chat_id
) {}
