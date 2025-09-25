package asembly.event.chat;

import java.util.List;

public record ChatEvent(ChatEventType type, String chat_id, String users_id) {}