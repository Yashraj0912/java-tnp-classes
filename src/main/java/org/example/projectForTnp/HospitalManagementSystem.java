package org.example.projectForTnp;

import java.util.*;

// Abstraction
abstract class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void display();
}

// Inheritance
class Patient extends Person {
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }

    // Polymorphism (method overriding)
    @Override
    public void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}

class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    @Override
    public void display() {
        System.out.println("Doctor ID: " + id + ", Name: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }
}

// Interface (Abstraction)
interface Appointment {
    void bookAppointment();
}

// Implements interface
class Hospital implements Appointment {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void showPatients() {
        for (Patient p : patients) {
            p.display();
        }
    }

    public void showDoctors() {
        for (Doctor d : doctors) {
            d.display();
        }
    }

    // Polymorphism (method overloading)
    public void search(int id) {
        for (Patient p : patients) {
            if (p.id == id) {
                p.display();
                return;
            }
        }
        System.out.println("Patient not found");
    }

    public void search(String name) {
        for (Doctor d : doctors) {
            if (d.name.equalsIgnoreCase(name)) {
                d.display();
                return;
            }
        }
        System.out.println("Doctor not found");
    }

    @Override
    public void bookAppointment() {
        System.out.println("Appointment booked successfully!");
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            try {
                System.out.println("\n--- Hospital Management System ---");
                System.out.println("1. Add Patient");
                System.out.println("2. Add Doctor");
                System.out.println("3. Show Patients");
                System.out.println("4. Show Doctors");
                System.out.println("5. Search Patient by ID");
                System.out.println("6. Search Doctor by Name");
                System.out.println("7. Book Appointment");
                System.out.println("8. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int pid = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Name: ");
                        String pname = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int page = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Disease: ");
                        String disease = sc.nextLine();

                        hospital.addPatient(new Patient(pid, pname, page, disease));
                        break;

                    case 2:
                        System.out.print("Enter ID: ");
                        int did = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Name: ");
                        String dname = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int dage = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter Specialization: ");
                        String spec = sc.nextLine();

                        hospital.addDoctor(new Doctor(did, dname, dage, spec));
                        break;

                    case 3:
                        hospital.showPatients();
                        break;

                    case 4:
                        hospital.showDoctors();
                        break;

                    case 5:
                        System.out.print("Enter Patient ID: ");
                        int sid = sc.nextInt();
                        hospital.search(sid);
                        break;

                    case 6:
                        System.out.print("Enter Doctor Name: ");
                        String sname = sc.nextLine();
                        hospital.search(sname);
                        break;

                    case 7:
                        hospital.bookAppointment();
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter correct data.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

