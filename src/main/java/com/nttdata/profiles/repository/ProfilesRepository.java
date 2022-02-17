package com.nttdata.profiles.repository;

import com.nttdata.profiles.entity.Profiles;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ProfilesRepository extends ReactiveMongoRepository<Profiles, String> {

    Mono<Profiles> findByCodProfile(String codProfile);
}
