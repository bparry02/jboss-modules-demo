JBoss EAP Quickstart: Dynamic EAR Module
========================================
Author: Bryan Parry  
Level: Intermediate  
Technologies: Dynamic JBoss Modules  
Summary: The `dynamic-ear` quickstart demonstrates how to deploy and depend on a dynamic EAR module with JBoss EAP  
Target Product: JBoss EAP  
Source:   


What is it?
-----------

The `dynamic-ear` quickstart demonstrates how to deploy and depend on a dynamic module with JBoss EAP.

Dynamic modules are a useful way of sharing common libraries among applications when the libraries
change often. An example is a "common-utilities" JAR, or a JAR that contains domain objects that are shared.
Dynamic modules are easier to update than static modules.

When several common libraries must be deployed dynamically, they can be packaged and deployed as a single EAR.
This is useful if some of the common libraries have dependencies of their own that must be available at runtime.


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
3. Type this command to build the dynamic-ear-common-utils, dynamic-ear-common-module, and dynamic-ear-web archives:

        mvn clean install

4. Start the JBoss EAP CLI tool with:

        For Linux:   EAP_HOME/bin/jboss-cli.sh -c
        For Windows: EAP_HOME\bin\standalone.bat

5. Using the JBoss CLI, deploy the dynamic-ear-common-module EAR. Make sure to specify the runtime name so the web application
can depend on a consistent dynamic module name (as opposed to the EAR filename, which will
include the version number by default).

        deploy common-module/target/dynamic-ear-common-module-1.0.0-SNAPSHOT.ear --runtime-name=dynamic-ear-common-module.ear

6. Using the JBoss CLI, deploy the dynamic-web WAR.

        deploy web/target/dynamic-ear-web.war


Access the application 
---------------------

The application will be running at the following URL <http://localhost:8080/dynamic-ear-web/>.

A message will appear stating `Hello WORLD`. Note that "WORLD" is capitalized using the common-utils.jar that is
packaged in the dynamic-ear-common-module.ear that is deployed as a dynamic module.


Undeploy the application and dynamic module
-------------------------------------------

1. Using the JBoss CLI, undeploy the application with:

        undeploy dynamic-ear-web.war

2. Using the JBoss CLI, undeploy the dynamic module with:

        undeploy dynamic-ear-common-module-1.0.0-SNAPSHOT.ear
