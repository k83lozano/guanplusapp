package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//private val TAG = "MainActivity"
private val TEXT = "TEXT_OUTPUT"

class MainActivity : AppCompatActivity() {
    var banderita = false
    private var textResult: TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput1: EditText= findViewById<EditText>(R.id.editTextguan)
        val userInput2: EditText= findViewById<EditText>(R.id.editTexttu)
        val userInput3: EditText= findViewById<EditText>(R.id.editTexttree)

        userInput1.text.clear()
        userInput2.text.clear()
        userInput3.text.clear()

        textResult=findViewById<TextView>(R.id.textView)

        var buttAdd: Button=findViewById<Button>(R.id.button2)
        var buttClean: Button=findViewById<Button>(R.id.button)
        var buttDup: Button=findViewById<Button>(R.id.button3)


        buttAdd?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                if (userInput1.getText().toString().trim().equals("") || userInput2.getText().toString().trim().equals("") || userInput3.getText().toString().trim().equals("")){

                }else{
                    textResult?.append(userInput1?.text)
                    textResult?.append(" + ")
                    textResult?.append(userInput2?.text)
                    textResult?.append(" = ")
                    textResult?.append(userInput3?.text)
                    textResult?.append("\n")
                    userInput1?.text?.clear()
                    userInput2?.text?.clear()
                    userInput3?.text?.clear()
                }
                banderita = true
            }
        })

        buttClean?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                textResult?.text=""
                userInput1?.text?.clear()
                userInput2?.text?.clear()
                userInput3?.text?.clear()
            }
        })

        buttDup?.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?){
                textResult?.append(textResult?.text)
            }

        })

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(TEXT, textResult?.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textResult?.text=savedInstanceState.getString(TEXT)
    }

    }











