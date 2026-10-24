public class LoginValidator {

    private String expectedUser;
    private String expectedHash;
    private int intentosFallidos;

    public LoginValidator(String expectedUser, String expectedHash) {
        this.expectedUser = expectedUser;
        this.expectedHash = expectedHash;
        this.intentosFallidos = 0;
    }

    public boolean login(String user, String password) {
        if (intentosFallidos >= 3) {
            return false;
        }

        String hash = aplicarPBKDF2Simulado(password);

        if (this.expectedUser.equals(user) && this.expectedHash.equals(hash)) {
            this.intentosFallidos = 0;
            return true;
        } else {
            this.intentosFallidos++;
            return false;
        }
    }

    private String aplicarPBKDF2Simulado(String input) {
        try {
            byte[] bytes = input.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            return input + "_pbkdf2_simulado";
        } catch (Exception e) {
            return "";
        }
    }
}