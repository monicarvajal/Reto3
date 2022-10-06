package Repository;

import Repository.Crud.CrudRepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
class AdminRepository {

    @Autowired
    private CrudRepositoryAdmin crudRepositoryAdmin;


}
