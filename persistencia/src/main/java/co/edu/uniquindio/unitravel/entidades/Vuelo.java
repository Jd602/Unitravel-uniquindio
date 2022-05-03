package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;


    @JoinColumn(nullable = false)
    private EstadoVuelo estado;


    @Column(nullable = false,length = 30,unique = true)
    private String aerolinea;

    @OneToMany(mappedBy = "vuelo")
    //@JoinColumn(nullable = false)
    private List<Silla> sillas;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Ciudad origen;

    //Falta ajustar la ciudad destino, debo consultar cómo hacer una relacion 2-N
    //@ManyToOne
    //@JoinColumn(nullable = false)
    //private Ciudad destino;

    public Vuelo(EstadoVuelo estado, String aerolinea, List<Silla> sillas, Ciudad origen
            //, Ciudad destino
    ) {
        this.estado = estado;
        this.aerolinea = aerolinea;
        this.sillas = sillas;
        this.origen = origen;
        //this.destino = destino;
    }
}
