package repository;

import entity.Doctor;

public class DoctorDAO extends GenericDAO<Doctor>{
    public DoctorDAO(){
        super(Doctor.class);
    }
}
