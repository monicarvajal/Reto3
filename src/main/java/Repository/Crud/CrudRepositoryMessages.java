package Repository.Crud;

import model.Messages;
import org.springframework.data.repository.CrudRepository;

public interface CrudRepositoryMessages extends CrudRepository<Messages,Integer> {
}
