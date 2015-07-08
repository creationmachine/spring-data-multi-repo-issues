/**
 * 
 */
package com.zampettim.springdata.multirepo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Simple Domain object that represents a Person
 * 
 * @author mzampetti
 *
 */
@Entity
@Table(name="person")
@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Slf4j
public class Person extends IndexablePerson
{
    @NonNull
    @Column(name="first_name")
    private String firstName;
    
    @NonNull
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="middle_name")
    private String middleName;
}
