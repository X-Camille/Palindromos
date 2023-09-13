import org.example.Palindromos;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromosTest {
    private String[] palabras;
    private Boolean[] palabrasResultadosEsperados;
    private String cadenaVacia;
    private String[] numeros;
    private String[] frases;
    private Boolean[] frasesResultadosEsperados;
    private String[] caracteresEspeciales;


    @BeforeEach
    public void init() {
        palabras = new String[]{"oso", "REConOcer", "radAr", "estrella","aca", "acas", "h"};
        palabrasResultadosEsperados = new Boolean[]{true, true, true, false, true, false, true};

        cadenaVacia = "";

        numeros = new String[]{"200", "10", "0", "-1", "30H03"};

        frases = new String[]{"La tele letal", "Anita atina", "Buenos dias"};
        frasesResultadosEsperados = new Boolean[]{true, true, false};

        caracteresEspeciales = new String[]{"¡Anita, atiná!", "A man, a plan, a canal, Panama!", "@#$%^"};
    }

    @Test
    public void esPalindromoParaPalabrasTest() {
        boolean resultadoCorrecto = true;
        for (int i = 0; i < palabras.length; i++) {
            if (Palindromos.esPalindromo(palabras[i]) != palabrasResultadosEsperados[i]) {
                resultadoCorrecto = false;
            }
        }
        assertTrue(resultadoCorrecto);
    }

    @Test
    public void esPalindromoParaFrasesTest() {
        boolean resultadoCorrecto = true;
        for (int i = 0; i < frases.length; i++) {
            if (Palindromos.esPalindromo(frases[i]) != frasesResultadosEsperados[i]) {
                resultadoCorrecto = false;
            }
        }
        assertTrue(resultadoCorrecto);
    }

    @Test
    public void esPalindromoParaCadenaVaciaTest() {
        assertFalse(Palindromos.esPalindromo(cadenaVacia));
    }

    @Test
    public void esDigitoTest() {
        for (String numero : numeros) {
            assertTrue(Palindromos.esDigito(numero));
        }
    }

    @Test
    public void esPalindromoParaCaracteresEspeciales(){
        for (String caracterEspecial : caracteresEspeciales) {
            assertTrue(Palindromos.esPalindromo(caracterEspecial));
        }
    }
}
