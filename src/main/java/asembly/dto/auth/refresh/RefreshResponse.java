package asembly.dto.auth.refresh;

public record RefreshResponse(String token, Long expires_at){}
