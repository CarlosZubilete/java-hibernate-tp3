package project;
import config.HibernateUtil;
import data.DoctorData;
import entity.Doctor;
import services.DoctorService;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        DoctorService doctorService = new DoctorService();
        /*
        List<Doctor> listDoc = DoctorData.getInitialDoctors();
        for (Doctor doc : listDoc){
            doctorService.save(doc);
        }
        */
        // * Update :
        Doctor docUpdate = doctorService.getById(11L);
        docUpdate.setLastName("Update LAST NAME");
        doctorService.update(docUpdate);

        // * Delete :
        doctorService.delete(5L);

        // * GET ALL DOCTORS:
        List<Doctor> doctors = doctorService.getAllDoctors();

        for (Doctor doc : doctors) {
            System.out.println(doc);
        }

        HibernateUtil.shutdown();

    }
}

/*
// Another way to send data to the DB:
for (int i = 0 ; i < listDoc.size() ; i++){
    Doctor doc = listDoc.get(i);
    doctorService.save(doc);
}
* */
















