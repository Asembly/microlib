package asembly.dto.user;

import java.time.LocalDate;

public record UserResponse(String user_id, String username, String password, LocalDate created_at){}
