public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String telefono;

    // Este es el constructor sin argumentos
    public Usuario() {
    }

    // Este es el constructor con argumentos
    public Usuario(int id, String nombre, String apellido, String email, String password, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para imprimir los detalles del usuario
    public void imprimirDetalles() {
        imprimir("ID: " + id);
        imprimir("Nombre: " + nombre);
        imprimir("Apellido: " + apellido);
        imprimir("Email: " + email);
        imprimir("Teléfono: " + telefono);
    }

    // Método imprimir
    public void imprimir(String palabra){
        System.out.println(palabra);
    }

}