/**
 * Generated by Gas3 v1.1.0 (Granite Data Services) on Sat Jul 26 17:58:20 CEST 2008.
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERRIDDEN EACH TIME YOU USE
 * THE GENERATOR. CHANGE INSTEAD THE INHERITED CLASS (Contact.as).
 */

package org.granite.test.tide.framework {
	
	import org.granite.tide.BaseContext;
	

	[Name("myComponentConversation", scope="conversation")]
    public class MyComponentConversationGDS1012 {
    	
    	[In]
    	public var myComponent:MyComponent;
		
		[Inject]
		public var myComponentY:MyComponent2;
		
		[Inject]
		public var myComponentZ:IMyComponent2;
    }
}