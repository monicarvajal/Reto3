package Repository;

import Repository.Crud.CrudRepositoryScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository {

    @Autowired
    private CrudRepositoryScore crudRepositoryScore;
}
