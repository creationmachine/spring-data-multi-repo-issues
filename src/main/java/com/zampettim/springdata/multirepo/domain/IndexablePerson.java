/**
 *
 */
package com.zampettim.springdata.multirepo.domain;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

/**
 * This is a marker class that is solely used to allow ElasticSearch and JPA Spring Data Repositories
 * to co-exist and utilize the same object.
 *
 * @author mzampetti
 */
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(indexName = "person", indexStoreType = "memory", shards = 1, replicas = 0)
public class IndexablePerson extends BaseEntity
{
  // Both the @Id annotations are needed because JPA requires the from from the javax.persistence package
  // and Elasticsearch requires the Spring version
}
