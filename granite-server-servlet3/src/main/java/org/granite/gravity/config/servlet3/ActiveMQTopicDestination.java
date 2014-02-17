/**
 *   GRANITE DATA SERVICES
 *   Copyright (C) 2006-2013 GRANITE DATA SERVICES S.A.S.
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
package org.granite.gravity.config.servlet3;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.granite.gravity.security.GravityDestinationSecurizer;


@Inherited
@Retention(RUNTIME)
@Target({FIELD})
public @interface ActiveMQTopicDestination {
	
	boolean noLocal() default true;
	
	boolean sessionSelector() default false;
	
	String name();

    public String[] securityRoles() default {};

	Class<? extends GravityDestinationSecurizer> securizer() default GravityDestinationSecurizer.class;
	
    String connectionFactory();
    
    String topicJndiName();
    
    boolean textMessages() default false;
    
    String acknowledgeMode() default "AUTO_ACKNOWLEDGE";
    
    boolean transactedSessions() default false;
    
    String brokerUrl();
    
    boolean createBroker() default true;
    
    boolean waitForStart() default false;
    
    boolean durable() default false;
    
    String fileStoreRoot() default "";
    
}