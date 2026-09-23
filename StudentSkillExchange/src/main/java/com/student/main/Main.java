package com.student.main;

import java.util.Scanner;

import com.student.model.Student;
import com.student.model.StudentSkill;
import com.student.model.ExchangeRequest;
import com.student.model.Session;
import com.student.model.Feedback;

import com.student.service.StudentService;
import com.student.service.StudentSkillService;
import com.student.service.SkillService;
import com.student.service.MatchingService;
import com.student.service.ExchangeRequestService;
import com.student.service.SessionService;
import com.student.service.FeedbackService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= SERVICES =================

        StudentService studentService =
                new StudentService();

        StudentSkillService studentSkillService =
                new StudentSkillService();

        SkillService skillService =
                new SkillService();

        MatchingService matchingService =
                new MatchingService();

        ExchangeRequestService exchangeRequestService =
                new ExchangeRequestService();

        SessionService sessionService =
                new SessionService();

        FeedbackService feedbackService =
                new FeedbackService();

        // ================= MAIN MENU =================

        while (true) {

            System.out.println(
                    "\n===== STUDENT SKILL EXCHANGE SYSTEM =====");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            // ================= REGISTER =================

            case 1:

                Student student = new Student();

                System.out.print("Enter Name: ");
                student.setName(sc.nextLine());

                System.out.print("Enter Email: ");
                student.setEmail(sc.nextLine());

                System.out.print("Enter Password: ");
                student.setPassword(sc.nextLine());

                System.out.print("Enter Mobile: ");
                student.setMobile(sc.nextLine());

                System.out.print("Enter Course: ");
                student.setCourse(sc.nextLine());

                System.out.print("Enter Year: ");
                student.setYear(sc.nextInt());

                sc.nextLine();

                studentService.registerStudent(student);

                break;

            // ================= LOGIN =================

            case 2:

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Password: ");
                String password = sc.nextLine();

                Student loggedInStudent =
                        studentService.loginStudent(
                                email,
                                password);

                if (loggedInStudent != null) {

                    System.out.println(
                            "\nLogin Successful");

                    System.out.println(
                            "Welcome "
                            + loggedInStudent.getName());

                    // ================= STUDENT MENU =================

                    while (true) {

                        System.out.println(
                                "\n===== STUDENT MENU =====");

                        System.out.println("1. View Profile");
                        System.out.println("2. Update Profile");
                        System.out.println("3. View Available Skills");
                        System.out.println("4. Add Skill");
                        System.out.println("5. View My Skills");
                        System.out.println("6. Find Skill Matches");
                        System.out.println("7. Send Exchange Request");
                        System.out.println("8. View My Requests");
                        System.out.println("9. Accept/Reject Request");
                        System.out.println("10. Schedule Session");
                        System.out.println("11. View Sessions");
                        System.out.println("12. Update Session Status");
                        System.out.println("13. Give Feedback");
                        System.out.println("14. View Feedback");
                        System.out.println("15. Logout");

                        System.out.print(
                                "Enter your choice: ");

                        int studentChoice =
                                sc.nextInt();

                        sc.nextLine();

                        switch (studentChoice) {

                        // ================= VIEW PROFILE =================

                        case 1:

                            System.out.println(
                                    "\n===== MY PROFILE =====");

                            System.out.println(
                                    "ID: "
                                    + loggedInStudent
                                            .getStudentId());

                            System.out.println(
                                    "Name: "
                                    + loggedInStudent
                                            .getName());

                            System.out.println(
                                    "Email: "
                                    + loggedInStudent
                                            .getEmail());

                            System.out.println(
                                    "Mobile: "
                                    + loggedInStudent
                                            .getMobile());

                            System.out.println(
                                    "Course: "
                                    + loggedInStudent
                                            .getCourse());

                            System.out.println(
                                    "Year: "
                                    + loggedInStudent
                                            .getYear());

                            break;

                        // ================= UPDATE PROFILE =================

                        case 2:

                            System.out.print(
                                    "Enter New Name: ");

                            loggedInStudent.setName(
                                    sc.nextLine());

                            System.out.print(
                                    "Enter New Mobile: ");

                            loggedInStudent.setMobile(
                                    sc.nextLine());

                            System.out.print(
                                    "Enter New Course: ");

                            loggedInStudent.setCourse(
                                    sc.nextLine());

                            System.out.print(
                                    "Enter New Year: ");

                            loggedInStudent.setYear(
                                    sc.nextInt());

                            sc.nextLine();

                            studentService.updateStudent(
                                    loggedInStudent);

                            break;

                        // ================= AVAILABLE SKILLS =================

                        case 3:

                            System.out.println(
                                    "\n===== AVAILABLE SKILLS =====");

                            skillService.getAllSkills();

                            break;

                        // ================= ADD SKILL =================

                        case 4:

                            StudentSkill studentSkill =
                                    new StudentSkill();

                            studentSkill.setStudentId(
                                    loggedInStudent
                                            .getStudentId());

                            System.out.print(
                                    "Enter Skill ID: ");

                            studentSkill.setSkillId(
                                    sc.nextInt());

                            sc.nextLine();

                            System.out.print(
                                    "Enter Skill Type "
                                    + "(TEACH/LEARN): ");

                            studentSkill.setSkillType(
                                    sc.nextLine()
                                            .toUpperCase());

                            studentSkillService
                                    .addStudentSkill(
                                            studentSkill);

                            break;

                        // ================= VIEW MY SKILLS =================

                        case 5:

                            System.out.println(
                                    "\n===== MY SKILLS =====");

                            studentSkillService
                                    .getSkillsByStudentId(
                                            loggedInStudent
                                                    .getStudentId());

                            break;

                        // ================= FIND MATCHES =================

                        case 6:

                            System.out.println(
                                    "\n===== SKILL MATCHES =====");

                            matchingService.findMatches(
                                    loggedInStudent
                                            .getStudentId());

                            break;

                        // ================= SEND REQUEST =================

                        case 7:

                            ExchangeRequest request =
                                    new ExchangeRequest();

                            request.setSenderId(
                                    loggedInStudent
                                            .getStudentId());

                            System.out.print(
                                    "Enter Receiver Student ID: ");

                            request.setReceiverId(
                                    sc.nextInt());

                            System.out.print(
                                    "Enter Skill ID: ");

                            request.setSkillId(
                                    sc.nextInt());

                            sc.nextLine();

                            request.setStatus(
                                    "PENDING");

                            request.setRequestDate(
                                    java.sql.Date.valueOf(
                                            java.time.LocalDate
                                                    .now()));

                            exchangeRequestService
                                    .sendRequest(request);

                            break;

                        // ================= VIEW REQUESTS =================

                        case 8:

                            System.out.println(
                                    "\n===== MY REQUESTS =====");

                            exchangeRequestService
                                    .getRequestsByReceiverId(
                                            loggedInStudent
                                                    .getStudentId());

                            break;

                        // ================= ACCEPT / REJECT =================

                        case 9:

                            System.out.print(
                                    "Enter Request ID: ");

                            int requestId =
                                    sc.nextInt();

                            sc.nextLine();

                            System.out.print(
                                    "Enter Status "
                                    + "(ACCEPTED/REJECTED): ");

                            String status =
                                    sc.nextLine()
                                            .toUpperCase();

                            exchangeRequestService
                                    .updateRequestStatus(
                                            requestId,
                                            status);

                            break;

                        // ================= SCHEDULE SESSION =================

                        case 10:

                            Session session =
                                    new Session();

                            System.out.print(
                                    "Enter Request ID: ");

                            session.setRequestId(
                                    sc.nextInt());

                            sc.nextLine();

                            System.out.print(
                                    "Enter Session Date "
                                    + "(YYYY-MM-DD): ");

                            String sessionDate =
                                    sc.nextLine();

                            session.setSessionDate(
                                    java.sql.Date.valueOf(
                                            sessionDate));

                            System.out.print(
                                    "Enter Session Time "
                                    + "(HH:MM:SS): ");

                            String sessionTime =
                                    sc.nextLine();

                            session.setSessionTime(
                                    java.sql.Time.valueOf(
                                            sessionTime));

                            System.out.print(
                                    "Enter Mode "
                                    + "(ONLINE/OFFLINE): ");

                            session.setMode(
                                    sc.nextLine()
                                            .toUpperCase());

                            session.setStatus(
                                    "SCHEDULED");

                            sessionService
                                    .scheduleSession(
                                            session);

                            break;

                        // ================= VIEW SESSIONS =================

                        case 11:

                            System.out.println(
                                    "\n===== MY SESSIONS =====");

                            System.out.print(
                                    "Enter Request ID: ");

                            int viewRequestId =
                                    sc.nextInt();

                            sc.nextLine();

                            sessionService
                                    .getSessionsByRequestId(
                                            viewRequestId);

                            break;

                        // ================= UPDATE SESSION =================

                        case 12:

                            System.out.print(
                                    "Enter Session ID: ");

                            int sessionId =
                                    sc.nextInt();

                            sc.nextLine();

                            System.out.print(
                                    "Enter Status "
                                    + "(SCHEDULED/COMPLETED/CANCELLED): ");

                            String sessionStatus =
                                    sc.nextLine()
                                            .toUpperCase();

                            sessionService
                                    .updateSessionStatus(
                                            sessionId,
                                            sessionStatus);

                            break;

                        // ================= GIVE FEEDBACK =================

                        case 13:

                            Feedback feedback =
                                    new Feedback();

                            System.out.print(
                                    "Enter Session ID: ");

                            feedback.setSessionId(
                                    sc.nextInt());

                            System.out.print(
                                    "Enter Rating "
                                    + "(1-5): ");

                            feedback.setRating(
                                    sc.nextInt());

                            sc.nextLine();

                            feedback.setStudentId(
                                    loggedInStudent
                                            .getStudentId());

                            System.out.print(
                                    "Enter Comment: ");

                            feedback.setComment(
                                    sc.nextLine());

                            feedbackService
                                    .addFeedback(
                                            feedback);

                            break;

                        // ================= VIEW FEEDBACK =================

                        case 14:

                            System.out.println(
                                    "\n===== SESSION FEEDBACK =====");

                            System.out.print(
                                    "Enter Session ID: ");

                            int feedbackSessionId =
                                    sc.nextInt();

                            sc.nextLine();

                            feedbackService
                                    .getFeedbackBySessionId(
                                            feedbackSessionId);

                            break;

                        // ================= LOGOUT =================

                        case 15:

                            System.out.println(
                                    "Logged Out Successfully");

                            break;

                        default:

                            System.out.println(
                                    "Invalid Choice");
                        }

                        // Exit student menu after logout

                        if (studentChoice == 15) {

                            break;
                        }
                    }

                } else {

                    System.out.println(
                            "Invalid Email or Password");
                }

                break;

            // ================= EXIT =================

            case 3:

                System.out.println(
                        "Thank You!");

                sc.close();

                return;

            default:

                System.out.println(
                        "Invalid Choice");
            }
        }
    }
}