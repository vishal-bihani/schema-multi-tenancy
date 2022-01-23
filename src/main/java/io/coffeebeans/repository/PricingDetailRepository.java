package io.coffeebeans.repository;

import io.coffeebeans.entity.shared.PricingDetail;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PricingDetailRepository implements PanacheRepository<PricingDetail> {
}
