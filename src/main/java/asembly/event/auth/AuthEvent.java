package asembly.event.auth;

public record AuthEvent(AuthEventType type, String username, String encode_password) {}
