package br.com.buritiscript.dockerspringbootpostgres.repository;

import br.com.buritiscript.dockerspringbootpostgres.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
