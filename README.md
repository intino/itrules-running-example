# Template-Based Code Generation (TBCG) with itrules

In this section, we will provide a practical example of how to use the Template-Based Code Generation (TBCG) tool with itrules in a Maven project. This example will guide you through creating a Maven project, including the necessary dependencies, and utilizing itrules to generate code from a template.

## Step 1: Create a Maven Project
Create a new Maven project in your preferred development environment. Ensure that Maven is installed and configured correctly.

## Step 2: Include the itrules Library in the POM
Edit the [pom.xml](pom.xml?ts=2) file to include the repository and the itrules dependency:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>tbcg-example</artifactId>
  <version>1.0-SNAPSHOT</version>
  <repositories>
    <repository>
      <id>intino-repo</id>
      <url>https://artifactory.intino.io/artifactory/releases</url>
    </repository>
  </repositories>
  <dependencies>
    <dependency>
      <groupId>io.intino.itrules</groupId>
      <artifactId>dsl</artifactId>
      <version>1.1.1</version>
    </dependency>
  </dependencies>
</project>
```

## Step 3: Create a Template File

Create a template file named [Form.itr](src/main/resources/Form.itr?ts=2)  in your project resources and fill it. For more examples and detailed instructions on how to structure .itr templates, you can refer to the examples section in the main itrules repository.

## Step 4: Create a Class to Build the Frame

Create a Java class [Main.java](src/main/java/Main.java?ts=2) to build the frame that will be rendered using the template.

## Step 5: Render the Frame Using the Template

The code in Main.java demonstrates how to call the itrules engine to render the frame using the template and obtain the result. Simply run the main class and the result is shown in the console.

## Additional Tools: itrules Plugin for IntelliJ IDEA

If you are using IntelliJ IDEA, you can install the itrules plugin which provides:
* Syntax highlighting for .itr files
* Assisted creation of templates
* Transformation of itr templates to Java representation, which can significantly improve the performance of execution.

This plugin is very useful for improving the efficiency and performance of template creation and execution.