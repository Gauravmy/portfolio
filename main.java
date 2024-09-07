public class Portfolio {

    public static void main(String[] args) {
        // Personal Details
        String name = "G.S. Dhakad";
        String education = "Second-year B.Tech student, AI and Machine Learning";
        String university = "Your University Name";

        // Skills
        String[] skills = {"Java", "Python", "C++", "C", "JavaScript", "Web Development", "DSA", "AI/ML"};

        // Certifications
        String[] certifications = {
            "Great Learning: AIML Certification",
            "Coursera: Data Structures and Algorithms",
            "Microsoft: AI Fundamentals"
        };

        // Projects
        String[] projects = {
            "Smart EduConnect: A solution to reduce student dropout rates",
            "Unstoppable Coders and AI Tech Community: Founder and Leader",
            "National Level Hackathon Participant: December and January"
        };

        // Display Portfolio
        displayPortfolio(name, education, university, skills, certifications, projects);
    }

    public static void displayPortfolio(String name, String education, String university, String[] skills, String[] certifications, String[] projects) {
        System.out.println("=== Gaurav's Portfolio ===\n");

        System.out.println("Name: " + name);
        System.out.println("Education: " + education);
        System.out.println("University: " + university + "\n");

        System.out.println("Skills:");
        for (String skill : skills) {
            System.out.println(" - " + skill);
        }

        System.out.println("\nCertifications:");
        for (String certification : certifications) {
            System.out.println(" - " + certification);
        }

        System.out.println("\nProjects:");
        for (String project : projects) {
            System.out.println(" - " + project);
        }

        System.out.println("\nThank you for viewing my portfolio!");
    }
}
