package nikomitk.dto;

public record TestMessage(String message, TestRole role) {
    public record TestRole(String role) {
    }
}
