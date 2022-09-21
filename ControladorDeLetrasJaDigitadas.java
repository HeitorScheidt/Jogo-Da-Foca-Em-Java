public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
        /*int z =0
         * if (letrasJaDigitadas.isEmpity() == true)
         * 
         */
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++){
            if (letra == this.letrasJaDigitadas.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public void registre (char letra) throws Exception
    {
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m�todo this.isJaDigitada, para isso), lancando uma exce��o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
		
    }

    public String toString ()
    {
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).
        return String.join(" ", this.letrasJaDigitadas);
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj s�o iguais
        if (this == obj)
        return true;

        //Compara se obj é null (nunca via ser, ah menos qe seja expecificado ou não instanciado)
        if (obj == null)
            return false;

        //Compara se classe de obj é diferente da classe Palavra
        if (obj.getClass() != Palavra.class)
            return false;
    
        //Compara se o texto de this é igual ao texto de obj
        //após compararmos as classes no if de cima ja sabemos que las são do mesmo tipo entao 
        //Revelamos (Consideramos) ele to tipo palavra ao adicionar "Palavra"
        if (this.letrasJaDigitadas != ((ControladorDeLetrasJaDigitadas) obj).letrasJaDigitadas)
            return false;

        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de 
        int ret = 666;

        ret = 13*ret + new String (this.letrasJaDigitadas).hashCode();
        if (ret < 0)
            ret = - ret;

        return ret;
    }
    
    // construtor de c�pia
    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception 
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if (controladorDeLetrasJaDigitadas == null)
        throw new Exception("modelo ausente");

    this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        // criar uma c�pia do this com o construtor de c�pia e retornar
        {
            // retornar uma copia de this
            ControladorDeLetrasJaDigitadas ret = null;
    
            try{
                ret = new ControladorDeLetrasJaDigitadas(this);
            }
            catch(Exception erro){}
            return ret;
        }
    }
}
