package edu.notes.hiltapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import edu.notes.hiltapp.databinding.ActivityMainBinding
import edu.notes.hiltapp.model.login_repository.FirebaseLoginRepository
import edu.notes.hiltapp.model.signup_repository.FirebaseSignupRepository
import edu.notes.hiltapp.model.users.UsersRepository
import edu.notes.hiltapp.remote.signup.SignupHandler
import edu.notes.hiltapp.remote.signup.SignupListner
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var countViewModel: CountViewModel
    private lateinit var countText: TextView
    private lateinit var goButton: Button
    private lateinit var mainBinding: ActivityMainBinding
    @Inject
    lateinit var signupHandler: SignupHandler
    @Inject
    lateinit var signupListner: SignupListner
    @Inject
    lateinit var signupRepository: FirebaseSignupRepository
    @Inject
    lateinit var loginRepository: FirebaseLoginRepository
    @Inject
    lateinit var usersRepository: UsersRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        //signupRepository.signup("rana@gmail.com","123456")
        //loginRepository.login("rana@gmail.com","123456")
        lifecycleScope.launch {
            usersRepository.fetchUsers()
        }
        lifecycleScope.launch {
            usersRepository.updateUser("22")
        }
        lifecycleScope.launch {
            usersRepository.deleteUser("23")
        }
//        val user=User("Rana Ahmed","rana@gmail.com","123nls98")
//        mainBinding.user=user
//        countViewModel=ViewModelProvider(this).get(CountViewModel::class.java)
//        goButton=findViewById(R.id.gotoSecond)
//        countText=findViewById(R.id.countText)
//        lifecycleScope.launch {
//          countViewModel.counDownflow.collectLatest {
//              Log.d("MainActivity","The current Flow:- $it")
//          }
//
//        }
//
//        goButton.setOnClickListener {
//            var intent=Intent(this@MainActivity,CounterActivity::class.java)
//            startActivity(intent)
//            finish()
//        }



    }
}