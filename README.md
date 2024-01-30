
# Sunbase-Assignment

Hi! This is a Project for Sunbase company.

This project helps user to perform basic CRUD operations on their profiles and also shows the implementation of JWT for authentication and authorization purpose.




## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer apprentice at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot, MySQL.


# Classes and Instructions

This section contains information about the project and how to perform operations in the application.


## Controller Section

-   *This section contains a User Controller and a Auth Controller* :

* ### User Controller
    - This class contains various API endpoints that helps user to interact with the application resources. Some of the examples are :

    * @PostMapping("user/create")
    * @PutMapping("user/update-profile")
    * @GetMapping("user/users")
    * @GetMapping("user/user/{UserId}")
    * @DeleteMapping("/delete/{Id}")

* ### Auth Controller
    - This section is used to authenticate user and provide him a **JWT token**. This helps in securing our application so that only validated users are allowed to access it.

## Service Section

- *This section contains various classes each of which contains methods for buisness logics of the APIs*

* ### User Service Class

    * This class implements the logic of how user date is processed with application, like save, update and delete.

## Model Section

- *This section contains various models and a DTO which are used as tables to store data in our database.*

## Repository Section

- *This section contains Repository for our user model.*


## Security Section

- This section helps us implement and configure Spring Security according to our needs. This helps in securing our app and provided authentication service to the application. Some examples of the classes implemented in this section are :

* #### JwtAuthenticationEntry Point
* #### JwtAuthenticationFilter
* #### JwtHelper


## Database Design
- *Here we have used Relational Data to store data.*

- *We have used MYSQL and the database is hosted on a local server.*
## Guide

- This is the way to create a user, you just need to pass the JSON.
  
![PostMapping - Create](https://github.com/Nikhil-Sharma-CS/Sunbase-Assignment/assets/72157075/2ae981c7-22fb-4d35-ac48-cfdccc3f94bf)

- This is how you can login, and it will give you the JWT token
  
![PostMapping - Login](https://github.com/Nikhil-Sharma-CS/Sunbase-Assignment/assets/72157075/db2097bb-595f-41d0-b8bd-aed04561a115)

- This is how you can get list of users, but first you need to pass your token as bearer in the request.
  
![GetMapping - Users](https://github.com/Nikhil-Sharma-CS/Sunbase-Assignment/assets/72157075/16b7ceeb-e497-48da-baa0-10179f031de2)

- This is what happens when you pass wrong bearer, it shows error message
  
![GetMapping - User by Id](https://github.com/Nikhil-Sharma-CS/Sunbase-Assignment/assets/72157075/63ab9789-88b1-4472-b7ef-0c9f608c25ae)

- This is how you can delete a user, by passing its ID in path variable and your token in request.
  
![DeleteMapping - Users](https://github.com/Nikhil-Sharma-CS/Sunbase-Assignment/assets/72157075/a49bcf80-e28f-4db7-8fc4-54392a4b27e2)






- This section is contains screenshots of how you can access api endpoints in postman, and what will be the result of those.
## Summary

*In summary, this application helps us to understand how we can implement JWT and use Spring Security to secure our application from unwanted access.*
## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)


