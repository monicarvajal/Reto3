package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Auditorio;
import Repository.Crud.CrudRepositoryAuditorio;

@Repository
public class AuditorioRepository {

    @Autowired
    private CrudRepositoryAuditorio crudRepositoryAuditorio;

    public List<Auditorio> getAll(){
        return (List<Auditorio>) crudRepositoryAuditorio.findAll();
    }
    public Optional<Auditorio> getAuditorio(int id){
        return crudRepositoryAuditorio.findById(id);
    }

    public Auditorio save(Auditorio auditorio){
        return crudRepositoryAuditorio.save(auditorio);
    }
}
