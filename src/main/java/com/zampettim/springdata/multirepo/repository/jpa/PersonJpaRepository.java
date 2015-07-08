/**
 * 
 */
package com.zampettim.springdata.multirepo.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zampettim.springdata.multirepo.domain.Person;

/**
 * JPA Repository definition.
 * 
 * @author mzampetti
 *
 */
public interface PersonJpaRepository extends JpaRepository<Person, Long>
{

}
