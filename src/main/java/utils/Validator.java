package utils;

public final class Validator {

    private Validator() { }

    public static void requirePositive(double value, String nameField, Object obj) {
        if (value <= 0) {
            throw new IllegalArgumentException(String.format("%s must be > 0; get: %f; object: %s",
                    nameField, value, obj));
        }
    }

    public static void requireString(String value, String nameField, Object obj) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(String.format("%s must be not empty; get: %s; object: %s",
                    nameField, value, obj));
        }
    }

    public static void requireValidIndex(int index, int arrayLength, Object obj) {
        if (index < 0 || index >= arrayLength) {
            throw new IllegalArgumentException(String.format("%d must be <= array length and it should not be less than 0; array length: %d; object: %s",
                    index, arrayLength, obj));
        }
    }
}
