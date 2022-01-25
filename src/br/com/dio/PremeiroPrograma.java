package br.com.dio;

public class PremeiroPrograma {
    public static void main(String[] args) {
        int a= 4;
        int b= 9;
        System.out.println("Hello World " + (a+b));

        livro livro1 = new livro("o problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
}

class livro {
    private String nome;
    private Integer numPaginas;

    public livro(String nome, int numePaginas) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}