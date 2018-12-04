package com.example.f202340.correicaovirtual.others;

import com.google.firebase.auth.FirebaseAuth;

public class AuthClass {

    private static AuthClass instance;

    public static FirebaseAuth auth;

    public static FirebaseAuth getAuth() {
        return auth;
    }

    public static void setAuth(FirebaseAuth auth) {
        AuthClass.auth = auth;
    }

    private AuthClass(){}

    public static AuthClass getInstance(){
        if (instance == null){
            instance = new AuthClass();
        }
        return instance;
    }

}
