package one.aitec.ble.databinding2

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import one.aitec.ble.databinding2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userModel = UserModel()
        userModel.uName = "Androidian"
        userModel.pwd = "123456"
        mainBinding.userModel = userModel
    }
}
