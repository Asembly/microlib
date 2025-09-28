package asembly.exception;

import java.time.Instant;
import java.util.Map;

public record ApiError(
        String type,
        StatusCodeException code,
        String message,
        Map<String, Object> details,
        Instant timestamp,
        String path
) {}
