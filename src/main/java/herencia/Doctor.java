
package herencia;

public class Doctor  extends Persona{

    public Doctor(int numeroConsultorio, String especialidad, String hospital, int id, String nombre, String apellidoUno, String apellidoDos, String fechaNacimiento, int telefono, int edad, String ciudad, String colonia) {
        super(nombre, apellidoUno, apellidoDos, fechaNacimiento, telefono, edad, ciudad, colonia);
        this.numeroConsultorio = numeroConsultorio;
        this.especialidad = especialidad;
        this.hospital = hospital;
        this.id = id;
    }

    
    
    
    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int numeroConsultorio;
    private String especialidad;
    private  String hospital;
    private int id;
    
}
