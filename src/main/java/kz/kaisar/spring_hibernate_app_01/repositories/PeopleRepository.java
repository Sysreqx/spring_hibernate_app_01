package kz.kaisar.spring_hibernate_app_01.repositories;

import kz.kaisar.spring_hibernate_app_01.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
