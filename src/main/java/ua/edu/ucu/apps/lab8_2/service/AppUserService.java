package ua.edu.ucu.apps.lab8_2.service;
import ua.edu.ucu.apps.lab8_2.model.AppUser;
import ua.edu.ucu.apps.lab8_2.repository.AppUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAppUser(){
        return appUserRepository.findAll();
    }

    public AppUser createAppUser(AppUser appUser){
        return appUserRepository.save(appUser);
    }

    public AppUser getUserByEmail(String email){
        return appUserRepository.findUserByEmail(email);
    }
}