package asembly.dto.auth.signin;

import asembly.dto.auth.access.AccessResponse;
import asembly.dto.auth.refresh.RefreshResponse;

public record SignInResponse(
        String user_id,
        String username,
        AccessResponse access,
        RefreshResponse refresh
) {}
