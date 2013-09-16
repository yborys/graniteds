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
/* Generated By:JavaCC: Do not edit this line. SelectorParserConstants.java */
/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.granite.gravity.selector;

public interface SelectorParserConstants {

  int EOF = 0;
  int LINE_COMMENT = 6;
  int BLOCK_COMMENT = 7;
  int NOT = 8;
  int AND = 9;
  int OR = 10;
  int BETWEEN = 11;
  int LIKE = 12;
  int ESCAPE = 13;
  int IN = 14;
  int IS = 15;
  int TRUE = 16;
  int FALSE = 17;
  int NULL = 18;
  int XPATH = 19;
  int XQUERY = 20;
  int DECIMAL_LITERAL = 21;
  int HEX_LITERAL = 22;
  int OCTAL_LITERAL = 23;
  int FLOATING_POINT_LITERAL = 24;
  int EXPONENT = 25;
  int STRING_LITERAL = 26;
  int ID = 27;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<LINE_COMMENT>",
    "<BLOCK_COMMENT>",
    "\"NOT\"",
    "\"AND\"",
    "\"OR\"",
    "\"BETWEEN\"",
    "\"LIKE\"",
    "\"ESCAPE\"",
    "\"IN\"",
    "\"IS\"",
    "\"TRUE\"",
    "\"FALSE\"",
    "\"NULL\"",
    "\"XPATH\"",
    "\"XQUERY\"",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<STRING_LITERAL>",
    "<ID>",
    "\"=\"",
    "\"<>\"",
    "\">\"",
    "\">=\"",
    "\"<\"",
    "\"<=\"",
    "\"(\"",
    "\",\"",
    "\")\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
  };

}
