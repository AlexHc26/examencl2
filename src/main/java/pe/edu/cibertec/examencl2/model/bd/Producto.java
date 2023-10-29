package pe.edu.cibertec.examencl2.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;

    @Column(name = "nomproducto")
    private String nomproducto;

    @Column(name = "precio")
    private Double precio ;
}
