package com.SpringBoot.WebServicesApi.models;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface Interface extends PagingAndSortingRepository<Empresa, Integer>{

	public Iterable<Empresa> findBynomedaempresaContainingIgnoreCase(String parteNome);
}
