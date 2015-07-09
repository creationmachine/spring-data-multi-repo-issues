/**
 *
 */
package com.zampettim.springdata.multirepo.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;

/**
 * Simple Domain object that represents a Person
 *
 * @author mzampetti
 */
@Entity
@Table(name = "person")
@Document(indexName = "person", indexStoreType = "memory", shards = 1, replicas = 0)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Slf4j
public class Person extends BaseEntity
{
  @Id
  @javax.persistence.Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long entityId;

  @NonNull
  @Column(name = "first_name")
  private String firstName;

  @NonNull
  @Column(name = "last_name")
  private String lastName;

  @Column(name = "middle_name")
  private String middleName;
}
