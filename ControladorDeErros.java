public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
		// verifica se qtdMax fornecida n�o � positiva, lan�ando
		// uma exce��o.
		// armazena qtdMax fornecida em this.qtdMax.
        if (qtdMax <= 0) throw new Exception("Quantidade invalido");

        this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo

        if(this.qtdErr == this.qtdMax) throw new Exception("Vôce Errou tudo oque podia");
//colocar try e catch
        qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
        if(this.qtdErr == this.qtdMax) return true;

        return false;
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo

        //Compara se os ENDEREÇOS de this(que é o objeto chamante) e obj são iguais
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
        if (this.qtdMax != ((ControladorDeErros) obj).qtdMax)
            return false;

            if (this.qtdErr != ((ControladorDeErros) obj).qtdErr)
            return false;
        
        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret;

        ret = this.qtdMax;
        ret = this.qtdErr;
        if (ret < 0)
            ret = - ret;

        return ret;
    }


    // construtor de c�pia
    public ControladorDeErros (ControladorDeErros c) throws Exception 
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
        if (c == null)
        throw new Exception("modelo ausente");

        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
    }

    public Object clone ()
    {
        // returnar uma c�pia de this
        ControladorDeErros ret = null;

        try{
            ret = new ControladorDeErros(this);
        }
        catch(Exception erro){}
        return ret;
    }
    
}
