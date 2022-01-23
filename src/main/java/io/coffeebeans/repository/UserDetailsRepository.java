package io.coffeebeans.repository;

import io.coffeebeans.entity.tenant.UserDetails;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserDetailsRepository implements PanacheRepository<UserDetails> {
}
