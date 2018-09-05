package com.db.dbproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DbprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbprojectApplication.class, args);
    }}


    //List<Admin> admins = new ArrayList<>();
    //Admin admin1;
    //Admin admin2;
    //Admin admin3;

    //@Override
    /* **************************************************************************************
    public List addAdmin() {

        List<Admin> admins = new ArrayList<>();
       /* Admin admin1 = new Admin(
                "qwrf@ya.ru",
                "zaq",
                Arrays.asList(
                        new User("Petya", "zaq", new Rank("pupil"), LocalDate.of(2010, 1, 01)),
                        new User("Katya", "zaq", new Rank("pupil"), LocalDate.of(2010, 1, 01))
                )
        );*/
        //System.out.println(admin1);
/*   ****************************************************************************
    admins.add(new Admin(
        "qwrf@ya.ru",
        "zaq",
        Arrays.asList(
                new User("Petya", "zaq", new Rank("pupil"), LocalDate.of(2010, 1, 01)),
                new User("Katya", "zaq", new Rank("pupil"), LocalDate.of(2010, 1, 01))
        )
));
       /* Admin admin2 = new Admin(
                "admin2@ya.ru",
                "admin2",
                Arrays.asList(
                        new User("sonadmin2", "sonadmin2", new Rank("student"), LocalDate.of(1994, 8, 23))
                        // new User("Katya","zaq", new Rank("pupil"), LocalDate.of(2010,1,01))
                )
        );

        System.out.println(admin2);*/
 /* ***********************************************************
        admins.add(new Admin(
                "admin2@ya.ru",
                "admin2",
                Arrays.asList(
                        new User("sonadmin2", "sonadmin2", new Rank("student"), LocalDate.of(1994, 8, 23))
                        // new User("Katya","zaq", new Rank("pupil"), LocalDate.of(2010,1,01))
                )
        ));

      /*  Admin admin3 = new Admin(
                "admin3@ya.ru",
                "admin3",
                Arrays.asList(
                        new User("sonadmin3", "sonadmin3", new Rank("baby"), LocalDate.of(2014, 5, 14))
                        //new User("Katya","zaq", new Rank("pupil"), LocalDate.of(2010,1,01))
                )
        );

        System.out.println(admin3);*/
 /* ************************************
        admins.add(new Admin(

                "admin3@ya.ru",
                "admin3",
                Arrays.asList(
                        new User("sonadmin3", "sonadmin3", new Rank("baby"), LocalDate.of(2014, 5, 14))
                        //new User("Katya","zaq", new Rank("pupil"), LocalDate.of(2010,1,01))
                )
        ));
        System.out.println(admins);
        return admins;
    }


        List<Admin> admins = new ArrayList<>();


        @Bean
        CommandLineRunner runnerAdmin(AdminRepository repository){
            return args -> {
                // repository.save(new User("Vasya",LocalDate.of(1990, 12, 30), "Vas12", "123"));
                //  repository.save(new User("Petya", LocalDate.of(1980, 8, 31), "Pet20", "123"));
                admins = addAdmin();
                //users = useraddToList();

                System.out.print(admins);
                for (Admin ad : admins){
                    repository.save(ad);}
                System.out.print("********************"+admins);

            };
        }

        //drop all admins
        //this.adminRepository.deleteAll();

        //add admins to db
        //
        //for (Admin ad : admins){
        //adminRepository.save(admin1);
        //this.adminRepository.save(admin2);
        //this.adminRepository.save(admin3);
        //}






//}*/
