package asembly.exception;

import java.time.Instant;

public record ApiError(
        String type,
        String code,
        String message,
        Instant timestamp,
        String path
) {}
