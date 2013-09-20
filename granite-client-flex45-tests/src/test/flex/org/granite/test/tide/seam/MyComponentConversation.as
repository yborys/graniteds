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
/**
 * Generated by Gas3 v1.1.0 (Granite Data Services) on Sat Jul 26 17:58:20 CEST 2008.
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERRIDDEN EACH TIME YOU USE
 * THE GENERATOR. CHANGE INSTEAD THE INHERITED CLASS (Contact.as).
 */

package org.granite.test.tide.seam {
	
	import org.granite.tide.BaseContext;
	import org.granite.tide.events.TideResultEvent;
	
	import org.flexunit.async.Async;
	

	[Name("myComponent", scope="conversation")]
    public class MyComponentConversation {
    	
    	[In]
    	public var context:BaseContext;
    	
    	public var started:Boolean;
    	public var ended:Boolean;
    	
    	[Observer("start")]
    	public function start():void {
    		started = true;
            context.conversation.start(Async.asyncHandler(context.test, context.test.startResult, 1000));
    	}
    	
    	[Observer("end")]
    	public function end():void {
    		ended = true;
    	}
    }
}
