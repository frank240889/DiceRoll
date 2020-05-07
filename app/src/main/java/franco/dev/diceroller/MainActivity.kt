package franco.dev.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

open class MainActivity : AppCompatActivity() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll"
        rollButton.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random(6).nextInt() + 1
        resultText.text = randomInt.toString()
    }
}
