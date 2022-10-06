package Controller;

import model.Auditorio;
import Service.AuditorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Auditorio")
@CrossOrigin (origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
public class AuditorioController {

    @Autowired
    private AuditorioController auditorioService;

    @GetMapping("/all")
    public List<Auditorio> getAll(){
        return auditorioService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Auditorio>  getAuditorio (@PathVariable("id") int id){
        return auditorioService.getAuditorio(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Auditorio save(@RequestBody Auditorio auditorio){
        return auditorioService.save(auditorio);
    }

}
