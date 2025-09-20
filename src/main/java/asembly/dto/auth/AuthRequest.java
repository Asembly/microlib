package asembly.dto.auth;

public record AuthRequest(String correlationId, String username, String password) {}
