package com.corhuila.Parcial.Controller;


import com.corhuila.Parcial.Entitity.Nota;
import com.corhuila.Parcial.IService.INotaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/nota")
public class NotaController extends ABaseController<Nota, INotaService> {
    public NotaController(INotaService service)
    {
         super(service, "Nota");
    }
}
