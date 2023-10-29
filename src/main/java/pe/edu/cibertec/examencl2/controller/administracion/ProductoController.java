package pe.edu.cibertec.examencl2.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.examencl2.service.ProductoService;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/producto")
public class ProductoController {
    private ProductoService productoService;

    @GetMapping("/frmproducto")
    public String index(Model model){
        model.addAttribute("listaproductos",
                productoService.listarProductos());
        return "administracion/frmproducto";
    }
}
