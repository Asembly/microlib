package asembly.dto.auth.signin;

public record SignInResult(SignInStatus status, String user_id, String username){
}
