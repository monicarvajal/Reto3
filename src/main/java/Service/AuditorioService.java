package Service;

import Repository.AuditorioRepository;
import model.Auditorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditorioService {

    @Autowired
    private AuditorioRepository auditorioRepository;

    public List<Auditorio> getAll() {
        return auditorioRepository.getAll ();
    }

    public Optional<Auditorio> getAuditorio(int id){
        return auditorioRepository.getAuditorio(id);
    }

    public Auditorio save(Auditorio auditorio){
        if (auditorio.getId() == null){
            return auditorioRepository.save(auditorio);
             }else {
            Optional<Auditorio> auditorio1 = auditorioRepository.getAuditorio(auditorio.getId());
            if(auditorio1.isEmpty()){
                return auditorioRepository.save(auditorio);
            }else{
                return auditorio;
            }
        }
    }
}
