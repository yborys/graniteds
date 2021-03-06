/*
 *   GRANITE DATA SERVICES
 *   Copyright (C) 2006-2015 GRANITE DATA SERVICES S.A.S.
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
package org.granite.test.tide.data {

    import flash.utils.ByteArray;
    import flash.utils.IDataInput;
    import flash.utils.IDataOutput;
    
    import mx.collections.ListCollectionView;
    
    import org.granite.meta;
    import org.granite.test.tide.AbstractEntity;
    import org.granite.tide.IEntityManager;
    import org.granite.tide.IPropertyHolder;
    import org.granite.util.Enum;

    use namespace meta;

    [Managed]
    [RemoteClass(alias="org.granite.test.tide.Account2")]
    public class Account2 extends AbstractEntity {

        private var _alerts:ListCollectionView;
        private var _name:String;
        
        
        public function set alerts(value:ListCollectionView):void {
			_alerts = value;
        }
		[Lazy]
        public function get alerts():ListCollectionView {
            return _alerts;
        }

        public function set name(value:String):void {
            _name = value;
        }
        public function get name():String {
            return _name;
        }

        override meta function merge(em:IEntityManager, obj:*):void {
            var src:Account2 = Account2(obj);
            super.meta::merge(em, obj);
            if (meta::isInitialized()) {
                em.meta_mergeExternal(src._alerts, _alerts, null, this, 'alerts', function setter(o:*):void{_alerts = o as ListCollectionView}) as ListCollectionView;
                em.meta_mergeExternal(src._name, _name, null, this, 'name', function setter(o:*):void{_name = o as String}) as String;
            }
        }

        override public function readExternal(input:IDataInput):void {
            super.readExternal(input);
            if (meta::isInitialized()) {
				_alerts = input.readObject() as ListCollectionView;
                _name = input.readObject() as String;
            }
        }

        override public function writeExternal(output:IDataOutput):void {
            super.writeExternal(output);
            if (meta::isInitialized()) {
                output.writeObject((_alerts is IPropertyHolder) ? IPropertyHolder(_alerts).object : _alerts);
                output.writeObject((_name is IPropertyHolder) ? IPropertyHolder(_name).object : _name);
            }
        }
    }
}
