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
/**
 * Generated by Gas3 v1.1.0 (Granite Data Services) on Sat Jul 26 17:58:20 CEST 2008.
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERRIDDEN EACH TIME YOU USE
 * THE GENERATOR. CHANGE INSTEAD THE INHERITED CLASS (Person.as).
 */

package org.granite.client.test.javafx.tide;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.ReadOnlyListWrapper;
import javafx.beans.property.ReadOnlySetProperty;
import javafx.beans.property.ReadOnlySetWrapper;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;

import org.granite.client.javafx.persistence.collection.FXPersistentCollections;
import org.granite.client.messaging.RemoteAlias;
import org.granite.client.persistence.Entity;
import org.granite.client.persistence.Lazy;

@Entity
@RemoteAlias("org.granite.test.tide.Patient4b")
public class Patient4b extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
    private ObjectProperty<PatientStatus> status = new SimpleObjectProperty<PatientStatus>(this, "status");
	@Lazy
    private ReadOnlyListWrapper<Visit2> visits = FXPersistentCollections.readOnlyObservablePersistentList(this, "visits");
    @Lazy
    private ReadOnlySetWrapper<Diagnosisb> diagnosis = FXPersistentCollections.readOnlyObservablePersistentSet(this, "diagnosis");
    private BooleanProperty diagnosisAssessed = new SimpleBooleanProperty(this, "diagnosisAssessed");
    private StringProperty name = new SimpleStringProperty(this, "name");


    public Patient4b() {
        super();
    }

    public Patient4b(Long id, Long version, String uid, String name, boolean assessed) {
        super(id, version, uid);
        this.name.set(name);
        this.diagnosisAssessed.set(assessed);
    }

    public Patient4b(Long id, boolean initialized, String detachedState) {
        super(id, initialized, detachedState);
    }

    public StringProperty nameProperty() {
        return name;
    }
    public String getName() {
        return name.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }

    public ObjectProperty<PatientStatus> statusProperty() {
        return status;
    }
    public PatientStatus getStatus() {
        return status.get();
    }
    public void setStatus(PatientStatus patientStatus) {
        this.status.set(patientStatus);
    }

    public ReadOnlyListProperty<Visit2> visitsProperty() {
        return visits.getReadOnlyProperty();
    }
    public ObservableList<Visit2> getVisits() {
        return visits.get();
    }

    public ReadOnlySetProperty<Diagnosisb> diagnosisProperty() {
        return diagnosis.getReadOnlyProperty();
    }
    public ObservableSet<Diagnosisb> getDiagnosis() {
        return diagnosis.get();
    }
    
    public boolean isDiagnosisAssessed() {
    	return diagnosisAssessed.get();
    }
    public void setDiagnosisAssessed(boolean assessed) {
    	diagnosisAssessed.set(assessed);
    }
    public BooleanProperty diagnosisAssessedProperty() {
    	return diagnosisAssessed;
    }
}