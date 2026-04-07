package services;

import entity.Doctor;
import repository.DoctorDAO;

import java.util.List;

public class DoctorService {

    private DoctorDAO repo = new DoctorDAO();

    public void save(Doctor doctor){
        repo.save(doctor);
    }

    public void update(Doctor doctor){
        repo.update(doctor);
    }

    public Doctor getById(Long employeeId){
        return  repo.getById(employeeId);
    }

    public List<Doctor> getAllDoctors(){
        return repo.findAll();
    }

    public void delete(Long employeeId){
        repo.delete(employeeId);
    }

}
