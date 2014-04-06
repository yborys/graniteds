/**
 *   GRANITE DATA SERVICES
 *   Copyright (C) 2006-2014 GRANITE DATA SERVICES S.A.S.
 *
 *   This file is part of the Granite Data Services Platform.
 *
 *   Granite Data Services is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   Granite Data Services is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 *   General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 *   USA, or see <http://www.gnu.org/licenses/>.
 */
package org.granite.client.test.javafx.tide;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import org.granite.client.persistence.Entity;
import org.granite.client.persistence.Lazy;


@Entity
public class ContactSet extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    
    @Lazy
    private ObjectProperty<PersonSet> person = new SimpleObjectProperty<PersonSet>(this, "person");
    private StringProperty email = new SimpleStringProperty(this, "email");
    
    
    public ContactSet() {
        super();
    }
    
    public ContactSet(Long id, Long version, String uid, String email) {
        super(id, version, uid);
        this.email.set(email);
    }    
    public ContactSet(Long id, Long version, String uid, PersonSet person, String email) {
        super(id, version, uid);
        this.person.set(person);
        this.email.set(email);
    }    
    
    public ObjectProperty<PersonSet> personProperty() {
        return person;
    }
    
    public PersonSet getPerson() {
        return person.get();
    }
    
    public void setPerson(PersonSet person) {
        this.person.set(person);
    }
    
    public StringProperty emailProperty() {
        return email;
    }
    
    public String getEmail() {
        return email.get();
    }
    
    public void setEmail(String email) {
        this.email.set(email);
    }
}