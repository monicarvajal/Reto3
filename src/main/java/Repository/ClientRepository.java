package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Client;
import Repository.Crud.CrudRepositoryClient;

@Repository
public class ClientRepository {
    @Autowired
    private CrudRepositoryClient crudRepositoryClient;


    public List<Client> getAll(){
        return (List<Client>) crudRepositoryClient.findAll();
    }
    public Optional<Client> getClient(int id){
        return crudRepositoryClient.findById(id);
    }

    public Client save(Client client){
        return crudRepositoryClient.save(client);
    }
}