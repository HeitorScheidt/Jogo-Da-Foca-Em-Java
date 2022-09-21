import java.util.Arrays;

public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		// * verifica se qtd n�o � positiva, lan�ando uma exce��o.
		// * instancia this.texto com um vetor com tamanho igual qtd.
		// * preenche this.texto com underlines (_).

        if (qtd <= 0) throw new Exception("Quantidade negativa é invadida");
        this.texto = new char [qtd];
        for(int i = 0; i < qtd; i++){
            this.texto[i] = '_';
            //System.out.println(this.texto[i]);
        }
   
    }

    public void revele (int posicao, char letra) throws Exception
    {
		// verifica se posicao � negativa ou ent�o igual ou maior
		// do que this.texto.length, lan�ando uma exce��o.
		// armazena a letra fornecida na posicao tambem fornecida
		// do vetor this.texto

        if (posicao >= this.texto.length) throw new Exception("Posição Invalida");

        this.texto[posicao] = letra; 
        System.out.println(letra);
    }

    public boolean isAindaComTracinhos ()
    {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario

        for(int i = 0 ; i < this.texto.length ; i++){
            if (this.texto[i] == '_'){
                return true;
            }
        }
        return false;
    }

    public String toString ()
    {
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
            String str = Arrays.toString(this.texto);    
        //for( int i = 0 ; i < this.texto.length ; i++ )
        String strr = String.join(" ", str);
        System.out.println(strr);
        return strr;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
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
        if (this.texto != ((Tracinhos) obj).texto)
            return false;
        
        return true;
        }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        //professor pediu para fazer meu proprio hash hashCode
        //deixar esse comentaod para teste depois
        return Arrays.hashCode(this.texto);
    }

    //construtor de copia
    public Tracinhos (Tracinhos t) throws Exception
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
        if (t == null)
            throw new Exception("modelo ausente");

        this.texto = t.texto;
    }

    public Object clone ()
    {
        // retornar uma copia de this
        Tracinhos ret = null;

        try{
            ret = new Tracinhos(this);
        }
        catch(Exception erro){}
        return ret;
    }
}
