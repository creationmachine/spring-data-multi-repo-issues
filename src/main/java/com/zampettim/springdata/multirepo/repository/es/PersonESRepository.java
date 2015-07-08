/**
 * 
 */
package com.zampettim.springdata.multirepo.repository.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.zampettim.springdata.multirepo.domain.IndexablePerson;

/**
 * @author mzampetti
 *
 */
interface PersonESRepository extends ElasticsearchRepository<IndexablePerson, Long>
{

}
