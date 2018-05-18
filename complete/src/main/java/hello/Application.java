package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import DAO.Partner;
import DAO.PartnerRepository;

@SpringBootApplication
@EntityScan("DAO")
@EnableMongoRepositories("DAO")
@ComponentScan({"DAO", "ControllerPackage", "Service"})
public class Application {

	@Autowired
	private PartnerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Partner("3", "Jpartner"));
		System.out.println("end of run..");

		/*
		 * repository.save(new Customer("Bob", "Smith"));
		 * 
		 * // fetch all customers System.out.println("Customers found with findAll():");
		 * System.out.println("-------------------------------"); for (Customer customer
		 * : repository.findAll()) { System.out.println(customer); }
		 * System.out.println();
		 * 
		 * // fetch an individual customer
		 * System.out.println("Customer found with findByFirstName('Alice'):");
		 * System.out.println("--------------------------------");
		 * System.out.println(repository.findByFirstName("Alice"));
		 * 
		 * System.out.println("Customers found with findByLastName('Smith'):");
		 * System.out.println("--------------------------------"); for (Customer
		 * customer : repository.findByLastName("Smith")) {
		 * System.out.println(customer);
		 */
	//}

}
