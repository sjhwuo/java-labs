package org.example;

public class Hospital {
    String name;
    int beds;
    int doctors;

    public Hospital(String name, int beds, int doctors) {
        this.name = name;
        this.beds = beds;
        this.doctors = doctors;
    }

    public static void main(String[] args) {
        Hospital[] hospitals = {
                new Hospital("Больница 1", 100, 20),
                new Hospital("Больница 2", 250, 30),
                new Hospital("Больница 3", 150, 45),
                new Hospital("Больница 4", 300, 25),
                new Hospital("Больница 5", 200, 50),
                new Hospital("Больница 6", 180, 35)
        };

        Hospital maxBeds = hospitals[0];
        Hospital maxDoctors = hospitals[0];

        for (Hospital hospital : hospitals) {
            if (hospital.beds > maxBeds.beds) {
                maxBeds = hospital;
            }

            if (hospital.doctors > maxDoctors.doctors) {
                maxDoctors = hospital;
            }
        }

        System.out.println("Больше всего коек: " + maxBeds.name);
        System.out.println("Количество коек: " + maxBeds.beds);

        System.out.println("Больше всего врачей: " + maxDoctors.name);
        System.out.println("Количество врачей: " + maxDoctors.doctors);
    }
}