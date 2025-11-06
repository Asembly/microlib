package asembly.dto.message;

import java.time.LocalDate;

public record MessageResponse(String id, String text, String author, LocalDate created_at) {}

