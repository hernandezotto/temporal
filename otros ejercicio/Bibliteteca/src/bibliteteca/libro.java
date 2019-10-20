package bibliteteca;


public class libro {
    String titulo, autor;
    int cantidadPaginas,calificacion;
     
    //método constructor
    public libro(String tituloDeLibro,String autorDelLibro,int cantidadPaginaDElLibro,int calificacionDelLibro)
    {
        titulo = tituloDeLibro;
        autor = autorDelLibro;
        cantidadPaginas= cantidadPaginaDElLibro;
        calificacion= calificacionDelLibro;
    }
}
