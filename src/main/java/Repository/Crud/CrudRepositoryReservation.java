package Repository.Crud;

import model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface CrudRepositoryReservation extends CrudRepository<Reservation,Integer> {
}
