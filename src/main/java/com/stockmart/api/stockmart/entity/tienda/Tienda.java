package com.stockmart.api.stockmart.entity.tienda;

import com.stockmart.api.stockmart.entity.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private Long idTienda;

    @Column(name = "nombre_tienda")
    private String nombreTienda;

    @OneToMany(mappedBy = "tienda")
    private List<Usuario> usuarios;
}
