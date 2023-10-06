public class Livro
{
    private String titulo;
    private String autor;
    private int nroPaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int nroPaginas)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.paginaAtual = 1;
    }

    public String getInformacoes()
    {
        return "Título: " + this.titulo + ", Autor: " + this.autor + ", Páginas: " + this.nroPaginas + ", Página Atual: " + this.paginaAtual + ".";
    }

    public int getPaginaAtual(){
        return this.paginaAtual;
    }
    
    public int getNroPaginas(){
        return this.nroPaginas;
    }
    
    public void virarPagina(){
        this.irParaPagina(this.getPaginaAtual() + 1);
    }
    
    public void retrocederPagina(){
        this.irParaPagina(this.getPaginaAtual() - 1);
    }
    
    public void irParaPagina(int pagina){
        //Páginas inválidas
        if (pagina > this.getNroPaginas()){
            return;
        }
        if (pagina < 1){
            return;
        }
        this.setPagina(pagina);
    }
    
    private void setPagina(int pagina){
        this.paginaAtual = pagina;
    }    
}
