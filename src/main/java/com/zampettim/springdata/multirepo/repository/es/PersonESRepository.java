/**
 *
 */
package com.zampettim.springdata.multirepo.repository.es;

import com.zampettim.springdata.multirepo.domain.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author mzampetti
 */
@RepositoryRestResource(exported = false)
public interface PersonESRepository extends ElasticsearchRepository<Person, Long>
{
}
