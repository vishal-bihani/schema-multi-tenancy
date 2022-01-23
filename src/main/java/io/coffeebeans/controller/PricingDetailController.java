package io.coffeebeans.controller;

import io.coffeebeans.entity.shared.PricingDetail;
import io.coffeebeans.repository.PricingDetailRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/pricing")
public class PricingDetailController {

    @Inject
    PricingDetailRepository pricingDetailRepository;

    @GET
    @Path("/all")
    public Response getAllPricingDetails() {
        List<PricingDetail> pricingDetailsList = pricingDetailRepository.listAll();
        return Response.ok(pricingDetailsList).build();
    }
}
