package gt.edu.url.laboratorio_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController{

    @GetMapping("/api/saludo")
    public String saludo() {
        return "¡Bienvenido(a) al Comedor Solidario Manos Unidas!";
    }

    @GetMapping("/api/bienvenida")
    public String bienvenida(@RequestParam(defaultValue = "visitante") String nombre) {
    return "Hola, " + nombre + ". Gracias por apoyar al Comedor Solidario Manos Unidas.";
    }

    @GetMapping("/api/menu-del-dia")
    public String menuDelDia() {
        return "El platillo del día es: Pepian de res con arroz y tortillas.";
    }
}