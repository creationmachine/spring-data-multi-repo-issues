/**
 * 
 */
package com.zampettim.springdata.multirepo.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Version;

/**
 * Base class that implements common aspects of all Domain/Entity objects
 * 
 * @author mzampetti
 *
 */
@MappedSuperclass
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {
    
    @Getter
    @Setter
    @Version
    @Column(name="last_modified_on")
    protected LocalDateTime lastModifiedOn;
    
    @Getter
    @Setter
    @Column(name="last_modified_by")
    protected String lastModifiedBy;
}
