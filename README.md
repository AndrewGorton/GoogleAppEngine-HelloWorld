Google AppEngine - Hello World
==============================

## Background
A simple project to produce Hello World from a Java servlet, and host it on Google's AppEngine infrastructure.

## Requirements
Built on a Mac using:-
* JDK 1.7
* Maven 3.1.1

## Usage
Try `mvn appengine:devserver` to start a local server.

To deploy to Google's AppEngine proper, you'll need a Google App Engine account, and an AppID. Edit
the src/main/webapp/WEB-INF/appengine-web.xml and put the application id in the <application> tag. Then you
can deploy with `mvn appengine:update`.

