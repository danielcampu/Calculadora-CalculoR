package com.danielcampu.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private boolean flagisop1=true, flagdecimal=false;
    private String operando1="", operando2="", operaciondisplay="", resultdisplay = "", msjfinal = "", num;
    int operacion;
    EditText eShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eShowResult = findViewById(R.id.eShowResult);

    }

    public void onButtonClicked(View view) {    //If any button is clicked --- everything on the layout is a button

        int id = view.getId();  //Get id

        switch (id){

            //-----------OPERANDOS--------------------------------------------------------------

            case R.id.b0:
                num = "0";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                        operando1 = operando1 + num;  //Concatenar


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b1:
                num = "1";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b2:
                num = "2";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b3:
                num = "3";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b4:
                num = "4";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b5:
                num = "5";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b6:
                num = "6";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b7:
                num = "7";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b8:
                num = "8";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.b9:
                num = "9";
                if(flagisop1){        //Checking if it is the first operand or the second operand

                    operando1 = operando1 + num;


                }else{

                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            //----------------DECIMAL-----------------------------

            case R.id.bPunto:
                num = ".";
                if (flagisop1){
                    operando1 = operando1 + num;
                }else {
                    operando2 = operando2 + num;
                }

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            // ---------------Operaciones----------------------------

            case R.id.bSuma:
                operaciondisplay = "+";
                operacion = 1;


                flagisop1 = false;  // Because the next operator will be the operator 2

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.bMenos:
                operaciondisplay = "-";
                operacion = 2;

                flagisop1 = false;  // Because the next operator will be the operator 2

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.bMultiplicacion:
                operaciondisplay = "*";
                operacion = 3;

                flagisop1 = false;  // Because the next operator will be the operator 2

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            case R.id.bDivision:
                operaciondisplay = "/";
                operacion = 4;

                flagisop1 = false;  // Because the next operator will be the operator 2

                msjfinal = operando1 + operaciondisplay + operando2;

                eShowResult.setText(msjfinal);

                break;

            //--------------------CALCULAR RESULTADO------------------------------------------

            case R.id.bIgual:

                float num1, num2, resultado = 0;

                num1 = Float.valueOf(operando1);
                num2 = Float.valueOf(operando2);

                switch (operacion){

                    case 1:
                        resultado = num1 + num2;
                        break;

                    case 2:
                        resultado = num1 - num2;
                        break;

                    case 3:
                        resultado = num1*num2;
                        break;

                    case 4:
                        resultado = num1/num2;

                }

                //Muestro el mensaje en el text edit

                flagisop1 = true;               //Prepare for operand1 again
                msjfinal = "";       //Clean variable to display the next operation
                operando1 = "";
                operando2 = "";
                operaciondisplay = "";
                resultdisplay = Float.toString(resultado);
                eShowResult.setText(resultdisplay);

                break;


        }
    }
}
