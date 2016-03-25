/*
 * Copyright (c) 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.darex.rest

import grails.util.GrailsClassUtils;
import groovy.lang.Closure;
import org.grails.core.AbstractGrailsClass;

import java.util.HashMap;
import java.util.Map;



/**
 * Grails artifact class which represents a Quartz job.
 *
 * @author Micha?? K??ujszo
 * @author Marcel Overdijk
 * @author Sergey Nebolsin (nebolsin@gmail.com)
 * @since 0.1
 */
public class DefaultGrailsRestResourceClass extends AbstractGrailsClass implements GrailsRestResourceClass {

  public static final String RESTRESOURCE = "RestResource";

  String HOST = "RESTFUL_SERVICE_URL"

  public DefaultGrailsRestResourceClass(Class clazz) {
      super(clazz, RESTRESOURCE);
  }

  public Object save() {
      println "save"
  }

  public Object list() {
      println "list"
  }

  public Object get() {
      println "get"
  }

  public Object update() {
      println "update"
  }

  public boolean delete() {
      println "delete"
  }

}
