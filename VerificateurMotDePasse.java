public class VerificateurMotDePasse {

    public static boolean estValide(String motDePasse) {

    	// Vérifie la longueur
        if (motDePasse.length() < 8 && motDePasse.length() > 15) {
            return false;
        }
        
        boolean aMajuscule = false;
        boolean aMinuscule = false;
        boolean aChiffre = false;
        boolean aCarcSpec = false;
        
        
        // Vérifie chaque caractère
        for (int i = 0; i < motDePasse.length(); i++) {
            char c = motDePasse.charAt(i);
            if (Character.isUpperCase(c)) {
                aMajuscule = true;
            } else if (Character.isLowerCase(c)) {
                aMinuscule = true;
            } else if (Character.isDigit(c)) {
                aChiffre = true;
            } 
        }
        
        // Vérifie qu'il y a au moins une lettre majuscule, une lettre minuscule et un chiffre
        if (!aMajuscule || !aMinuscule || !aChiffre || aCarcSpec) {
            return false;
        }
        
        return true;
    }
}
