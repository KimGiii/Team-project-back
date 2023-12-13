package com.teamprojectback.DTO;

public interface ResponseMessage {
    String SUCCESS = "Success.";

    String VALIDATION_FAILED = "Validation failed.";
    String NOT_EXIST_USER = "This user does not exist.";
    String NOT_EXIST_BOARD = "This board does not exist.";

    String NO_PERMISSION = "Do not have permission.";
    String DATABASE_ERROR = "Database error.";
}
