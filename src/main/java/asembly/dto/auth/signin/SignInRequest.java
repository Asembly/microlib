package asembly.dto.auth.signin;

public record SignInRequest(String correlationId, String username, String password) {}
