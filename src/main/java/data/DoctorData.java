package data;
import entity.Doctor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DoctorData {
    public static List<Doctor> getInitialDoctors(){
        ArrayList<Doctor> doctors = new ArrayList<>();
        // 1.
        doctors.add(new Doctor("Lucía", "Méndez", "Femenino",
            LocalDate.of(1985, 5, 20), "Av. Cazón 123", "Tigre",
            "lucia.mendez@hospital.com", "1144556677"));
        //2.
        doctors.add(new Doctor("Marcos", "Gómez", "Masculino",
            LocalDate.of(1978, 11, 12), "Calle Italia 456", "Tigre",
            "mgomez_med@example.com", "1199887766"));
        //3.
        doctors.add(new Doctor("Elena", "Russo", "Femenino",
            LocalDate.of(1992, 3, 8), "Paseo Victorica 789",
            "Tigre", "erusso.md@gmail.com", "1122334455"));
        //4.
        doctors.add(new Doctor("Julián", "Sánchez", "Masculino",
            LocalDate.of(1980, 7, 25), "Av. Libertador 2010",
            "San Fernando", "jsanchez@medicos.ar", "1133445566"));
        //5.
        doctors.add(new Doctor("Sofía", "Martínez", "Femenino",
            LocalDate.of(1988, 12, 30), "Belgrano 550",
            "San Isidro", "sofia.martinez@clinic.com", "1166778899"));
        //6.
        doctors.add(new Doctor("Ricardo", "López", "Masculino",
            LocalDate.of(1975, 1, 15), "Constitución 300",
            "Victoria", "rlopez@health.com", "1155664433"));
        //7.
        doctors.add(new Doctor("Valeria", "Paz", "Femenino",
            LocalDate.of(1995, 9, 5), "Alvear 1200",
            "Martínez", "valeria.paz@hospital.it", "1144332211"));
        //8.
        doctors.add(new Doctor("Andrés", "Castro", "Masculino",
            LocalDate.of(1983, 6, 18), "Las Heras 45",
            "Tigre", "acastro.trauma@example.com", "1177885522"));
        //9.
        doctors.add(new Doctor("Mariana", "Ortega", "Femenino",
            LocalDate.of(1990, 4, 22), "Sarmiento 900",
            "San Fernando", "m.ortega@doc.com", "1188991122"));
        //10.
        doctors.add(new Doctor("Esteban", "Ríos", "Masculino",
            LocalDate.of(1987, 8, 10), "Boulevard de Todos los Santos 100",
            "Nordelta", "erios@medicalcenter.com", "1122993388"));
        // 11 .
        doctors.add(new Doctor("Carlos","Zubilete", "Masculino",
            LocalDate.of(2007,12,3),
            "Calle Falsa 123","Buenos Aires" ,"carlos.zuvilete@example.com" , "1122334455"));

        return doctors;
    }
}
