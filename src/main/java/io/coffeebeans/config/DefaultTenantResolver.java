package io.coffeebeans.config;

import io.quarkus.hibernate.orm.PersistenceUnitExtension;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;

import javax.enterprise.context.RequestScoped;

@PersistenceUnitExtension
@RequestScoped
public class DefaultTenantResolver implements TenantResolver {
    private static final String DEFAULT_TENANT = "public";

    @Override
    public String getDefaultTenantId() {
        return DEFAULT_TENANT;
    }

    @Override
    public String resolveTenantId() {
        return DEFAULT_TENANT;
    }
}
