package asembly.dto.user;

import java.util.List;

public record UserUpdateRequest(String username, String password, List<String> chats_id) {}
