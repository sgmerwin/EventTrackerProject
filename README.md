## Event Tracker

#### Week 12 - 14 HW

### Overview

The project involved using REST services with the Spring Framework. 
The REST API provides an @RestController that indicates the data returned by the controller methods will be written into the response body. The REST API provides routes for each operations (@GetMapping, @PostMapping, @PutMapping and @DeleteMapping). 
An image of the project structure is as follows: 

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/project.png" width="300" height="500">

Here is a tables of REST API Endpoints: 

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/table.png" width="500" height="500">

The following are a collection of screenshots from Postman: 

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/create.png" width="500" height="500">

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/delete.png" width="500" height="500">

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/getbyid.png" width="500" height="500">

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/list.png" width="500" height="500">

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/update.png" width="500" height="500">

### Tech Used

Eclipse Spring Tool Suite and the Postman collaboration platform for API development. 

### Lessons Learned

We gained understanding of how to use the REST API and how it standardizes and automates basic CRUD operations. 

### Javascript Overview

An index html and a javascript file were added to the JPA - Spring Boot project. 
The js file uses an XMLHttpRequest to access the SQL database. 

The following image is a sreenshot of the overall CRUD application. A user can create a new event, update an event, or delete and event. 
There are also js functions that total all of the costs and totals all of the gallons. 

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/screenshot_event.png" width="300" height="800">

The following is a screenshot of a js function that lists all of the events in the SQL database. 
There is an interesting block of code in this. A series of buttons are created with the same class.
In a for loop each button is given a unique id and this unique id is referenced in a function call with a this.id
parameter. 

<img src="https://github.com/sgmerwin/EventTrackerProject/blob/master/listall.png" width="900" height="700">
