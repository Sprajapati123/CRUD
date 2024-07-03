package com.example.crud_34a.repository

import com.google.firebase.auth.FirebaseAuth

class AuthRepoImpl : AuthRepository {
    var auth : FirebaseAuth = FirebaseAuth.getInstance()
    override fun login(
        email: String,
        password: String,
        callback: (Boolean, String) -> Unit
    ) {
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Login success")
            }else{
                callback(true,"Login success")

            }
        }
    }

    override fun register(email: String, password: String, callback: (Boolean, String) -> Unit) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"Login success")
            }else{
                callback(true,"Login success")

            }
        }

    }
}