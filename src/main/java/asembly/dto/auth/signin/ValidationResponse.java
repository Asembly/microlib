package asembly.dto.auth.signin;

public record ValidationResponse(String correlationId, SignInResult result) {}
