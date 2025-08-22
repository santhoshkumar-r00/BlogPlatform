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

---

## 🖥️ Screenshots

![WhatsApp Image 2025-08-22 at 20 57 55_6504a018](https://github.com/user-attachments/assets/68e3b2fd-248c-450a-8988-7a0cd6868260)

![WhatsApp Image 2025-08-22 at 20 57 53_d621990e](https://github.com/user-attachments/assets/55a3883d-ca8b-442e-b6f4-9eb40b07084e)

![WhatsApp Image 2025-08-22 at 20 57 52_c96b89fd](https://github.com/user-attachments/assets/87d390fe-b6f3-413b-9bd1-f4be437aa879)

![WhatsApp Image 2025-08-22 at 20 57 54_b4ab14f3](https://github.com/user-attachments/assets/8ccc6047-6a68-439f-8abd-808389495eaa)

![WhatsApp Image 2025-08-22 at 20 57 56_02a6cc36](https://github.com/user-attachments/assets/fa672a6c-c7f5-480e-aa19-9f987fa5f6a7)   ![WhatsApp Image 2025-08-22 at 20 57 55_002c419b](https://github.com/user-attachments/assets/d757536e-862e-4694-97a8-e0cafd726576)






      
      
        
