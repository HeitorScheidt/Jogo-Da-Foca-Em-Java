public class BancoDePalavras
{
    private static String[] palavras = 
    {
		"JAVA",
		"CLASSE",
		"OBJETO",
		"INSTANCIA",
		"PUBLICO",
		"PRIVATIVO",
		"METODO",
		"CONSTRUTOR",
		"SETTER",
		"GETTER",
		"LUZ",
		"PRAZER"
    };

    public static Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            //o random vai gerar um nemero entre 0 e 0,999...999 multiplicando assim pelo tanho do vetor
            //pegamos assim a numero inteiro, sem nos importarmos com a parte fracionada.
            palavra =
            new Palavra (BancoDePalavras.palavras[
            (int)(Math.random() * BancoDePalavras.palavras.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }
}
