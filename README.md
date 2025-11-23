Project Title: Nalanda e-Gyan Portal – Learning Management System (LMS)

Developed Using: NetBeans IDE  
Technologies Used: Java, JSP/Servlets, MySQL (or your DB), HTML/CSS, JDBC  
Project Type: Educational Web Application / LMS

------------------------------------------------------------
1. Introduction
------------------------------------------------------------
Nalanda e-Gyan Portal is a Learning Management System created to support
online education, digital content delivery, and student–teacher interaction.
The system provides a structured platform where students can access study
materials, view announcements, take quizzes, and track learning progress.
Teachers can upload content, manage courses, and evaluate student submissions.

This project was developed using NetBeans and follows an MVC design structure
for clear separation of logic, interface, and data operations.

------------------------------------------------------------
2. Key Features
------------------------------------------------------------
• User Authentication (Student, Teacher, Admin)  
• Dashboard for different user roles  
• Course Creation and Management  
• Study Material Uploads (PDF, Docs, Notes)  
• Assignment Upload & Submission Module  
• Notices / Announcements Section  
• Quiz/MCQ Module (optional if added)  
• Student Progress Tracking  
• Database-driven content management  
• Clean and responsive UI

------------------------------------------------------------
3. Project Structure
------------------------------------------------------------
• /src  
  - Java files (Servlets, Controllers, Models)  
• /web  
  - JSP pages, HTML, CSS, JavaScript  
• /WEB-INF  
  - web.xml configuration  
• /database  
  - SQL file for creating required tables  

NetBeans automatically handles build and deployment folders.

------------------------------------------------------------
4. Requirements
------------------------------------------------------------
Software:
• NetBeans IDE (recommended version: 8.x or newer)  
• JDK 8 or above  
• Apache Tomcat (or GlassFish Server) use XAMPP  
• MySQL / MariaDB  
• JDBC Connector

Hardware:
• Minimum 4 GB RAM  
• Basic Windows 10/11 PC or Laptop

------------------------------------------------------------
5. How to Run the Project
------------------------------------------------------------
1. Open NetBeans IDE.  
2. Go to File → Open Project → Select the project folder.  
3. Configure the database in MySQL (import provided .sql file).  
4. Update DB credentials in `DBConnection` or configuration file.  
5. Deploy the application on Apache Tomcat server.  
6. Run the project → The portal will open in your browser.

------------------------------------------------------------
6. Database Overview
------------------------------------------------------------
Main tables (may vary depending on your implementation):
• users  
• courses  
• materials  
• assignments  
• submissions  
• announcements  
• results / quizzes  

All tables are connected using standard relational design.

------------------------------------------------------------
7. Purpose of the Project
------------------------------------------------------------
The Nalanda e-Gyan LMS project aims to digitalize learning and provide a
centralized online platform for education. It supports:
• Remote learning  
• Digital content distribution  
• Better course management  
• Improved teacher–student collaboration  

Suitable for colleges, schools, and online learning platforms.

------------------------------------------------------------
8. Future Enhancements
------------------------------------------------------------
• Mobile App Integration  
• Live Class Scheduling  
• Video Lectures Support  
• Automated Evaluation System  
• Chat / Messaging System  
• AI-based recommendations for students  

------------------------------------------------------------
9. Developer Information
------------------------------------------------------------
Project Developer: [ANOOP]  
Institution: [AITH]  
Year/Semester: [3]  
------------------------------------------------------------

End of README
