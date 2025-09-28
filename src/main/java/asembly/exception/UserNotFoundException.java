package asembly.exception;

import java.util.Map;

public class UserNotFoundException extends BusinessException {
    public UserNotFoundException(String user_id) {
        super(
                "User with id: " + user_id + " not found",
                "USER_NOT_FOUND",
                Map.of("user_id", user_id)
        );
    }
}
