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
 * THE GENERATOR. CHANGE INSTEAD THE INHERITED CLASS (Person.as).
 */

package org.granite.test.tide.data {

    import flash.utils.ByteArray;
    import flash.utils.IDataInput;
    import flash.utils.IDataOutput;
    
    import mx.collections.ArrayCollection;
    import mx.collections.ListCollectionView;
    
    import org.granite.meta;
    import org.granite.test.tide.AbstractEntity;
    import org.granite.tide.IEntityManager;
    import org.granite.tide.IPropertyHolder;
    import org.granite.util.Enum;

    use namespace meta;

    [Managed]
    [RemoteClass(alias="org.granite.test.tide.DocumentList")]
    public class DocumentList extends AbstractEntity {

		private var _documents:ListCollectionView = new ArrayCollection();
        
        		
        public function set documents(value:ListCollectionView):void {
			_documents = value;
        }
		[Lazy]
        public function get documents():ListCollectionView {
            return _documents;
        }

        override meta function merge(em:IEntityManager, obj:*):void {
            var src:DocumentList = DocumentList(obj);
            super.meta::merge(em, obj);
            if (meta::isInitialized()) {
				em.meta_mergeExternal(src._documents, _documents, null, this, 'documents', function setter(o:*):void{_documents = o as ListCollectionView}) as ListCollectionView;
            }
        }

        override public function readExternal(input:IDataInput):void {
            super.readExternal(input);
            if (meta::isInitialized()) {
				_documents = input.readObject() as ListCollectionView;
            }
        }

        override public function writeExternal(output:IDataOutput):void {
            super.writeExternal(output);
            if (meta::isInitialized()) {
				output.writeObject((_documents is IPropertyHolder) ? IPropertyHolder(_documents).object : _documents);
            }
        }
    }
}
