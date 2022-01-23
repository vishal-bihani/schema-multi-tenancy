package io.coffeebeans.config;

import io.quarkus.hibernate.orm.PersistenceUnitExtension;
import io.quarkus.hibernate.orm.runtime.tenant.TenantResolver;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@PersistenceUnitExtension("tenant")
@RequestScoped
public class CustomTenantResolver implements TenantResolver {
    private static final String DEFAULT_TENANT = "public";

    @Inject
    RoutingContext context;

    @Override
    public String getDefaultTenantId() {
        return DEFAULT_TENANT;
    }

    @Override
    public String resolveTenantId() {
        String tenantName = context.request().getHeader("tenant");
//        String path = context.request().path();
//        String[] parts = path.split("/");
//        if (parts.length == 0) {
//            return getDefaultTenantId();
//        }
//        return parts[1];
        return tenantName;
    }
}
