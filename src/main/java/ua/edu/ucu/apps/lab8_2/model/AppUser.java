package ua.edu.ucu.apps.lab8_2.model;
import java.time.LocalDate;
import java.time.Period;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="app_user")
@Table

public class AppUser implements User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String email;

    private LocalDate dob;
    @Transient
    private Integer age;

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

    @Override
    public void update(String status) {
        System.out.println("AppUser " + email + " received update: " + status);
    }
}