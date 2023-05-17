public class estudiante {
    
    public int CodigoEstudiante;

    public String Nombre;

    public String Identificacion;


    public void ReporteDeNotas() {

        System.out.println("La nota del estudiante con codigo "+getCodigoEstudiante() +"el nombre del estudiante es " +getNombre() +"y su nota es 8");
    }

    public int getCodigoEstudiante() {
        return CodigoEstudiante;
    }


    public void setCodigoEstudiante(int codigoEstudiante) {
        CodigoEstudiante = codigoEstudiante;
    }

    
    public String getNombre() {
        return Nombre;
    }



    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }


    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }
}
