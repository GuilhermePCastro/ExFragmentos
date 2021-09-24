package br.senac.exfragmentos

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.exfragmentos.databinding.ActivityFragmentoBinding

class FragmentoActivity : AppCompatActivity() {

    lateinit var binding: ActivityFragmentoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //teste
        binding.btnAlbum.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.ctnAlbum, AlbumFragment()).commit()

        }
    }
}