4.2 Displaying Date in Servlet
------------------------------
In this example we are going to show how we can display a current date and time on our browser. It is very easy to display it on our browser by using the Date class of the java.util package.
https://github.com/s2a130050131537/ajava.git

4.4 A Holistic counter in Servlet
---------------------------------
In this program we are going to make a such a servlet which will count the number of times it has been accessed and the number of threads created by the server.
In this example firstly we are going to create one class named as HolisticCounterInServlet. Now declare a variable counter of int with initial value 0, the value of this counter will be different for each servlet and create a Hashtable object. This object will be shared by all the threads in the container. Inside the doGet() method use the method getWriter() method of the response object which will return the PrintWriter object. 
![2](https://cloud.githubusercontent.com/assets/16952688/13042800/370650dc-d3e9-11e5-8e76-66558f12ef10.png)

4.8 Dice Roller
---------------
We are going to make one program on the dice roller in which the number in the dice will be selected randomly.
To make a program over this firstly we need to make a class DiceRoller in which we will have a doGet() method in which we will have our application logic. To make the dice working randomly use the random() method of the class java.lang.Math. To print the number on the browser call the method getWriter() of the response object which will return the PrintWriter object. Now by the object of the PrintWriter class print the values of the dice on the browser. 
![1](https://cloud.githubusercontent.com/assets/16952688/13043034/7aa24f74-d3eb-11e5-9dd1-c9766fbacd0d.png)


4.12 Time Updater in Servlet
----------------------------
In this program we are going to make one program on servlet which will keep on updating the time in every second and the result will be displayed to you.
To make this servlet firstly we need to make a class named TimeUpdater.  The name of the class should be such that it becomes easy to understand what the program is going to do. Call the method getWriter() method of the response object which will return a PrintWriter object. Use the method getHeader() of the response object to add a new header. We can also use setHeader() in place of getHeader(). The setHeader() method overrides the previous set header. Now by using the PrintWriter object display the result on the browser.
![1](https://cloud.githubusercontent.com/assets/16952688/13043458/3f3afe88-d3ee-11e5-8103-c3822015bdc7.png)

4.13 Send Redirect in Servlet
-----------------------------
When we want that someone else should handle the response of our servlet, then there we should use sendRedirect() method.
In send Redirect whenever the client makes any request it goes to the container, there the container decides whether the concerned servlet can handle the request or not. If not then the servlet decides that the request can be handle by other servlet or jsp. Then the servlet calls the sendRedirect() method of the response object and sends back the response to the browser along with the status code. Then the browser sees the status code and look for that servlet which can now handle the request. Again the browser makes a new request, but with the name of that servlet which can now handle the request and the result will be displayed to you by the browser. In all this process the client is unaware of the processing.
In this example we are going to make one html in which we will submit the user name and his password. The controller will check if the password entered by the user is correct or not. If the password entered by the user is correct then the servlet will redirect the request to the other servlet which will handle the request. If the password entered by the user is wrong then the request will be forwarded to the html form.

![2](https://cloud.githubusercontent.com/assets/16952688/13043872/ebbe978a-d3f0-11e5-9a92-1e20813dbe44.png)
![1](https://cloud.githubusercontent.com/assets/16952688/13043873/ebc60060-d3f0-11e5-9b9e-5ce52c993892.png)


4.16 Session Last Accessed Time Example
---------------------------------------
This example illustrates to find current  access time of session  and last access time of session. Sessions are used to maintain state and user identity across multiple page requests. An implementation of HttpSession represents the server's view of the session. The server considers a session to be new until it has been joined by the client. Until the client joins the session, isNew() method returns true.

![1](https://cloud.githubusercontent.com/assets/16952688/14291595/da68b200-fb81-11e5-993a-376fa014fc45.PNG)

4.19
![1](https://cloud.githubusercontent.com/assets/16952688/14291637/0d95f2c8-fb82-11e5-959f-6004d2705a42.PNG)
![2](https://cloud.githubusercontent.com/assets/16952688/14291638/0d983722-fb82-11e5-81f4-b7e1e20837af.PNG)
4.20
![1](https://cloud.githubusercontent.com/assets/16952688/14291709/61cad886-fb82-11e5-8c6e-4d490e767fc9.PNG)
4.21
![2](https://cloud.githubusercontent.com/assets/16952688/14291755/a6fb052a-fb82-11e5-9743-078e6c4c8709.PNG)
![3](https://cloud.githubusercontent.com/assets/16952688/14291753/a6f9a4c8-fb82-11e5-874c-fc7ecf902edc.PNG)
![1](https://cloud.githubusercontent.com/assets/16952688/14291754/a6fa74de-fb82-11e5-91b3-6ed3a4203efc.PNG)
4.22
![1](https://cloud.githubusercontent.com/assets/16952688/14291816/e41b1f08-fb82-11e5-9e56-f9b93f530496.PNG)
![2](https://cloud.githubusercontent.com/assets/16952688/14291814/e418a87c-fb82-11e5-8d12-80a7ce584cba.PNG)
![3](https://cloud.githubusercontent.com/assets/16952688/14291815/e41a8a2a-fb82-11e5-9b64-2043a93d50c8.PNG)
4.23
![1](https://cloud.githubusercontent.com/assets/16952688/14291885/24f71cd4-fb83-11e5-9e61-a0a94f492f5f.PNG)
![2](https://cloud.githubusercontent.com/assets/16952688/14291886/24f7a5c8-fb83-11e5-92f7-beb9ff9aaae2.PNG)

