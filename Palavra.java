public class Palavra implements Comparable<Palavra>
{
    //uma string chamada texto
    private String texto;

    //construtor
    public Palavra (String texto) throws Exception
    {
		// * verifica se o texto recebido � nulo ou ent�o vazio,
		// * ou seja, sem nenhum caractere, lan�ando exce��o.
		//testar string com tamanho 0 e ""
        if (texto == "//" || texto =="null")
            throw new Exception("String vazia");

		// * armazena o texto recebido em this.texto.
        this.texto = texto;
    }

    public int getQuantidade (char letra)
    {
        // * percorre o String this.texto, conta e retorna
        // * quantas letras existem nele iguais a letra fornecida
        int contador = 0;
        for (int i = 0; i < this.texto.length(); i++){
            char caractere = this.texto.charAt(i);
            if(caractere == letra){
                contador++;
            }
        }
        return contador;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        // * se i==0, retorna a posicao em que ocorre a primeira
        // * aparicao de letra fornecida em this.texto;
        // * se i==1, retorna a posicao em que ocorre a segunda
        // * aparicao de letra fornecida em this.texto;
        // * se i==2, retorna a posicao em que ocorre a terceira
        // * aparicao de letra fornecida em this.texto;
        // * e assim por diante.
        // * lan�ar excecao caso nao encontre em this.texto
        // * a I�zima apari��o da letra fornecida.
        //o valo de i vai estar sendo incrementado em Forca.java
        

        int contador = -1; // começando do -1 pq o i = 0 já deve retornar a primeira aparição

        for (int j = 0; j < this.texto.length(); j++) {
            char caractere = this.texto.charAt(j);

            if (caractere == letra) {
                contador++;
            }
            
            if (contador == i) {
                return j;
            }
        }

        throw new Exception("String vazia");
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
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
        if (this.texto != ((Palavra) obj).texto)
            return false;
        
        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 666;

        ret = 13*ret + new String (this.texto).hashCode();
        if (ret < 0)
            ret = - ret;

        return ret;
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
