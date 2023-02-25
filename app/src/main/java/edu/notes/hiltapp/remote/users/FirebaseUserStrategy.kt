package edu.notes.hiltapp.remote.users

import javax.inject.Inject

class FirebaseUserStrategy @Inject constructor(
    private val userListner: UserListner
) : UserStrategy {
    override fun fetchUsers() {
        userListner.onSuccess("user fetching successfully")
    }

    override fun updateUser(id: String) {
        if(!id.equals("") ){
            userListner.onSuccess("user updated")
        }else{
            userListner.failure("user not updated")
        }
    }

    override fun deleteUser(id: String) {
        if(!id.equals("") ){
            userListner.onSuccess("user deleted")
        }else{
            userListner.failure("user not deleted")
        }
    }
}