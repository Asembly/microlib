package asembly.event.chat;

import java.util.List;

public record ChatUserEvent(ChatUserEventType type, String chat_id, List<String> users_id) {}