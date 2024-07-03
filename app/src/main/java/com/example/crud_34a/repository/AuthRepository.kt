package com.example.crud_34a.repository

interface AuthRepository {


    fun login(email:String,password:String,callback:(Boolean,String)->Unit)
    fun register(email:String,password:String,callback:(Boolean,String)->Unit)
}