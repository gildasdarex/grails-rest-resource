
description("Creates a new rest-resource class") {
    usage "grails create-rest-resource [RESTRESOURCE NAME]"
    argument name:'RestResource Name', description:"The name of the RestResource"
}

model = model( args[0] )
render  template:"RestResource.groovy",
        destination: file( "grails-app/restresource/$model.packagePath/${model.simpleName}RestResource.groovy"),
        model: model
