/**
 *
 */
package com.zampettim.springdata.multirepo.domain;

import lombok.*;
import org.springframework.data.annotation.Version;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Base class that implements common aspects of all Domain/Entity objects
 *
 * @author mzampetti
 */
@MappedSuperclass
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity
{
  /*@Column(name = "last_modified_on")
  protected LocalDateTime lastModifiedOn;*/

  @Column(name = "last_modified_by")
  protected String lastModifiedBy;

  @Version
  @Column(name = "version")
  protected Long version;
}
