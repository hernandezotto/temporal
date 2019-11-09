
package biblioteca;



public class libro {
    String titulo, autor;
    int cantidadDePaginas,calificacion;
    
    
    //método constructor
    public libro(){
        this.titulo="";
        this.autor="";
        this.cantidadDePaginas=0;
        this.calificacion=0;
    }
    public libro(String tituloDelLibro, String autorDelLibro, int cantidadDEPaginasDElLibro, int calificacionDelLibro){
        titulo=tituloDelLibro;
        autor=autorDelLibro ;
        cantidadDePaginas=cantidadDEPaginasDElLibro;
        calificacion= calificacionDelLibro;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public Integer getCanidad(){
        return cantidadDePaginas;
    }
    public Integer getCalificacion(){
       return calificacion;
    }
}
