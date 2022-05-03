package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario extends Persona implements Serializable {

    @ManyToOne
    private Ciudad ciudad;

    @OneToMany(mappedBy = "usuario")
    private List<Reserva> reservas;

    //@OneToMany(mappedBy = "usuario")
    //private List<Comentario> comentarios;


    public Usuario(String cedula, String nombre, String correo, String password,
                   Map<String, String> telefono, Ciudad ciudad, List<Reserva> reservas) {
        super(cedula, nombre, correo, password, telefono);
        this.ciudad = ciudad;
        this.reservas = reservas;
    }
}
