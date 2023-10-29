package pe.edu.cibertec.examencl2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.examencl2.model.bd.Producto;
import pe.edu.cibertec.examencl2.repository.ProductoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoService {
    private ProductoRepository productoRepository;



    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }
}
