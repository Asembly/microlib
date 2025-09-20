package asembly.event.chat;

import java.util.List;

public record ChatEvent(String chat_id, ChatEventType type, String title, List<String> users_id) {}
