# Aware Interface Spring Implementation
### Create Project
    mvn archetype:generate -DgroupId=com.spring.core -DartifactId=aware-interface -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

#### Remove all default packages and classes
    java package 
    test package

### Setup project
    crete package 
        com.awareinterfaces.beans
        com.awareinterfaces.test
    create resources folder under main
    create package under java and resources
    src
        |- main
            |- java
                |- com.awareinterfaces.test
                |- com.awareinterfaces.beans
            |- resources
                |- com.awareinterfaces.test
                    application-context.xml
        |- test

Create Spring bean configuration file 
- [Checkout util schema](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html).
