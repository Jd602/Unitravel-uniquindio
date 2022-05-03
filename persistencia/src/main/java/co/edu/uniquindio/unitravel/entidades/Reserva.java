package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reserva implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(nullable = false)
    private LocalDate fecha;

    @FutureOrPresent
    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Future
    @Column(nullable = false)
    private LocalDate fechaFin;

    @Column(nullable = false)
    private EstadoReserva estado;

    @Column(nullable = false,precision = 8,scale = 2)
    private Double precioTotal;

    @Column(nullable=false)
    private int cantidadPersonas;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "reserva")
    //@JoinColumn(nullable = false)
    private List<ReservaSilla> reservasSilla;

    //@OneToMany(mappedBy = "reserva")
    //private List<ReservaHabitacion> reservas;


    public Reserva(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin, EstadoReserva estado,
                   Double precioTotal, int cantidadPersonas, Usuario usuario, List<ReservaSilla> reservasSilla) {
        this.fecha = fecha;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.precioTotal = precioTotal;
        this.cantidadPersonas = cantidadPersonas;
        this.usuario = usuario;
        this.reservasSilla = reservasSilla;
    }
}

