package asembly.event.user;

import java.util.List;

public record UserEvent(String user_id, UserEventType type, String username, List<String> chats_id) {
}
