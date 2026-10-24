public class ValidadorClave {
    
    public boolean esValida(String clave) {
        if (clave == null) {
            return false;
        }
        return tieneLongitudMinima(clave) && noTieneEspacios(clave) && tieneMayuscula(clave);
    }

    private boolean tieneLongitudMinima(String clave) {
        return clave.length() >= 8;
    }

    private boolean noTieneEspacios(String clave) {
        return !clave.contains(" ");
    }

    private boolean tieneMayuscula(String clave) {
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isUpperCase(clave.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}