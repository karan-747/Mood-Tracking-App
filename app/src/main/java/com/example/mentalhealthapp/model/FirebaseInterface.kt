package com.example.mentalhealthapp.model

import androidx.lifecycle.LiveData
import com.example.mentalhealthapp.dataclasses.MoodItem
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

interface FirebaseInterface {


    suspend fun loginWithEmailAndPassword(email:String,password:String):Pair<Boolean,String>
    suspend fun signUpWithEmailAndPassword(email:String,password:String):Pair<Boolean,String>
    suspend fun signInWithGoogle():Pair<Boolean,String>

    fun logoutUser():Unit

    suspend fun signUpWithGoogle(account: GoogleSignInAccount):Pair<Boolean,String>
    fun checkUserStatus(moveToHome: () -> Unit)

    suspend fun addUserMoodItem(userMoodItem: MoodItem) :Pair<Boolean,String>
    suspend fun getTodaysMood():Pair<Boolean,MoodItem?>

    suspend fun updateUserMoodItem(updateMap: HashMap<String,Any>,oldMoodItem: MoodItem):Pair<Boolean,String>

    fun getTheDatabase():Unit

    fun getRecordLiveData(): LiveData<ArrayList<MoodItem>>



}