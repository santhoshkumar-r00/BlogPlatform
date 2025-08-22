# Blog Platform 📝  

A simple **Java Web Application** built using **Servlets, JSP, JDBC, and MySQL**.  
This project demonstrates a mini blog platform where users can **sign up, sign in, create posts, and log out**.

## 🚀 Features
- User authentication (Sign Up, Sign In, Logout)  
- Blog post creation and viewing  
- Responsive UI with modern CSS (gradient backgrounds, hover effects, smooth animations)  
- Session management  
- JDBC integration with MySQL  

---

## 🛠️ Tech Stack
- **Java (JDK 8/11)**  
- **Servlets & JSP**  
- **Apache Tomcat 9.0+**  
- **MySQL Database**  
- **JDBC**  
- **HTML, CSS (Internal Styling)**  

---

## 📂 Project Structure

        BlogPlatform/
          ├── src/main/java/com/
          │ ├── signinServlet/SigninServlet.java
          │ ├── signupServlet/SignupServlet.java
          │ ├── logoutServlet/LogoutServlet.java
          │
          ├── src/main/webapp/
          │ ├── index.html
          │ ├── signin.html
          │ ├── signup.html
          │ ├── main.html
          │ ├── success.html
          │ ├── logout.html
          │ ├── WEB-INF/web.xml

---

## Database Setup

     CREATE DATABASE blogapplication;

     CREATE TABLE user (
          Name VARCHAR(200) NOT NULL,
          Email VARCHAR(200) PRIMARY KEY,
          Work VARCHAR(200),
          Password VARCHAR(200) NOT NULL
      );

---

## Add JDBC Driver
   mysql-connector-j-X.X.X.jar (https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.1.0/)

---

## TomCat Server

      Apache TomCat Server v9(https://tomcat.apache.org/download-90.cgi)



        
