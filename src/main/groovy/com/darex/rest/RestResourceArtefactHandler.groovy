package com.darex.rest

import grails.core.ArtefactHandlerAdapter
import java.util.regex.Pattern
import static org.grails.io.support.GrailsResourceUtils.GRAILS_APP_DIR
import static org.grails.io.support.GrailsResourceUtils.REGEX_FILE_SEPARATOR

class RestResourceArtefactHandler extends ArtefactHandlerAdapter {

  static final String TYPE = "RestResource"
  public static Pattern RESTRESOURCE_PATH_PATTERN = Pattern.compile(".+" + REGEX_FILE_SEPARATOR + GRAILS_APP_DIR + REGEX_FILE_SEPARATOR + "RestResource" + REGEX_FILE_SEPARATOR + "(.+)\\.(groovy)");

  public RestResourceArtefactHandler() {
      super(TYPE, GrailsRestResourceClass.class, DefaultGrailsRestResourceClass.class, TYPE)
  }
}
