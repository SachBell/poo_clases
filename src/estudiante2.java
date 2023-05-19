public class estudiante2 {

    public int codEstudiante;

    public String Identificacion;

    public String Nombre;

    protected String Curso;
    

    public double CalcularNotasEstudiante(double nota1, double nota2, double nota3) {
        double totalnotas = 0;
        totalnotas = (nota1 + nota2 + nota3)/3;

        return totalnotas;
    }

    public String DatosEstudiante() {
        String datos = "";
        return datos;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }
}