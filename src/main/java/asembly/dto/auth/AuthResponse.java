package asembly.dto.auth;

import asembly.dto.auth.token.AccessResponse;
import asembly.dto.auth.token.RefreshResponse;

public record AuthResponse(
        String user_id,
        String username,
        AccessResponse access,
        RefreshResponse refresh) {}
