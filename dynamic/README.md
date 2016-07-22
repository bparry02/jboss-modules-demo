JBoss EAP Quickstart: Dynamic Module
====================================
Author: Bryan Parry  
Level: Intermediate  
Technologies: Dynamic JBoss Modules  
Summary: The `dynamic` quickstart demonstrates how to deploy and depend on a dynamic modle with JBoss EAP  
Target Product: JBoss EAP  
Source:   


What is it?
-----------

The `dynamic` quickstart demonstrates how to deploy and depend on a dynamic modle with JBoss EAP.

Dynamic modules are a useful way of sharing common libraries among applications when the libraries
change often. An example is a "common-utilities" JAR or a JAR that contains domain objects that are shared. Dynamic modules are easier to update than static modules.


System Requirements
-------------------

 * JBoss EAP 6.4 or later
 * Maven 3.2 or later (http://maven.apache.org/)
 * Java 7


Use of EAP_HOME
---------------

In the following instructions, replace `EAP_HOME` with the actual path to your JBoss EAP installation.


Start the JBoss EAP Server
-------------------------

1. Open a command prompt and navigate to the root of the JBoss EAP directory.
2. The following shows the command line to start the server:

        For Linux:   EAP_HOME/bin/standalone.sh
        For Windows: EAP_HOME\bin\standalone.bat


Build and Deploy the Quickstart
--------

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command prompt and navigate to the root directory of this quickstart.
3. Type this command to build the dynamic-common-utils and dynamic-web archives:

        mvn clean install

4. Start the JBoss EAP CLI tool with:

        For Linux:   EAP_HOME/bin/jboss-cli.sh -c
        For Windows: EAP_HOME\bin\standalone.bat

5. Using the JBoss CLI, deploy the dynamic-common-utils JAR. Make sure to specify the runtime name so the web application
can depend on a consistent dynamic module name (as opposed to the JAR filename, which will
include the version number).

        deploy common-utils/target/dynamic-common-utils-1.0.0-SNAPSHOT.jar --runtime-name=dynamic-common-utils.jar

6. Using the JBoss CLI, deploy the dynamic-web WAR.

        deploy web/target/dynamic-web.war


Access the application 
---------------------

The application will be running at the following URL <http://localhost:8080/dynamic-web/>.

A message will appear stating `Hello WORLD`. Note that "WORLD" is capitalized using the common-utils.jar that is deployed as a dynamic module.


Undeploy the application and dynamic module
-------------------------------------------

1. Using the JBoss CLI, undeploy the application with:

        undeploy dynamic-web.war

2. Using the JBoss CLI, undeploy the dynamic module with:

        undeploy dynamic-common-utils-1.0.0-SNAPSHOT.jar
