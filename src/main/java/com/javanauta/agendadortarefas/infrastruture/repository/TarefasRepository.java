package com.javanauta.agendadortarefas.infrastruture.repository;

import com.javanauta.agendadortarefas.infrastruture.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository <TarefasEntity, String>{

}
